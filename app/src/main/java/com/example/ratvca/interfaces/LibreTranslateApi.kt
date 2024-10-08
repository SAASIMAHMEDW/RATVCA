package com.example.ratvca.interfaces
import android.view.translation.TranslationRequest
import android.view.translation.TranslationResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
interface LibreTranslateApi {
    @POST("translate")
    fun translate(@Body request: TranslationRequest): Call<TranslationResponse>
}