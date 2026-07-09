package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun PortfolioTopBar(
	strings: PortfolioStrings,
	language: AppLanguage,
	isDarkTheme: Boolean,
	onLanguageChange: (AppLanguage) -> Unit,
	onThemeClick: (Boolean) -> Unit,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.height(72.dp)
			.background(PortfolioTheme.colors.background)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border
			)
			.padding(horizontal = 40.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		Text(
			text = strings.greeting,
			style = PortfolioTheme.typography.bodySmall.copy(
				fontWeight = FontWeight.SemiBold
			),
			color = PortfolioTheme.colors.textPrimary
		)

		Spacer(modifier = Modifier.weight(1f))

		LanguageToggle(
			language = language,
			onLanguageChange = onLanguageChange
		)

		Spacer(modifier = Modifier.width(16.dp))

		ThemeToggle(
			isDarkTheme = isDarkTheme,
			onThemeSelected = onThemeClick
		)
	}
}