package com.example.reynaldo.android_dynamic_form_java.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

open class QuestionResult {

    @SerializedName("questions")
    @Expose
    var results: List<Question>? = null

    @SerializedName("version")
    @Expose
    var version: String? = null

    override fun toString(): String {
        return "QuestionResult{" +
                "questions=" + results +
                ", version='" + version + '\''.toString() +
                '}'.toString()
    }
}
