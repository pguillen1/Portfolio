package com.pguillen.portfolio.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class PortfolioTypography(
	val heroTitle: TextStyle,
	val sectionTitle: TextStyle,
	val cardTitle: TextStyle,
	val body: TextStyle,
	val bodySmall: TextStyle,
	val label: TextStyle
)

val DefaultPortfolioTypography = PortfolioTypography(
	heroTitle = TextStyle(
		fontFamily = FontFamily.SansSerif,
		fontSize = 40.sp,
		lineHeight = 48.sp,
		fontWeight = FontWeight.Bold
	),
	sectionTitle = TextStyle(
		fontFamily = FontFamily.SansSerif,
		fontSize = 24.sp,
		lineHeight = 32.sp,
		fontWeight = FontWeight.Bold
	),
	cardTitle = TextStyle(
		fontFamily = FontFamily.SansSerif,
		fontSize = 20.sp,
		lineHeight = 28.sp,
		fontWeight = FontWeight.SemiBold
	),
	body = TextStyle(
		fontFamily = FontFamily.SansSerif,
		fontSize = 16.sp,
		lineHeight = 24.sp,
		fontWeight = FontWeight.Normal
	),
	bodySmall = TextStyle(
		fontFamily = FontFamily.SansSerif,
		fontSize = 14.sp,
		lineHeight = 20.sp,
		fontWeight = FontWeight.Normal
	),
	label = TextStyle(
		fontFamily = FontFamily.SansSerif,
		fontSize = 13.sp,
		lineHeight = 18.sp,
		fontWeight = FontWeight.Medium
	)
)