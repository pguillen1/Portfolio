package com.pguillen.portfolio.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.data.portfolioExperience
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.model.ExperienceItem
import com.pguillen.portfolio.ui.components.SectionHeader
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun ExperienceSection(
	strings: PortfolioStrings,
	language: AppLanguage,
	experienceItems: List<ExperienceItem> = portfolioExperience,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.verticalScroll(rememberScrollState())
			.padding(horizontal = 40.dp, vertical = 32.dp),
		verticalArrangement = Arrangement.spacedBy(28.dp)
	) {
		SectionHeader(
			title = strings.experienceTitle,
			subtitle = strings.experienceSubtitle
		)

		Column(
			verticalArrangement = Arrangement.spacedBy(18.dp)
		) {
			experienceItems.forEachIndexed { index, item ->
				ExperienceCard(
					item = item,
					language = language,
					strings = strings,
					showTimelineLine = index != experienceItems.lastIndex,
					modifier = Modifier.fillMaxWidth()
				)
			}
		}
	}
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ExperienceCard(
	item: ExperienceItem,
	language: AppLanguage,
	strings: PortfolioStrings,
	showTimelineLine: Boolean,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier,
		horizontalArrangement = Arrangement.spacedBy(18.dp)
	) {
		ExperienceTimelineMarker(
			showLine = showTimelineLine
		)

		Column(
			modifier = Modifier
				.weight(1f)
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
			ExperienceHeader(
				item = item,
				language = language
			)

			Text(
				text = item.description.value(language),
				style = PortfolioTheme.typography.bodySmall,
				color = PortfolioTheme.colors.textSecondary
			)

			ExperienceBullets(
				title = strings.experienceHighlights,
				bullets = item.bullets.map { it.value(language) }
			)

			FlowRow(
				horizontalArrangement = Arrangement.spacedBy(10.dp),
				verticalArrangement = Arrangement.spacedBy(10.dp)
			) {
				item.tags.forEach { tag ->
					TechBadge(text = tag)
				}
			}
		}
	}
}

@Composable
private fun ExperienceTimelineMarker(
	showLine: Boolean,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier.fillMaxHeight(),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		androidx.compose.foundation.layout.Box(
			modifier = Modifier
				.size(14.dp)
				.clip(CircleShape)
				.background(PortfolioTheme.colors.accent)
		)

		if (showLine) {
			Spacer(
				modifier = Modifier
					.size(width = 2.dp, height = 160.dp)
					.background(PortfolioTheme.colors.border)
			)
		}
	}
}

@Composable
private fun ExperienceHeader(
	item: ExperienceItem,
	language: AppLanguage,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier,
		verticalArrangement = Arrangement.spacedBy(6.dp)
	) {
		Text(
			text = item.period.value(language),
			style = PortfolioTheme.typography.label,
			color = PortfolioTheme.colors.accent
		)

		Text(
			text = item.title.value(language),
			style = PortfolioTheme.typography.cardTitle,
			color = PortfolioTheme.colors.textPrimary
		)

		Text(
			text = item.subtitle.value(language),
			style = PortfolioTheme.typography.bodySmall,
			color = PortfolioTheme.colors.textSecondary
		)
	}
}

@Composable
private fun ExperienceBullets(
	title: String,
	bullets: List<String>,
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
			bullets.forEach { bullet ->
				Text(
					text = "• $bullet",
					style = PortfolioTheme.typography.bodySmall,
					color = PortfolioTheme.colors.textSecondary
				)
			}
		}
	}
}