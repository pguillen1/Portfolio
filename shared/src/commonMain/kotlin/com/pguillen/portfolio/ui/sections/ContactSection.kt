package com.pguillen.portfolio.ui.sections

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.ui.components.SectionHeader
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun ContactSection(
	strings: PortfolioStrings,
	language: AppLanguage,
	modifier: Modifier = Modifier
) {
	val uriHandler = LocalUriHandler.current

	val email = "pedro.guillen55@gmail.com"
	val githubUrl = "https://github.com/TU_USUARIO"
	val linkedInUrl = "https://www.linkedin.com/in/TU_USUARIO"
	val cvUrl = "/cv/pedro-guillen-cv.pdf"

	Column(
		modifier = modifier
			.verticalScroll(rememberScrollState())
			.padding(horizontal = 40.dp, vertical = 32.dp),
		verticalArrangement = Arrangement.spacedBy(28.dp)
	) {
		SectionHeader(
			title = strings.contactTitle,
			subtitle = strings.contactSubtitle
		)

		ContactIntroCard(
			strings = strings,
			email = email,
			onEmailClick = {
				uriHandler.openUri("mailto:$email")
			},
			onGithubClick = {
				uriHandler.openUri(githubUrl)
			},
			onLinkedInClick = {
				uriHandler.openUri(linkedInUrl)
			},
			onCvClick = {
				uriHandler.openUri(cvUrl)
			}
		)

		ContactInfoGrid(
			strings = strings,
			language = language
		)
	}
}

@Composable
private fun ContactIntroCard(
	strings: PortfolioStrings,
	email: String,
	onEmailClick: () -> Unit,
	onGithubClick: () -> Unit,
	onLinkedInClick: () -> Unit,
	onCvClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Column(
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
			.padding(32.dp),
		verticalArrangement = Arrangement.spacedBy(20.dp)
	) {
		Column(
			verticalArrangement = Arrangement.spacedBy(8.dp)
		) {
			Text(
				text = strings.contactIntroTitle,
				style = PortfolioTheme.typography.sectionTitle,
				color = PortfolioTheme.colors.textPrimary
			)

			Text(
				text = strings.contactIntroDescription,
				style = PortfolioTheme.typography.body,
				color = PortfolioTheme.colors.textSecondary,
				modifier = Modifier.widthIn(max = 760.dp)
			)
		}

		Text(
			text = email,
			style = PortfolioTheme.typography.bodySmall.copy(
				fontWeight = FontWeight.SemiBold
			),
			color = PortfolioTheme.colors.accent
		)

		Row(
			horizontalArrangement = Arrangement.spacedBy(12.dp)
		) {
			PrimaryContactButton(
				text = strings.emailLabel,
				onClick = onEmailClick
			)

			SecondaryContactButton(
				text = strings.githubLabel,
				onClick = onGithubClick
			)

			SecondaryContactButton(
				text = strings.linkedInLabel,
				onClick = onLinkedInClick
			)

			SecondaryContactButton(
				text = strings.downloadCvLabel,
				onClick = onCvClick
			)
		}
	}
}

@Composable
private fun ContactInfoGrid(
	strings: PortfolioStrings,
	language: AppLanguage,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier.fillMaxWidth(),
		horizontalArrangement = Arrangement.spacedBy(20.dp)
	) {
		ContactInfoCard(
			title = strings.availabilityTitle,
			description = strings.availabilityDescription,
			modifier = Modifier.weight(1f)
		)

		RolesCard(
			strings = strings,
			language = language,
			modifier = Modifier.weight(1f)
		)
	}
}

@Composable
private fun ContactInfoCard(
	title: String,
	description: String,
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
		verticalArrangement = Arrangement.spacedBy(10.dp)
	) {
		Text(
			text = title,
			style = PortfolioTheme.typography.cardTitle,
			color = PortfolioTheme.colors.textPrimary
		)

		Text(
			text = description,
			style = PortfolioTheme.typography.bodySmall,
			color = PortfolioTheme.colors.textSecondary
		)
	}
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun RolesCard(
	strings: PortfolioStrings,
	language: AppLanguage,
	modifier: Modifier = Modifier
) {
	val roles = when (language) {
		AppLanguage.EN -> listOf(
			"Junior Android Developer",
			"Kotlin Developer",
			"Android/KMP Internship",
			"Mobile QA / QA Automation"
		)

		AppLanguage.ES -> listOf(
			"Junior Android Developer",
			"Kotlin Developer",
			"Prácticas Android/KMP",
			"Mobile QA / QA Automation"
		)
	}

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
		Text(
			text = strings.rolesTitle,
			style = PortfolioTheme.typography.cardTitle,
			color = PortfolioTheme.colors.textPrimary
		)

		FlowRow(
			horizontalArrangement = Arrangement.spacedBy(10.dp),
			verticalArrangement = Arrangement.spacedBy(10.dp)
		) {
			roles.forEach { role ->
				TechBadge(text = role)
			}
		}
	}
}

@Composable
private fun PrimaryContactButton(
	text: String,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Button(
		onClick = onClick,
		modifier = modifier.height(44.dp),
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
private fun SecondaryContactButton(
	text: String,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	OutlinedButton(
		onClick = onClick,
		modifier = modifier.height(44.dp),
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