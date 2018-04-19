package com.example.reynaldo.android_dynamic_form_java.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reynaldo.android_dynamic_form_java.R;
import com.example.reynaldo.android_dynamic_form_java.adapter.QuestionAdapter;
import com.example.reynaldo.android_dynamic_form_java.api.ApiQuestions;
import com.example.reynaldo.android_dynamic_form_java.model.Question;
import com.example.reynaldo.android_dynamic_form_java.model.QuestionResult;
import com.example.reynaldo.android_dynamic_form_java.model.ResultObject;
import com.example.reynaldo.android_dynamic_form_java.utils.Service;

import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.question_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        callListQuestion();
    }

    private void callListQuestion() {
        ApiQuestions client = Service.createService(ApiQuestions.class);
        Call<QuestionResult> call = client.getListQuestion();
        call.enqueue(new Callback<QuestionResult>() {
            @Override
            public void onResponse(Call<QuestionResult> call, Response<QuestionResult> response) {
                int statusCode = response.code();
                List<Question> questions = response.body().getResults();

                final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.question_recycler_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                recyclerView.setAdapter(new QuestionAdapter(questions, R.layout.list_item_question, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<QuestionResult> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
