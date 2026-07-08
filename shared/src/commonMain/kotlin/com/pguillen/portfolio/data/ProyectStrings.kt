package com.pguillen.portfolio.data

import com.pguillen.portfolio.ui.components.LocalizedText
import com.pguillen.portfolio.ui.proyects.Project

val portfolioProjects = listOf(
	Project(
		title = "Reading Tracker",
		subtitle = LocalizedText(
			en = "Android / KMP portfolio app",
			es = "App Android / KMP para portfolio"
		),
		description = LocalizedText(
			en = "An app to track books, reading sessions, notes and reading statistics.",
			es = "Una app para registrar libros, sesiones de lectura, notas y estadísticas."
		),
		stack = listOf(
			"Kotlin",
			"Jetpack Compose",
			"KMP",
			"SQLDelight",
			"DataStore",
			"Clean Architecture"
		),
		highlights = listOf(
			LocalizedText(
				en = "Local-first data persistence",
				es = "Persistencia local-first"
			),
			LocalizedText(
				en = "Layered architecture with use cases",
				es = "Arquitectura por capas con casos de uso"
			),
			LocalizedText(
				en = "Web demo deployed with GitHub Pages",
				es = "Demo web desplegada con GitHub Pages"
			)
		),
		demoUrl = "https://...",
		githubUrl = "https://...",
		readmeUrl = "https://...",
		featured = true
	)
)