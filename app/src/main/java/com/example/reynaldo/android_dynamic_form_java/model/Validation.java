package com.example.reynaldo.android_dynamic_form_java.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.List;

public class Validation {

    @SerializedName("required")
    @Expose
    private String required;

    @SerializedName("exactLength")
    @Expose
    private String exactLength;

    @SerializedName("minLength")
    @Expose
    private String minLength;

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getExactLength() {
        return exactLength;
    }

    public void setExactLength(String exactLength) {
        this.exactLength = exactLength;
    }

    public String getMinLength() {
        return minLength;
    }

    public void setMinLength(String minLength) {
        this.minLength = minLength;
    }

}
