package com.pguillen.portfolio.ui.projects

import com.pguillen.portfolio.ui.components.LocalizedText

data class Project(
	val title: String,
	val subtitle: LocalizedText,
	val description: LocalizedText,
	val stack: List<String>,
	val highlights: List<LocalizedText>,
	val demoUrl: String,
	val githubUrl: String,
	val featured: Boolean
)
