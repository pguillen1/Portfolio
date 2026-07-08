package com.pguillen.portfolio.model

import com.pguillen.portfolio.ui.components.LocalizedText

data class SkillCategory(
	val title: String,
	val description: LocalizedText,
	val skills: List<String>
)
