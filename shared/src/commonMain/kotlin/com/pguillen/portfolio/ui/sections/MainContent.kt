package com.pguillen.portfolio.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.model.PortfolioSection
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.ui.theme.PortfolioTheme

@Composable
fun MainContent(
	selectedSection: PortfolioSection,
	onSectionSelected: (PortfolioSection) -> Unit,
	language: AppLanguage,
	strings: PortfolioStrings,
	modifier: Modifier = Modifier
) {
	val uriHandler = LocalUriHandler.current
	Box(
		modifier = modifier
			.background(PortfolioTheme.colors.background)
	) {
		when (selectedSection) {
			PortfolioSection.Home -> HomeSection(
				strings = strings,
				onProjectsClick = {
					onSectionSelected(PortfolioSection.Projects)
				},
				onCvClick = {
					uriHandler.openUri("/cv/pedro-guillen-cv.pdf")
				},
				onContactClick = {
					onSectionSelected(PortfolioSection.Contact)
				}
			)
			PortfolioSection.Projects -> ProjectsSection(
				strings = strings,
				language = language
			)
			PortfolioSection.Stack -> StackSection(
				strings = strings,
				language = language
			)
			PortfolioSection.Experience -> ExperienceSection(
				strings = strings,
				language = language
			)
			PortfolioSection.Contact -> ContactSection(
				strings = strings,
				language = language
			)
		}
	}
}