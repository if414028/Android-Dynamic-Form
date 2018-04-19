package com.example.reynaldo.android_dynamic_form_java.api

import com.example.reynaldo.android_dynamic_form_java.model.QuestionResult

import retrofit2.Call
import retrofit2.http.GET

interface ApiQuestions {
    @get:GET("question.json")
    val listQuestion: Call<QuestionResult>
}
