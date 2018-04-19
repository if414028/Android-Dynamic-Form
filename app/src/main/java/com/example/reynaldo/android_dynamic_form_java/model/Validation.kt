package com.example.reynaldo.android_dynamic_form_java.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Validation {

    @SerializedName("required")
    @Expose
    var required: String? = null

    @SerializedName("exactLength")
    @Expose
    var exactLength: String? = null

    @SerializedName("minLength")
    @Expose
    var minLength: String? = null

}
