package com.pguillen.portfolio.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
internal fun SectionLabel(
	text: String,
	modifier: Modifier = Modifier
) {
	Text(
		text = text,
		style = PortfolioTheme.typography.label,
		color = PortfolioTheme.colors.accent,
		modifier = modifier
	)
}