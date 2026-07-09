package com.pguillen.portfolio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.model.PortfolioSection
import com.pguillen.portfolio.model.label
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.model.icon
import com.pguillen.portfolio.ui.theme.PortfolioTheme
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.vectorResource

@Composable
fun Sidebar(
	selectedSection: PortfolioSection,
	onSectionSelected: (PortfolioSection) -> Unit,
	strings: PortfolioStrings,
	modifier: Modifier = Modifier,
	onGithubClick: () -> Unit = {},
	onLinkedInClick: () -> Unit = {},
	onEmailClick: () -> Unit = {}
) {
	Column(
		modifier = modifier
			.fillMaxHeight()
			.background(PortfolioTheme.colors.sidebar)
			.border(
				width = 1.dp,
				color = PortfolioTheme.colors.border
			)
			.padding(horizontal = 20.dp, vertical = 28.dp)
	) {
		SidebarProfile()

		Spacer(modifier = Modifier.height(32.dp))

		Column(
			verticalArrangement = Arrangement.spacedBy(8.dp)
		) {
			PortfolioSection.entries.forEach { section ->
				SidebarItem(
					text = section.label(strings),
					icon = section.icon,
					selected = selectedSection == section,
					onClick = { onSectionSelected(section) }
				)
			}
		}

		Spacer(modifier = Modifier.weight(1f))

		SidebarFooter(
			onGithubClick = onGithubClick,
			onLinkedInClick = onLinkedInClick,
			onEmailClick = onEmailClick
		)
	}
}

@Composable
private fun SidebarProfile(
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier.fillMaxWidth(),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Box(
			modifier = Modifier
				.size(88.dp)
				.clip(CircleShape)
				.background(PortfolioTheme.colors.accentSoft)
				.border(
					width = 2.dp,
					color = PortfolioTheme.colors.accent,
					shape = CircleShape
				),
			contentAlignment = Alignment.Center
		) {
			Text(
				text = "PG",
				style = PortfolioTheme.typography.sectionTitle,
				color = PortfolioTheme.colors.accent
			)
		}

		Spacer(modifier = Modifier.height(16.dp))

		Text(
			text = "Pedro Guillén",
			style = PortfolioTheme.typography.cardTitle,
			color = PortfolioTheme.colors.textPrimary
		)

		Spacer(modifier = Modifier.height(4.dp))

		Text(
			text = "Android & KMP Developer",
			style = PortfolioTheme.typography.bodySmall,
			color = PortfolioTheme.colors.accent
		)
	}
}

@Composable
private fun SidebarItem(
	text: String,
	icon: DrawableResource,
	selected: Boolean,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	val backgroundColor = if (selected) {
		PortfolioTheme.colors.accentSoft
	}
	else {
		Color.Transparent
	}

	val textColor = if (selected) {
		PortfolioTheme.colors.accent
	}
	else {
		PortfolioTheme.colors.textSecondary
	}

	val fontWeight = if (selected) {
		FontWeight.SemiBold
	}
	else {
		FontWeight.Medium
	}

	Row(
		modifier = modifier
			.fillMaxWidth()
			.height(48.dp)
			.clip(RoundedCornerShape(12.dp))
			.background(backgroundColor)
			.clickable(onClick = onClick),
		verticalAlignment = Alignment.CenterVertically
	) {
		Box(
			modifier = Modifier
				.width(4.dp)
				.fillMaxHeight()
				.background(
					if (selected) PortfolioTheme.colors.accent
					else Color.Transparent
				)
		)

		Icon(
			imageVector = vectorResource(icon),
			contentDescription = null,
			tint = contentColor,
			modifier = Modifier.size(20.dp)
		)

		Spacer(modifier = Modifier.width(16.dp))

		Text(
			text = text,
			style = PortfolioTheme.typography.bodySmall.copy(
				fontWeight = fontWeight
			),
			color = textColor
		)
	}
}

@Composable
private fun SidebarFooter(
	onGithubClick: () -> Unit,
	onLinkedInClick: () -> Unit,
	onEmailClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier.fillMaxWidth()
	) {
		Row(
			horizontalArrangement = Arrangement.spacedBy(12.dp),
			verticalAlignment = Alignment.CenterVertically
		) {
			SidebarFooterLink(
				text = "GitHub",
				onClick = onGithubClick
			)

			SidebarFooterLink(
				text = "LinkedIn",
				onClick = onLinkedInClick
			)

			SidebarFooterLink(
				text = "Email",
				onClick = onEmailClick
			)
		}

		Spacer(modifier = Modifier.height(20.dp))

		Text(
			text = "© 2026 Pedro Guillén",
			style = PortfolioTheme.typography.label,
			color = PortfolioTheme.colors.textSecondary
		)

		Spacer(modifier = Modifier.height(4.dp))

		Text(
			text = "Built with Kotlin ☕",
			style = PortfolioTheme.typography.label,
			color = PortfolioTheme.colors.textSecondary
		)
	}
}

@Composable
private fun SidebarFooterLink(
	text: String,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Text(
		text = text,
		style = PortfolioTheme.typography.label.copy(
			fontWeight = FontWeight.SemiBold
		),
		color = PortfolioTheme.colors.textSecondary,
		modifier = modifier
			.clip(RoundedCornerShape(8.dp))
			.clickable(onClick = onClick)
			.padding(horizontal = 4.dp, vertical = 4.dp)
	)
}