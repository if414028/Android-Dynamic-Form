package com.example.reynaldo.android_dynamic_form_java.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.reynaldo.android_dynamic_form_java.R;
import com.example.reynaldo.android_dynamic_form_java.model.Question;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder> {

    private List<Question> questions;
    private int rowLayout;
    private Context context;

    public QuestionAdapter(List<Question> questions, int rowLayout, Context context) {
        this.questions = questions;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public QuestionAdapter.QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new QuestionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(QuestionAdapter.QuestionViewHolder holder, final int position) {

        holder.questionTitle.setText(questions.get(position).getLabel());

    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public static class QuestionViewHolder extends RecyclerView.ViewHolder {
        LinearLayout questionLayout;
        TextView questionTitle;
        EditText fieldType;


        public QuestionViewHolder(View itemView) {
            super(itemView);
            questionLayout = (LinearLayout) itemView.findViewById(R.id.questionLayout);
            questionTitle = (TextView) itemView.findViewById(R.id.question);
            fieldType = (EditText) itemView.findViewById(R.id.fieldType);
        }
    }
}
