package com.example.reynaldo.android_dynamic_form_java.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.List;

public class QuestionResult{

    @SerializedName("questions")
    @Expose
    private List<Question> results;

    @SerializedName("version")
    @Expose
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Question> getResults() {
        return results;
    }

    public void setResults(List<Question> questions) {
        this.results = questions;
    }

    @Override
    public String toString() {
        return "QuestionResult{" +
                "questions=" + results +
                ", version='" + version + '\'' +
                '}';
    }
}
