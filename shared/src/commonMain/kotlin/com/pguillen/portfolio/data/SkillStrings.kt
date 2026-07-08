package com.pguillen.portfolio.data

import com.pguillen.portfolio.model.SkillCategory
import com.pguillen.portfolio.ui.components.LocalizedText

val portfolioSkills = listOf(
	SkillCategory(
		title = "Android",
		description = LocalizedText(
			en = "Modern Android development with Kotlin and Jetpack Compose.",
			es = "Desarrollo Android moderno con Kotlin y Jetpack Compose."
		),
		skills = listOf(
			"Kotlin",
			"Jetpack Compose",
			"ViewModel",
			"Navigation",
			"Coroutines",
			"Flow",
			"StateFlow",
			"Material 3"
		)
	),
	SkillCategory(
		title = "Architecture",
		description = LocalizedText(
			en = "Project structure focused on maintainability, separation of concerns and testability.",
			es = "Estructura de proyectos enfocada en mantenibilidad, separación de responsabilidades y testabilidad."
		),
		skills = listOf(
			"Clean Architecture",
			"MVVM",
			"Repository Pattern",
			"Use Cases",
			"UI State",
			"One-shot effects",
			"Dependency Injection"
		)
	),
	SkillCategory(
		title = "Persistence",
		description = LocalizedText(
			en = "Local-first apps with persistent data and user preferences.",
			es = "Apps local-first con datos persistentes y preferencias de usuario."
		),
		skills = listOf(
			"SQLDelight",
			"Room",
			"DataStore",
			"Local database",
			"Preferences"
		)
	),
	SkillCategory(
		title = "Multiplatform",
		description = LocalizedText(
			en = "Kotlin Multiplatform projects with Android apps and web demos.",
			es = "Proyectos Kotlin Multiplatform con apps Android y demos web."
		),
		skills = listOf(
			"Kotlin Multiplatform",
			"Compose Multiplatform",
			"Kotlin/Wasm",
			"Shared domain",
			"Shared data layer",
			"GitHub Pages"
		)
	),
	SkillCategory(
		title = "Testing",
		description = LocalizedText(
			en = "Testing focused on business logic, flows and maintainable project behavior.",
			es = "Testing enfocado en lógica de negocio, flows y comportamiento mantenible del proyecto."
		),
		skills = listOf(
			"Unit testing",
			"JUnit",
			"Fakes",
			"Flow testing",
			"Compose UI Testing",
			"TestDispatcher"
		)
	),
	SkillCategory(
		title = "Tools",
		description = LocalizedText(
			en = "Development tools used to build, version and deploy projects.",
			es = "Herramientas usadas para construir, versionar y desplegar proyectos."
		),
		skills = listOf(
			"Git",
			"GitHub",
			"GitHub Actions",
			"Gradle",
			"Android Studio",
			"R8"
		)
	)
)