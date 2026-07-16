package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.model.Project
import com.pguillen.portfolio.ui.theme.PortfolioTheme
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProjectCard(
	project: Project,
	language: AppLanguage,
	strings: PortfolioStrings,
	featured: Boolean,
	onDemoClick: () -> Unit,
	onGithubClick: () -> Unit,
	onPolicyClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	if (featured) {
		FeaturedProjectCard(
			project = project,
			language = language,
			strings = strings,
			onDemoClick = onDemoClick,
			onGithubClick = onGithubClick,
			onPolicyClick = onPolicyClick,
			modifier = modifier
		)
	}
	else {
		CompactProjectCard(
			project = project,
			language = language,
			strings = strings,
			onDemoClick = onDemoClick,
			onGithubClick = onGithubClick,
			onPolicyClick = onPolicyClick,
			modifier = modifier
		)
	}
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun FeaturedProjectCard(
	project: Project,
	language: AppLanguage,
	strings: PortfolioStrings,
	onDemoClick: () -> Unit,
	onGithubClick: () -> Unit,
	onPolicyClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.background(
				color = PortfolioTheme.colors.surface,
				shape = RoundedCornerShape(28.dp)
			)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border,
				shape = RoundedCornerShape(28.dp)
			)
			.padding(28.dp),
		horizontalArrangement = Arrangement.spacedBy(28.dp)
	) {
		ProjectPreviewPlaceholder(
			title = project.title,
			modifier = Modifier
				.weight(0.9f)
				.height(300.dp),
			previewImages = project.previewImages
		)

		Column(
			modifier = Modifier
				.weight(1.1f),
			verticalArrangement = Arrangement.spacedBy(16.dp)
		) {
			ProjectTitleBlock(
				project = project,
				language = language
			)

			Text(
				text = project.description.value(language),
				style = PortfolioTheme.typography.body,
				color = PortfolioTheme.colors.textSecondary,
				modifier = Modifier.widthIn(max = 560.dp)
			)

			FlowRow(
				horizontalArrangement = Arrangement.spacedBy(8.dp),
				verticalArrangement = Arrangement.spacedBy(8.dp)
			) {
				project.stack.forEach { tech ->
					TechBadge(text = tech)
				}
			}

			ProjectHighlights(
				title = strings.highlights,
				highlights = project.highlights.map { it.value(language) }
			)

			ProjectActions(
				strings = strings,
				hasDemo = project.demoUrl.isNotEmpty(),
				hasGithub = project.githubUrl.isNotEmpty(),
				hasPolicy = project.policyUrl.isNotEmpty(),
				onDemoClick = onDemoClick,
				onGithubClick = onGithubClick,
				onPolicyClick = onPolicyClick
			)
		}
	}
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun CompactProjectCard(
	project: Project,
	language: AppLanguage,
	strings: PortfolioStrings,
	onDemoClick: () -> Unit,
	onGithubClick: () -> Unit,
	onPolicyClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.background(
				color = PortfolioTheme.colors.surface,
				shape = RoundedCornerShape(24.dp)
			)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border,
				shape = RoundedCornerShape(24.dp)
			)
			.padding(24.dp),
		verticalArrangement = Arrangement.spacedBy(16.dp)
	) {
		ProjectTitleBlock(
			project = project,
			language = language
		)

		Text(
			text = project.description.value(language),
			style = PortfolioTheme.typography.bodySmall,
			color = PortfolioTheme.colors.textSecondary
		)

		FlowRow(
			horizontalArrangement = Arrangement.spacedBy(8.dp),
			verticalArrangement = Arrangement.spacedBy(8.dp)
		) {
			project.stack.forEach { tech ->
				TechBadge(text = tech)
			}
		}

		ProjectHighlights(
			title = strings.highlights,
			highlights = project.highlights.map { it.value(language) }
		)

		ProjectActions(
			strings = strings,
			hasDemo = project.demoUrl.isNotEmpty(),
			hasGithub = project.githubUrl.isNotEmpty(),
			hasPolicy = project.policyUrl.isNotEmpty(),
			onDemoClick = onDemoClick,
			onGithubClick = onGithubClick,
			onPolicyClick = onPolicyClick
		)
	}
}

