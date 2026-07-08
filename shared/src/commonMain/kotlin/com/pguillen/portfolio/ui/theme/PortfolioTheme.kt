package com.pguillen.portfolio.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalPortfolioColors = staticCompositionLocalOf {
	LightPortfolioColors
}

private val LocalPortfolioTypography = staticCompositionLocalOf {
	DefaultPortfolioTypography
}

object PortfolioTheme {

	val colors: PortfolioColors
		@Composable
		@ReadOnlyComposable
		get() = LocalPortfolioColors.current

	val typography: PortfolioTypography
		@Composable
		@ReadOnlyComposable
		get() = LocalPortfolioTypography.current
}

@Composable
fun PortfolioThemeProvider(
	darkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit
) {
	val portfolioColors = if (darkTheme) {
		DarkPortfolioColors
	} else {
		LightPortfolioColors
	}

	val materialColorScheme = if (darkTheme) {
		darkColorScheme(
			primary = portfolioColors.accent,
			background = portfolioColors.background,
			surface = portfolioColors.surface,
			onPrimary = portfolioColors.onAccent,
			onBackground = portfolioColors.textPrimary,
			onSurface = portfolioColors.textPrimary
		)
	} else {
		lightColorScheme(
			primary = portfolioColors.accent,
			background = portfolioColors.background,
			surface = portfolioColors.surface,
			onPrimary = portfolioColors.onAccent,
			onBackground = portfolioColors.textPrimary,
			onSurface = portfolioColors.textPrimary
		)
	}

	CompositionLocalProvider(
		LocalPortfolioColors provides portfolioColors,
		LocalPortfolioTypography provides DefaultPortfolioTypography
	) {
		MaterialTheme(
			colorScheme = materialColorScheme,
			content = content
		)
	}
}