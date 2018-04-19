package com.example.reynaldo.android_dynamic_form_java.api;

import com.example.reynaldo.android_dynamic_form_java.model.QuestionResult;
import com.example.reynaldo.android_dynamic_form_java.model.ResultObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiQuestions {
    @GET("question.json")
    Call<QuestionResult> getListQuestion();
}
