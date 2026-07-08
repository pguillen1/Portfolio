package com.pguillen.portfolio.ui.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.pguillen.portfolio.model.AppLanguage
import com.pguillen.portfolio.data.PortfolioStrings
import com.pguillen.portfolio.data.portfolioProjects
import com.pguillen.portfolio.ui.components.ProjectCard
import com.pguillen.portfolio.ui.components.SectionHeader
import com.pguillen.portfolio.ui.components.SectionLabel
import com.pguillen.portfolio.ui.proyects.Project

@Composable
fun ProjectsSection(
	strings: PortfolioStrings,
	language: AppLanguage,
	projects: List<Project> = portfolioProjects,
	modifier: Modifier = Modifier
) {
	val uriHandler = LocalUriHandler.current

	val featuredProject = projects.firstOrNull { it.featured }
	val otherProjects = projects.filterNot { it.featured }

	Column(
		modifier = modifier
			.verticalScroll(rememberScrollState())
			.padding(horizontal = 40.dp, vertical = 32.dp),
		verticalArrangement = Arrangement.spacedBy(32.dp)
	) {
		SectionHeader(
			title = strings.projectsTitle,
			subtitle = strings.projectsSubtitle
		)

		featuredProject?.let { project ->
			Column(
				verticalArrangement = Arrangement.spacedBy(16.dp)
			) {
				SectionLabel(text = strings.featuredProject)

				ProjectCard(
					project = project,
					language = language,
					strings = strings,
					featured = true,
					onDemoClick = {
						project.demoUrl.let(uriHandler::openUri)
					},
					onGithubClick = {
						project.githubUrl.let(uriHandler::openUri)
					},
					onReadmeClick = {
						project.readmeUrl.let(uriHandler::openUri)
					}
				)
			}
		}

		if (otherProjects.isNotEmpty()) {
			Column(
				verticalArrangement = Arrangement.spacedBy(16.dp)
			) {
				SectionLabel(text = strings.moreProjects)

				otherProjects.forEach { project ->
					ProjectCard(
						project = project,
						language = language,
						strings = strings,
						featured = false,
						onDemoClick = {
							project.demoUrl?.let(uriHandler::openUri)
						},
						onGithubClick = {
							project.githubUrl?.let(uriHandler::openUri)
						},
						onReadmeClick = {
							project.readmeUrl?.let(uriHandler::openUri)
						},
						modifier = Modifier.fillMaxWidth()
					)
				}
			}
		}
	}
}

