package com.pguillen.portfolio.ui.sections

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun HomeSection(
	strings: PortfolioStrings,
	onProjectsClick: () -> Unit,
	onCvClick: () -> Unit,
	onContactClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.verticalScroll(rememberScrollState())
			.padding(horizontal = 40.dp, vertical = 32.dp),
		verticalArrangement = Arrangement.spacedBy(32.dp)
	) {
		HomeHero(
			strings = strings,
			onProjectsClick = onProjectsClick,
			onCvClick = onCvClick,
			onContactClick = onContactClick
		)

		HomeSummaryCards(strings = strings)

		HomeStackPreview(strings = strings)
	}
}

@Composable
private fun HomeHero(
	strings: PortfolioStrings,
	onProjectsClick: () -> Unit,
	onCvClick: () -> Unit,
	onContactClick: () -> Unit,
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
			.padding(36.dp),
		verticalArrangement = Arrangement.spacedBy(24.dp)
	) {
		Text(
			text = strings.homeEyebrow,
			style = PortfolioTheme.typography.label,
			color = PortfolioTheme.colors.accent
		)

		Text(
			text = strings.heroTitle,
			style = PortfolioTheme.typography.heroTitle,
			color = PortfolioTheme.colors.textPrimary,
			modifier = Modifier.widthIn(max = 780.dp)
		)

		Text(
			text = strings.heroSubtitle,
			style = PortfolioTheme.typography.body,
			color = PortfolioTheme.colors.textSecondary,
			modifier = Modifier.widthIn(max = 720.dp)
		)

		Row(
			horizontalArrangement = Arrangement.spacedBy(12.dp)
		) {
			PrimaryHomeButton(
				text = strings.viewProjects,
				onClick = onProjectsClick
			)

			SecondaryHomeButton(
				text = strings.downloadCv,
				onClick = onCvClick
			)

			SecondaryHomeButton(
				text = strings.contact,
				onClick = onContactClick
			)
		}
	}
}

@Composable
private fun HomeSummaryCards(
	strings: PortfolioStrings,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier.fillMaxWidth(),
		horizontalArrangement = Arrangement.spacedBy(20.dp)
	) {
		HomeSummaryCard(
			title = strings.androidAppsTitle,
			description = strings.androidAppsDescription,
			modifier = Modifier.weight(1f)
		)

		HomeSummaryCard(
			title = strings.kmpDemosTitle,
			description = strings.kmpDemosDescription,
			modifier = Modifier.weight(1f)
		)

		HomeSummaryCard(
			title = strings.qaMindsetTitle,
			description = strings.qaMindsetDescription,
			modifier = Modifier.weight(1f)
		)
	}
}

@Composable
private fun HomeSummaryCard(
	title: String,
	description: String,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.background(
				color = PortfolioTheme.colors.surface,
				shape = RoundedCornerShape(22.dp)
			)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border,
				shape = RoundedCornerShape(22.dp)
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
private fun HomeStackPreview(
	strings: PortfolioStrings,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.fillMaxWidth()
			.background(
				color = PortfolioTheme.colors.surface,
				shape = RoundedCornerShape(24.dp)
			)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border,
				shape = RoundedCornerShape(24.dp)
			)
			.padding(28.dp),
		verticalArrangement = Arrangement.spacedBy(18.dp)
	) {
		Text(
			text = strings.homeStackTitle,
			style = PortfolioTheme.typography.sectionTitle,
			color = PortfolioTheme.colors.textPrimary
		)

		Text(
			text = strings.homeStackDescription,
			style = PortfolioTheme.typography.bodySmall,
			color = PortfolioTheme.colors.textSecondary
		)

		FlowRow(
			horizontalArrangement = Arrangement.spacedBy(10.dp),
			verticalArrangement = Arrangement.spacedBy(10.dp)
		) {
			val stack = listOf(
				"Kotlin",
				"Jetpack Compose",
				"Kotlin Multiplatform",
				"Compose Multiplatform",
				"Clean Architecture",
				"StateFlow",
				"SQLDelight",
				"DataStore",
				"Testing",
				"GitHub Actions"
			)

			stack.forEach { tech ->
				TechBadge(text = tech)
			}
		}
	}
}

@Composable
private fun PrimaryHomeButton(
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
private fun SecondaryHomeButton(
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

@Composable
fun TechBadge(
	text: String,
	modifier: Modifier = Modifier
) {
	Box(
		modifier = modifier
			.background(
				color = PortfolioTheme.colors.accentSoft,
				shape = RoundedCornerShape(999.dp)
			)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.accent.copy(alpha = 0.25f),
				shape = RoundedCornerShape(999.dp)
			)
			.padding(horizontal = 12.dp, vertical = 7.dp)
	) {
		Text(
			text = text,
			style = PortfolioTheme.typography.label,
			color = PortfolioTheme.colors.accent
		)
	}
}