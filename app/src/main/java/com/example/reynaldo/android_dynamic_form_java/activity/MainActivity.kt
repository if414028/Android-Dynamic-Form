package com.example.reynaldo.android_dynamic_form_java.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View

import com.example.reynaldo.android_dynamic_form_java.R
import com.example.reynaldo.android_dynamic_form_java.adapter.QuestionAdapter
import com.example.reynaldo.android_dynamic_form_java.api.ApiQuestions
import com.example.reynaldo.android_dynamic_form_java.model.QuestionResult
import com.example.reynaldo.android_dynamic_form_java.utils.Service

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<View>(R.id.question_recycler_view) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        callListQuestion()
    }

    private fun callListQuestion() {
        val client = Service.createService<ApiQuestions>(ApiQuestions::class.java)
        val call = client.listQuestion
        call.enqueue(object : Callback<QuestionResult> {
            override fun onResponse(call: Call<QuestionResult>, response: Response<QuestionResult>) {
                val statusCode = response.code()
                val questions = response.body().results

                val recyclerView = findViewById<View>(R.id.question_recycler_view) as RecyclerView
                recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

                recyclerView.adapter = QuestionAdapter(questions!!, R.layout.list_item_question, applicationContext)
            }

            override fun onFailure(call: Call<QuestionResult>, t: Throwable) {
                Log.e(TAG, t.toString())
            }
        })
    }

    companion object {

        private val TAG = MainActivity::class.java!!.getSimpleName()
    }
}
