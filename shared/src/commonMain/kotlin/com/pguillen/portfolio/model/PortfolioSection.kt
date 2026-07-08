package com.pguillen.portfolio.model

import com.pguillen.portfolio.data.PortfolioStrings

enum class PortfolioSection {
	Home,
	Projects,
	Stack,
	Experience,
	Contact
}

fun PortfolioSection.label(strings: PortfolioStrings): String {
	return when (this) {
		PortfolioSection.Home -> strings.home
		PortfolioSection.Projects -> strings.projects
		PortfolioSection.Stack -> strings.stack
		PortfolioSection.Experience -> strings.experience
		PortfolioSection.Contact -> strings.contact
	}
}

