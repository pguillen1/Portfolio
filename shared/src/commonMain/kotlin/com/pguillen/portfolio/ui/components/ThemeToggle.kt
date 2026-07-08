package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun ThemeToggle(
	isDarkTheme: Boolean,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	val text = if (isDarkTheme) {
		"Dark"
	}
	else {
		"Light"
	}

	val icon = if (isDarkTheme) {
		"🌙"
	}
	else {
		"☀️"
	}

	Row(
		modifier = modifier
			.height(38.dp)
			.clip(RoundedCornerShape(999.dp))
			.background(PortfolioTheme.colors.surface)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border,
				shape = RoundedCornerShape(999.dp)
			)
			.clickable(onClick = onClick)
			.padding(horizontal = 14.dp),
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.spacedBy(8.dp)
	) {
		Text(
			text = icon,
			style = PortfolioTheme.typography.label
		)

		Text(
			text = text,
			style = PortfolioTheme.typography.label.copy(
				fontWeight = FontWeight.SemiBold
			),
			color = PortfolioTheme.colors.textPrimary
		)
	}
}