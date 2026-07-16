package com.pguillen.portfolio.model

import com.pguillen.portfolio.ui.components.LocalizedText
import org.jetbrains.compose.resources.DrawableResource

data class Project(
	val title: String,
	val subtitle: LocalizedText,
	val description: LocalizedText,
	val stack: List<String>,
	val highlights: List<LocalizedText>,
	val demoUrl: String,
	val githubUrl: String,
	val policyUrl: String,
	val featured: Boolean,
	val previewImages: List<DrawableResource>? = null
)