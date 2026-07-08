package com.pguillen.portfolio.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.data.portfolioSkills
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.model.SkillCategory
import com.pguillen.portfolio.ui.components.SectionHeader
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun StackSection(
	strings: PortfolioStrings,
	language: AppLanguage,
	skills: List<SkillCategory> = portfolioSkills,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.verticalScroll(rememberScrollState())
			.padding(horizontal = 40.dp, vertical = 32.dp),
		verticalArrangement = Arrangement.spacedBy(28.dp)
	) {
		SectionHeader(
			title = strings.stackTitle,
			subtitle = strings.stackSubtitle
		)

		Column(
			verticalArrangement = Arrangement.spacedBy(18.dp)
		) {
			skills.forEach { category ->
				SkillCategoryCard(
					category = category,
					language = language,
					modifier = Modifier.fillMaxWidth()
				)
			}
		}
	}
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun SkillCategoryCard(
	category: SkillCategory,
	language: AppLanguage,
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
		Column(
			verticalArrangement = Arrangement.spacedBy(6.dp)
		) {
			Text(
				text = category.title,
				style = PortfolioTheme.typography.cardTitle,
				color = PortfolioTheme.colors.textPrimary
			)

			Text(
				text = category.description.value(language),
				style = PortfolioTheme.typography.bodySmall,
				color = PortfolioTheme.colors.textSecondary
			)
		}

		FlowRow(
			horizontalArrangement = Arrangement.spacedBy(10.dp),
			verticalArrangement = Arrangement.spacedBy(10.dp)
		) {
			category.skills.forEach { skill ->
				TechBadge(text = skill)
			}
		}
	}
}