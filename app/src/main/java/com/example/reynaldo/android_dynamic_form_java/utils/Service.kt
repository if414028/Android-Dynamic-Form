package com.example.reynaldo.android_dynamic_form_java.utils

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Service {

    private val BASE_URL = "https://raw.githubusercontent.com/amarthaid/test-mobile/master/Problem-1/"

    private val builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())

    private var retrofit = builder.build()

    private val logging = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

    private val httpClient = OkHttpClient.Builder()

    fun <S> createService(
            serviceClass: Class<S>): S {
        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging)
            builder.client(httpClient.build())
            retrofit = builder.build()
        }

        return retrofit.create(serviceClass)
    }

}
