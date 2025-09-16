package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class ResultActivity extends AppCompatActivity {

    TextView correct, wrong, total, result;
    Button home;
    CircularProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Initialize views
        correct = findViewById(R.id.correct);
        wrong = findViewById(R.id.wrong);
        total = findViewById(R.id.total);
        home = findViewById(R.id.home);
        result = findViewById(R.id.result);
        progressBar = findViewById(R.id.circularProgressbar);

        progressBar.setProgress(QuestionActivity.correct);

        // Get data from intent
        Intent intent = getIntent();
        int attempted1 = intent.getIntExtra("attempted", 0);
        int correct1 = intent.getIntExtra("correct", 0);
        int wrong1 = intent.getIntExtra("wrong", 0);

        // Update UI elements
        correct.setText("Correct = " + correct1);
        wrong.setText("Wrong = " + wrong1);
        total.setText("Attempted = " + attempted1);
        result.setText(correct1 + "/" + attempted1);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
                finishAffinity();
            }
        });
    }
}