package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.ui.theme.PortfolioTheme
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.vectorResource
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.dark_mode
import portfolio.shared.generated.resources.light_mode

//@Composable
//fun ThemeToggle(
//	isDarkTheme: Boolean,
//	onClick: () -> Unit,
//	modifier: Modifier = Modifier
//) {
//	val text = if (isDarkTheme) {
//		"Dark"
//	}
//	else {
//		"Light"
//	}
//
//	val icon = if (isDarkTheme) {
//		"🌙"
//	}
//	else {
//		"☀️"
//	}
//
//	Row(
//		modifier = modifier
//			.height(38.dp)
//			.clip(RoundedCornerShape(999.dp))
//			.background(PortfolioTheme.colors.surface)
//			.border(
//				width = 1.dp,
//				color = PortfolioTheme.colors.border,
//				shape = RoundedCornerShape(999.dp)
//			)
//			.clickable(onClick = onClick)
//			.padding(horizontal = 14.dp),
//		verticalAlignment = Alignment.CenterVertically,
//		horizontalArrangement = Arrangement.spacedBy(8.dp)
//	) {
//		Text(
//			text = icon,
//			style = PortfolioTheme.typography.label
//		)
//
//		Text(
//			text = text,
//			style = PortfolioTheme.typography.label.copy(
//				fontWeight = FontWeight.SemiBold
//			),
//			color = PortfolioTheme.colors.textPrimary
//		)
//	}
//}

@Composable
fun ThemeToggle(
	isDarkTheme: Boolean,
	onThemeSelected: (Boolean) -> Unit,
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
		ThemeOption(
			icon = Res.drawable.light_mode,
			selected = !isDarkTheme,
			onClick = { onThemeSelected(false) },
			tint = Color(255, 197, 0)
		)

		ThemeOption(
			icon = Res.drawable.dark_mode,
			selected = isDarkTheme,
			onClick = { onThemeSelected(true) },
			tint = Color(186, 186, 186)
		)
	}
}

@Composable
private fun ThemeOption(
	icon: DrawableResource,
	selected: Boolean,
	onClick: () -> Unit,
	modifier: Modifier = Modifier,
	tint: Color
) {
	val backgroundColor = if (selected) {
		PortfolioTheme.colors.accent
	}
	else {
		PortfolioTheme.colors.surface
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
		Icon(
			imageVector = vectorResource(icon),
			contentDescription = null,
			modifier = modifier.size(20.dp),
			tint = tint
		)
	}
}