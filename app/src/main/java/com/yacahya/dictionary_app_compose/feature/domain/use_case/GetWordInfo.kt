package com.yacahya.dictionary_app_compose.feature.domain.use_case

import com.yacahya.dictionary_app_compose.common.util.Resource
import com.yacahya.dictionary_app_compose.feature.domain.model.WordInfo
import com.yacahya.dictionary_app_compose.feature.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}