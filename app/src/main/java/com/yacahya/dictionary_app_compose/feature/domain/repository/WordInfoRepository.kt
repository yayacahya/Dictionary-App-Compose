package com.yacahya.dictionary_app_compose.feature.domain.repository

import com.yacahya.dictionary_app_compose.common.util.Resource
import com.yacahya.dictionary_app_compose.feature.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}