package com.example.reynaldo.android_dynamic_form_java.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Options {

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("value")
    @Expose
    private String value;


    public Options(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Options{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
