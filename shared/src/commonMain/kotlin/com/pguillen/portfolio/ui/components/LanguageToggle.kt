package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun LanguageToggle(
	language: AppLanguage,
	onLanguageChange: (AppLanguage) -> Unit,
	modifier: Modifier = Modifier
) {
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
			.padding(3.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		LanguageOption(
			text = "EN",
			selected = language == AppLanguage.EN,
			onClick = { onLanguageChange(AppLanguage.EN) }
		)

		LanguageOption(
			text = "ES",
			selected = language == AppLanguage.ES,
			onClick = { onLanguageChange(AppLanguage.ES) }
		)
	}
}

@Composable
private fun LanguageOption(
	text: String,
	selected: Boolean,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	val backgroundColor = if (selected) {
		PortfolioTheme.colors.accent
	}
	else {
		PortfolioTheme.colors.surface
	}

	val textColor = if (selected) {
		PortfolioTheme.colors.onAccent
	}
	else {
		PortfolioTheme.colors.textSecondary
	}

	Box(
		modifier = modifier
			.fillMaxHeight()
			.clip(RoundedCornerShape(999.dp))
			.background(backgroundColor)
			.clickable(onClick = onClick)
			.padding(horizontal = 14.dp),
		contentAlignment = Alignment.Center
	) {
		Text(
			text = text,
			style = PortfolioTheme.typography.label.copy(
				fontWeight = FontWeight.SemiBold
			),
			color = textColor
		)
	}
}