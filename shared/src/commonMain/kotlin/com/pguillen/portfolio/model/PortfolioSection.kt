package com.pguillen.portfolio.model

import com.pguillen.portfolio.data.PortfolioStrings
import org.jetbrains.compose.resources.DrawableResource
import portfolio.shared.generated.resources.Res
import portfolio.shared.generated.resources.code
import portfolio.shared.generated.resources.folder
import portfolio.shared.generated.resources.home
import portfolio.shared.generated.resources.mail
import portfolio.shared.generated.resources.work

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

val PortfolioSection.icon: DrawableResource
	get() = when (this) {
		PortfolioSection.Home -> Res.drawable.home
		PortfolioSection.Projects -> Res.drawable.folder
		PortfolioSection.Stack -> Res.drawable.code
		PortfolioSection.Experience -> Res.drawable.work
		PortfolioSection.Contact -> Res.drawable.mail
	}

