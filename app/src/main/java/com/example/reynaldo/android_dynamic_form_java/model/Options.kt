package com.example.reynaldo.android_dynamic_form_java.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Options(@field:SerializedName("label")
              @field:Expose
              var label: String?, @field:SerializedName("value")
              @field:Expose
              var value: String?) {

    override fun toString(): String {
        return "Options{" +
                "label='" + label + '\''.toString() +
                ", value='" + value + '\''.toString() +
                '}'.toString()
    }
}
