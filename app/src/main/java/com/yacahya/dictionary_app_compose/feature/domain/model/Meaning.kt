package com.yacahya.dictionary_app_compose.feature.domain.model

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)