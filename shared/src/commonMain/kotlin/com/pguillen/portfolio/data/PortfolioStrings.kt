package com.pguillen.portfolio.data

import com.pguillen.portfolio.model.AppLanguage

class PortfolioStrings(
	private val language: AppLanguage
) {
	val email: String = "pedro.guillen55@gmail.com"

	val githubUrl = "https://github.com/pguillen1"

	val linkedInUrl = "https://www.linkedin.com/in/pedro-guill%C3%A9n-escobar-a129b915a/"

	val cvUrl: String
		get() = when (language) {
			AppLanguage.EN -> "/Portfolio/cv/pedro-guillen-cv-english.pdf"
			AppLanguage.ES -> "/Portfolio/cv/pedro-guillen-cv-spanish.pdf"
		}

	val home: String
		get() = when (language) {
			AppLanguage.EN -> "Home"
			AppLanguage.ES -> "Inicio"
		}

	val projects: String
		get() = when (language) {
			AppLanguage.EN -> "Projects"
			AppLanguage.ES -> "Proyectos"
		}

	val stack: String
		get() = when (language) {
			AppLanguage.EN -> "Stack"
			AppLanguage.ES -> "Stack"
		}

	val experience: String
		get() = when (language) {
			AppLanguage.EN -> "Experience"
			AppLanguage.ES -> "Experiencia"
		}

	val cv: String
		get() = "CV"

	val contact: String
		get() = when (language) {
			AppLanguage.EN -> "Contact"
			AppLanguage.ES -> "Contacto"
		}

	val greeting: String
		get() = when (language) {
			AppLanguage.EN -> "Pedro Guillén · Android Developer"
			AppLanguage.ES -> "Pedro Guillén · Desarrollador Android"
		}

	val heroTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Android & Kotlin Multiplatform Developer"
			AppLanguage.ES -> "Desarrollador Android & Kotlin Multiplatform"
		}

	val heroSubtitle: String
		get() = when (language) {
			AppLanguage.EN ->
				"I build modern Android apps and web demos to showcase my projects and technical skills."

			AppLanguage.ES ->
				"Construyo aplicaciones Android modernas y demos web para mostrar mis proyectos y habilidades técnicas."
		}

	val theme: String
		get() = when (language) {
			AppLanguage.EN -> "Theme"
			AppLanguage.ES -> "Tema"
		}

	val languageLabel: String
		get() = when (language) {
			AppLanguage.EN -> "Language"
			AppLanguage.ES -> "Idioma"
		}

	val featuredProject: String
		get() = when (language) {
			AppLanguage.EN -> "Featured project"
			AppLanguage.ES -> "Proyecto destacado"
		}

	val moreProjects: String
		get() = when (language) {
			AppLanguage.EN -> "More projects"
			AppLanguage.ES -> "Más proyectos"
		}

	val skillsTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Stack & skills"
			AppLanguage.ES -> "Stack y habilidades"
		}

	val homeEyebrow: String
		get() = when (language) {
			AppLanguage.EN -> "Portfolio · Android · Kotlin Multiplatform"
			AppLanguage.ES -> "Portfolio · Android · Kotlin Multiplatform"
		}

	val viewProjects: String
		get() = when (language) {
			AppLanguage.EN -> "View projects"
			AppLanguage.ES -> "Ver proyectos"
		}

	val downloadCv: String
		get() = when (language) {
			AppLanguage.EN -> "Download CV"
			AppLanguage.ES -> "Descargar CV"
		}

	val androidAppsTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Android apps"
			AppLanguage.ES -> "Apps Android"
		}

	val androidAppsDescription: String
		get() = when (language) {
			AppLanguage.EN -> "Modern Android projects built with Kotlin, Jetpack Compose and clean architecture."
			AppLanguage.ES -> "Proyectos Android modernos creados con Kotlin, Jetpack Compose y arquitectura limpia."
		}

	val kmpDemosTitle: String
		get() = when (language) {
			AppLanguage.EN -> "KMP web demos"
			AppLanguage.ES -> "Demos web KMP"
		}

	val kmpDemosDescription: String
		get() = when (language) {
			AppLanguage.EN -> "Web demos created with Compose Multiplatform and deployed with GitHub Pages."
			AppLanguage.ES -> "Demos web creadas con Compose Multiplatform y desplegadas con GitHub Pages."
		}

	val qaMindsetTitle: String
		get() = when (language) {
			AppLanguage.EN -> "QA mindset"
			AppLanguage.ES -> "Mentalidad QA"
		}

	val qaMindsetDescription: String
		get() = when (language) {
			AppLanguage.EN -> "Software quality background focused on testing, maintainability and user experience."
			AppLanguage.ES -> "Base en calidad de software, pruebas, mantenibilidad y experiencia de usuario."
		}

	val homeStackTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Main stack"
			AppLanguage.ES -> "Stack principal"
		}

	val homeStackDescription: String
		get() = when (language) {
			AppLanguage.EN -> "Technologies and practices I use in my Android/KMP portfolio projects."
			AppLanguage.ES -> "Tecnologías y prácticas que uso en mis proyectos Android/KMP de portfolio."
		}

	val projectsTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Projects"
			AppLanguage.ES -> "Proyectos"
		}

	val projectsSubtitle: String
		get() = when (language) {
			AppLanguage.EN -> "Android and Kotlin Multiplatform projects built as technical portfolio pieces."
			AppLanguage.ES -> "Proyectos Android y Kotlin Multiplatform creados como portfolio técnico."
		}

	val highlights: String
		get() = when (language) {
			AppLanguage.EN -> "Highlights"
			AppLanguage.ES -> "Puntos destacados"
		}

	val demoWeb: String
		get() = when (language) {
			AppLanguage.EN -> "Web demo"
			AppLanguage.ES -> "Demo web"
		}

	val github: String
		get() = "GitHub"

	val readme: String
		get() = "README"

	val stackTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Stack"
			AppLanguage.ES -> "Stack"
		}

	val stackSubtitle: String
		get() = when (language) {
			AppLanguage.EN -> "Technologies and practices I use to build Android and Kotlin Multiplatform projects."
			AppLanguage.ES -> "Tecnologías y prácticas que uso para crear proyectos Android y Kotlin Multiplatform."
		}
	val experienceTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Experience"
			AppLanguage.ES -> "Experiencia"
		}

	val experienceSubtitle: String
		get() = when (language) {
			AppLanguage.EN -> "A combination of Android/KMP portfolio projects, software quality background and technical education."
			AppLanguage.ES -> "Una combinación de proyectos Android/KMP de portfolio, experiencia en calidad de software y formación técnica."
		}

	val experienceHighlights: String
		get() = when (language) {
			AppLanguage.EN -> "Key points"
			AppLanguage.ES -> "Puntos clave"
		}

	val contactTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Contact"
			AppLanguage.ES -> "Contacto"
		}

	val contactSubtitle: String
		get() = when (language) {
			AppLanguage.EN -> "You can reach me through email, GitHub or LinkedIn. I am open to Android development opportunities."
			AppLanguage.ES -> "Puedes contactar conmigo por email, GitHub o LinkedIn. Estoy abierto a oportunidades como desarrollador Android."
		}

	val contactIntroTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Let's talk"
			AppLanguage.ES -> "Hablemos"
		}

	val contactIntroDescription: String
		get() = when (language) {
			AppLanguage.EN -> "I am currently focused on building Android and Kotlin Multiplatform projects, improving my portfolio and looking for junior Android opportunities."
			AppLanguage.ES -> "Actualmente estoy centrado en crear proyectos Android y Kotlin Multiplatform, mejorar mi portfolio y buscar oportunidades junior como desarrollador Android."
		}

	val emailLabel: String
		get() = when (language) {
			AppLanguage.EN -> "Email"
			AppLanguage.ES -> "Email"
		}

	val githubLabel: String
		get() = "GitHub"

	val linkedInLabel: String
		get() = "LinkedIn"

	val downloadCvLabel: String
		get() = when (language) {
			AppLanguage.EN -> "Download CV"
			AppLanguage.ES -> "Descargar CV"
		}

	val availabilityTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Availability"
			AppLanguage.ES -> "Disponibilidad"
		}

	val availabilityDescription: String
		get() = when (language) {
			AppLanguage.EN -> "Based in Murcia, Spain. Open to remote, hybrid or relocation opportunities depending on the role."
			AppLanguage.ES -> "Ubicado en Murcia, España. Abierto a oportunidades remotas, híbridas o con movilidad según el puesto."
		}

	val rolesTitle: String
		get() = when (language) {
			AppLanguage.EN -> "Roles I am interested in"
			AppLanguage.ES -> "Roles que me interesan"
		}

	val privacyPolicy: String
		get() = when (language) {
			AppLanguage.EN -> "Privacy Policy"
			AppLanguage.ES -> "Política de privacidad"
		}
}