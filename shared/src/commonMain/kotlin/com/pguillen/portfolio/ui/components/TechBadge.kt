package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.ui.theme.PortfolioTheme

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