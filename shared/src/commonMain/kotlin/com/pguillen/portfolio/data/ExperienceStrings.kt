package com.pguillen.portfolio.data

import com.pguillen.portfolio.model.ExperienceItem
import com.pguillen.portfolio.ui.components.LocalizedText

val portfolioExperience = listOf(
	ExperienceItem(
		title = LocalizedText(
			en = "Android / KMP Portfolio Projects",
			es = "Proyectos Android / KMP de portfolio"
		),
		subtitle = LocalizedText(
			en = "Personal projects focused on Android development",
			es = "Proyectos personales enfocados en desarrollo Android"
		),
		period = LocalizedText(
			en = "Current",
			es = "Actualidad"
		),
		description = LocalizedText(
			en = "I build Android and Kotlin Multiplatform projects to practice modern mobile development and showcase my technical skills.",
			es = "Desarrollo proyectos Android y Kotlin Multiplatform para practicar desarrollo móvil moderno y mostrar mis habilidades técnicas."
		),
		bullets = listOf(
			LocalizedText(
				en = "Built apps using Kotlin, Jetpack Compose and clean architecture principles.",
				es = "Desarrollo de apps con Kotlin, Jetpack Compose y principios de arquitectura limpia."
			),
			LocalizedText(
				en = "Created local-first features with persistence, state management and reusable UI components.",
				es = "Creación de funcionalidades local-first con persistencia, gestión de estado y componentes UI reutilizables."
			),
			LocalizedText(
				en = "Deployed web demos with Compose Multiplatform and GitHub Pages.",
				es = "Despliegue de demos web con Compose Multiplatform y GitHub Pages."
			),
			LocalizedText(
				en = "Added unit tests for domain logic, use cases and flows.",
				es = "Implementación de tests unitarios para lógica de dominio, casos de uso y flows."
			)
		),
		tags = listOf(
			"Kotlin",
			"Jetpack Compose",
			"KMP",
			"Clean Architecture",
			"SQLDelight",
			"Testing"
		)
	),
	ExperienceItem(
		title = LocalizedText(
			en = "Software QA Background",
			es = "Experiencia en Software QA"
		),
		subtitle = LocalizedText(
			en = "Quality assurance and software testing",
			es = "Calidad de software y testing"
		),
		period = LocalizedText(
			en = "Previous experience",
			es = "Experiencia previa"
		),
		description = LocalizedText(
			en = "My QA background helps me approach development with a strong focus on quality, edge cases, maintainability and user experience.",
			es = "Mi base en QA me ayuda a afrontar el desarrollo con foco en calidad, casos límite, mantenibilidad y experiencia de usuario."
		),
		bullets = listOf(
			LocalizedText(
				en = "Experience analyzing requirements, validating functionality and detecting defects.",
				es = "Experiencia analizando requisitos, validando funcionalidades y detectando defectos."
			),
			LocalizedText(
				en = "Testing mindset applied to Android projects and app behavior.",
				es = "Mentalidad de testing aplicada a proyectos Android y comportamiento de la app."
			),
			LocalizedText(
				en = "Attention to detail in UI, flows, regressions and user-facing issues.",
				es = "Atención al detalle en UI, flujos, regresiones y problemas visibles para el usuario."
			)
		),
		tags = listOf(
			"QA",
			"Manual Testing",
			"Test Cases",
			"Bug Reporting",
			"Regression Testing",
			"Mobile QA"
		)
	),
	ExperienceItem(
		title = LocalizedText(
			en = "Multiplatform App Development Studies",
			es = "Formación en Desarrollo de Aplicaciones Multiplataforma"
		),
		subtitle = LocalizedText(
			en = "Higher vocational training",
			es = "Grado Superior"
		),
		period = LocalizedText(
			en = "Academic background",
			es = "Formación académica"
		),
		description = LocalizedText(
			en = "Technical education focused on software development, programming fundamentals and application development.",
			es = "Formación técnica enfocada en desarrollo de software, fundamentos de programación y creación de aplicaciones."
		),
		bullets = listOf(
			LocalizedText(
				en = "Programming fundamentals, databases and application development.",
				es = "Fundamentos de programación, bases de datos y desarrollo de aplicaciones."
			),
			LocalizedText(
				en = "Practical approach to building software projects.",
				es = "Enfoque práctico para construir proyectos de software."
			)
		),
		tags = listOf(
			"DAM",
			"Software Development",
			"Databases",
			"Programming"
		)
	)
)