package com.example.reynaldo.android_dynamic_form_java.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.List;

public class Question {

    @SerializedName("key")
    @Expose
    private String key;

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("typeField")
    @Expose
    private String typeField;

    @SerializedName("validation")
    @Expose
    private Validation validation;

    @SerializedName("options")
    @Expose
    private List<Options> options = null;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTypeField() {
        return typeField;
    }

    public void setTypeField(String typeField) {
        this.typeField = typeField;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public Validation getValidation() {
        return validation;
    }

    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    @Override
    public String toString() {
        return "Question{" +
                "key='" + key + '\'' +
                ", label='" + label + '\'' +
                ", typeField='" + typeField + '\'' +
                ", validation=" + validation +
                ", options=" + options +
                '}';
    }
}
