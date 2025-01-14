package com.example.domain.usecase

interface PapagoUsecase {
    suspend fun getText(text : String, source : String, target : String) : String?
    suspend fun getSrcLangType(text : String, source : String, target : String) : String?
    suspend fun getTarLangType(text : String, source : String, target : String) : String?
}