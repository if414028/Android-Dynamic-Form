package com.example.reynaldo.android_dynamic_form_java.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

import com.example.reynaldo.android_dynamic_form_java.R
import com.example.reynaldo.android_dynamic_form_java.model.Question

class QuestionAdapter(private val questions: List<Question>, private val rowLayout: Int, private val context: Context) : RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionAdapter.QuestionViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(rowLayout, parent, false)
        return QuestionViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionAdapter.QuestionViewHolder, position: Int) {

        holder.questionTitle.text = questions[position].label

    }

    override fun getItemCount(): Int {
        return questions.size
    }

    class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var questionLayout: LinearLayout
        internal var questionTitle: TextView
        internal var fieldType: EditText


        init {
            questionLayout = itemView.findViewById<View>(R.id.questionLayout) as LinearLayout
            questionTitle = itemView.findViewById<View>(R.id.question) as TextView
            fieldType = itemView.findViewById<View>(R.id.fieldType) as EditText
        }
    }
}
