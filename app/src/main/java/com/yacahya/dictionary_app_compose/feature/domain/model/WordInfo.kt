package com.yacahya.dictionary_app_compose.feature.domain.model

data class WordInfo(
    val meanings: List<Meaning>,
    val origin: String?,
    val phonetic: String?,
    val word: String
)