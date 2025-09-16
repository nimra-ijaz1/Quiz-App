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

public class QuestionActivity extends AppCompatActivity {

    int flag = 0;
    int marks = 0;
    public static int correct = 0;
    int wrong = 0;
    String[] questions = {
            "What is the default value of a boolean variable in Java?",
            "Which of the following is true about the final keyword in Java?",
            "Which of the following statements is true about method overloading in Java?"
    };

    String[] options = {
            "false", "true", "null","zero",
            "It can be applied only to methods", "It can be applied only to variables", "It can be applied to classes, methods, and variables","It can be only applied to classes",
            "Methods can have the same name but must have the same parameter list", "Method overloading is based on the return type", "Methods can have the same name but must have different parameter lists","Methods can have the different name but must have same parameter lists"
    };

    String[] answers = {
            "false",
            "It can be applied to classes, methods, and variables",
            "Methods can have the same name but must have different parameter lists"
    };

    TextView quitBtn, dispNo, score, question;
    Button next;
    RadioGroup radio_g;
    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

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
                Toast.makeText(QuestionActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton uanswer = findViewById(radio_g.getCheckedRadioButtonId());
            String ansText = uanswer.getText().toString();

            if (ansText.equals(answers[flag])) {
                correct++;
                Toast.makeText(QuestionActivity.this, "Hurray!! It was correct", Toast.LENGTH_SHORT).show();
            } else {
                wrong++;
                Toast.makeText(QuestionActivity.this, "Ohh!! It was incorrect", Toast.LENGTH_SHORT).show();
            }

            flag++;
            if (flag < questions.length) {
                question.setText(questions[flag]);
                rb1.setText(options[flag * 4]);
                rb2.setText(options[flag * 4 + 1]);
                rb3.setText(options[flag * 4 + 2]);
                rb3.setText(options[flag * 4 + 3]);
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
                Intent intent = new Intent(QuestionActivity.this, ResultActivity.class);
                intent.putExtra("attempted", flag);
                intent.putExtra("correct", correct);
                intent.putExtra("wrong", wrong);
                startActivity(intent);
                finish();
            }
        });

    }
}