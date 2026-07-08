package com.pguillen.portfolio.ui.components

import com.pguillen.portfolio.model.AppLanguage

data class LocalizedText(
	val en: String,
	val es: String
) {
	fun value(language: AppLanguage): String {
		return when (language) {
			AppLanguage.EN -> en
			AppLanguage.ES -> es
		}
	}
}