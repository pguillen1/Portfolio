package com.pguillen.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.model.PortfolioSection
import com.pguillen.portfolio.ui.components.PortfolioTopBar
import com.pguillen.portfolio.ui.components.Sidebar
import com.pguillen.portfolio.ui.sections.MainContent
import com.pguillen.portfolio.ui.theme.PortfolioTheme
import com.pguillen.portfolio.ui.theme.PortfolioThemeProvider

@Preview
@Composable
fun PortfolioApp() {
	val systemDarkTheme = isSystemInDarkTheme()

	var isDarkTheme by remember {
		mutableStateOf(systemDarkTheme)
	}

	var language by remember {
		mutableStateOf(AppLanguage.EN)
	}

	var selectedSection by remember {
		mutableStateOf(PortfolioSection.Home)
	}

	val strings = remember(language) {
		PortfolioStrings(language)
	}

	PortfolioThemeProvider(
		darkTheme = isDarkTheme
	) {
		Row(
			modifier = Modifier
				.fillMaxSize()
				.background(PortfolioTheme.colors.background)
		) {
			Sidebar(
				selectedSection = selectedSection,
				onSectionSelected = { selectedSection = it },
				strings = strings,
				modifier = Modifier
					.width(260.dp)
					.fillMaxHeight(),
				onGithubClick = {
					// TODO open GitHub
				},
				onLinkedInClick = {
					// TODO open LinkedIn
				},
				onEmailClick = {
					// TODO open email
				}
			)
			Column {
				PortfolioTopBar(
					strings = strings,
					language = language,
					isDarkTheme = isDarkTheme,
					onLanguageChange = { language = it },
					onThemeClick = {
						isDarkTheme = !isDarkTheme
					}
				)
				MainContent(
					selectedSection = selectedSection,
					onSectionSelected = { selectedSection = it },
					strings = strings,
					language = language,
					modifier = Modifier
				)
			}
		}
	}
}