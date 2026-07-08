package com.pguillen.portfolio.model

import com.pguillen.portfolio.ui.components.LocalizedText

data class ExperienceItem(
	val title: LocalizedText,
	val subtitle: LocalizedText,
	val period: LocalizedText,
	val description: LocalizedText,
	val bullets: List<LocalizedText>,
	val tags: List<String>
)