@Composable
private fun ProjectTitleBlock(
	project: Project,
	language: AppLanguage,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier,
		verticalArrangement = Arrangement.spacedBy(4.dp)
	) {
		Text(
			text = project.title,
			style = PortfolioTheme.typography.cardTitle,
			color = PortfolioTheme.colors.textPrimary
		)

		Text(
			text = project.subtitle.value(language),
			style = PortfolioTheme.typography.bodySmall.copy(
				fontWeight = FontWeight.Medium
			),
			color = PortfolioTheme.colors.accent
		)
	}
}

@Composable
private fun ProjectHighlights(
	title: String,
	highlights: List<String>,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier,
		verticalArrangement = Arrangement.spacedBy(8.dp)
	) {
		Text(
			text = title,
			style = PortfolioTheme.typography.label,
			color = PortfolioTheme.colors.textPrimary
		)

		Column(
			verticalArrangement = Arrangement.spacedBy(6.dp)
		) {
			highlights.forEach { highlight ->
				Text(
					text = "• $highlight",
					style = PortfolioTheme.typography.bodySmall,
					color = PortfolioTheme.colors.textSecondary
				)
			}
		}
	}
}

@Composable
private fun ProjectActions(
	strings: PortfolioStrings,
	hasDemo: Boolean,
	hasGithub: Boolean,
	hasPolicy: Boolean,
	onDemoClick: () -> Unit,
	onGithubClick: () -> Unit,
	onPolicyClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier,
		horizontalArrangement = Arrangement.spacedBy(10.dp)
	) {
		if (hasDemo) {
			ProjectPrimaryButton(
				text = strings.demoWeb,
				onClick = onDemoClick
			)
		}

		if (hasGithub) {
			ProjectSecondaryButton(
				text = strings.github,
				onClick = onGithubClick
			)
		}

		if (hasPolicy) {
			ProjectSecondaryButton(
				text = strings.privacyPolicy,
				onClick = onPolicyClick
			)
		}
	}
}

@Composable
private fun ProjectPrimaryButton(
	text: String,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Button(
		onClick = onClick,
		modifier = modifier.height(42.dp),
		shape = RoundedCornerShape(12.dp),
		colors = ButtonDefaults.buttonColors(
			containerColor = PortfolioTheme.colors.accent,
			contentColor = PortfolioTheme.colors.onAccent
		)
	) {
		Text(
			text = text,
			style = PortfolioTheme.typography.label
		)
	}
}

@Composable
private fun ProjectSecondaryButton(
	text: String,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	OutlinedButton(
		onClick = onClick,
		modifier = modifier.height(42.dp),
		shape = RoundedCornerShape(12.dp),
		border = BorderStroke(
			width = 1.dp,
			color = PortfolioTheme.colors.border
		),
		colors = ButtonDefaults.outlinedButtonColors(
			containerColor = PortfolioTheme.colors.surface,
			contentColor = PortfolioTheme.colors.textPrimary
		)
	) {
		Text(
			text = text,
			style = PortfolioTheme.typography.label
		)
	}
}

@Composable
private fun ProjectPreviewPlaceholder(
	title: String,
	previewImages: List<DrawableResource>? = null,
	modifier: Modifier = Modifier
) {
	Box(
		modifier = modifier
			.background(
				color = PortfolioTheme.colors.accentSoft,
				shape = RoundedCornerShape(24.dp)
			)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border,
				shape = RoundedCornerShape(24.dp)
			)
			.padding(24.dp),
		contentAlignment = Alignment.Center
	) {
		Column(
			verticalArrangement = Arrangement.spacedBy(12.dp),
			horizontalAlignment = Alignment.CenterHorizontally
		) {
//			Box(
//				modifier = Modifier
//					.width(120.dp)
//					.height(220.dp)
//					.background(
//						color = PortfolioTheme.colors.surface,
//						shape = RoundedCornerShape(24.dp)
//					)
//					.border(
//						width = 1.dp,
//						color = PortfolioTheme.colors.border,
//						shape = RoundedCornerShape(24.dp)
//					),
//				contentAlignment = Alignment.Center
//			) {
			Row(
				modifier = Modifier.fillMaxWidth(),
				verticalAlignment = Alignment.CenterVertically,
				horizontalArrangement = Arrangement.SpaceEvenly
			) {
				previewImages?.forEach { image ->
					Image(
						painter = painterResource(image),
						contentDescription = null
					)
				}
			}
//			}

			Text(
				text = title,
				style = PortfolioTheme.typography.label,
				color = PortfolioTheme.colors.accent
			)
		}
	}
}