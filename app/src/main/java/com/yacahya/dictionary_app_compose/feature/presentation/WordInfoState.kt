package com.yacahya.dictionary_app_compose.feature.presentation

import com.yacahya.dictionary_app_compose.feature.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)