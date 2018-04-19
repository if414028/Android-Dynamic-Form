package com.example.reynaldo.android_dynamic_form_java.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Question {

    @SerializedName("key")
    @Expose
    var key: String? = null

    @SerializedName("label")
    @Expose
    var label: String? = null

    @SerializedName("typeField")
    @Expose
    var typeField: String? = null

    @SerializedName("validation")
    @Expose
    var validation: Validation? = null

    @SerializedName("options")
    @Expose
    var options: List<Options>? = null

    override fun toString(): String {
        return "Question{" +
                "key='" + key + '\''.toString() +
                ", label='" + label + '\''.toString() +
                ", typeField='" + typeField + '\''.toString() +
                ", validation=" + validation +
                ", options=" + options +
                '}'.toString()
    }
}
