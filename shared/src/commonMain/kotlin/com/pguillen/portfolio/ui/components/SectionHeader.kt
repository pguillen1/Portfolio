package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun SectionHeader(
	title: String,
	subtitle: String,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier.widthIn(max = 760.dp)
	) {
		Text(
			text = title,
			style = PortfolioTheme.typography.sectionTitle,
			color = PortfolioTheme.colors.textPrimary
		)

		Text(
			text = subtitle,
			style = PortfolioTheme.typography.body,
			color = PortfolioTheme.colors.textSecondary
		)
	}
}