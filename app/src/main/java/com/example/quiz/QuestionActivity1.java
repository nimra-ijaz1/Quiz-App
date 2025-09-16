package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity1 extends AppCompatActivity {

    int flag = 0;
    int marks = 0;
    public static int correct = 0;
    int wrong = 0;
    String[] questions = {
            "What is the primary advantage of Kotlin over Java in Android development?",
            "What is the file extension for Kotlin files?",
            "Which function is used to run code in the background in Kotlin?"
    };

    String[] options = {
            "It is an open-source language.", "It provides null safety to reduce NullPointerExceptions.","It has faster execution compared to Java.", "It supports all programming paradigms.",
            ".java",".kt",".kotlin",".class",
            "runBlocking","launch","async","withContext"
    };

    String[] answers = {
            " It provides null safety to reduce NullPointerExceptions.",
            ".kt",
            "launch"
    };

    TextView quitBtn, dispNo, score, question;
    Button next;
    RadioGroup radio_g;
    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        // Initialize views
        quitBtn = findViewById(R.id.quitBtn);
        dispNo = findViewById(R.id.dispNo);
        next = findViewById(R.id.nextBtn);
        radio_g = findViewById(R.id.answergroup);
        score = findViewById(R.id.score);
        question = findViewById(R.id.question);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);

        // Set initial values
        question.setText(questions[flag]);
        rb1.setText(options[0]);
        rb2.setText(options[1]);
        rb3.setText(options[2]);
        rb4.setText(options[3]);
        dispNo.setText((flag + 1) + "/" + questions.length);

        next.setOnClickListener(view -> {
            if (radio_g.getCheckedRadioButtonId() == -1) {
                Toast.makeText(QuestionActivity1.this, "Please select an option", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton uanswer = findViewById(radio_g.getCheckedRadioButtonId());
            String ansText = uanswer.getText().toString();

            if (ansText.equals(answers[flag])) {
                correct++;
                Toast.makeText(QuestionActivity1.this, "Hurray!! It was correct", Toast.LENGTH_SHORT).show();
            } else {
                wrong++;
                Toast.makeText(QuestionActivity1.this, "Ohh!! It was incorrect", Toast.LENGTH_SHORT).show();
            }

            flag++;
            if (flag < questions.length) {
                question.setText(questions[flag]);
                rb1.setText(options[flag * 4]);
                rb2.setText(options[flag * 4 + 1]);
                rb3.setText(options[flag * 4 + 2]);
                rb4.setText(options[flag * 4 + 3]);
                // Hide unused RadioButton
                dispNo.setText((flag + 1) + "/" + questions.length);
            } else {
                marks = correct;
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("attempted", flag);
                intent.putExtra("correct", correct);
                intent.putExtra("wrong", wrong);
                startActivity(intent);
                finish();
            }
            radio_g.clearCheck();
        });

        quitBtn.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionActivity1.this, ResultActivity.class);
                intent.putExtra("attempted", flag);
                intent.putExtra("correct", correct);
                intent.putExtra("wrong", wrong);
                startActivity(intent);
                finish();
            }
        });

    }
}