package com.example.android.mathmatica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void result(View view) {

        CheckBox chB = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox chB2 = (CheckBox) findViewById(R.id.checkBox2);
        if (chB.isChecked() == true && chB2.isChecked() == true) {
            score++;
        }

        RadioGroup question1 = (RadioGroup) findViewById(R.id.q_answer_1);
        if (question1.getCheckedRadioButtonId() == R.id.q1_answer_a) {
            score++;
        }

        RadioGroup question2 = (RadioGroup) findViewById(R.id.q_answer_2);
        if (question2.getCheckedRadioButtonId() == R.id.q2_answer_b) {
            score++;
        }

        RadioGroup question3 = (RadioGroup) findViewById(R.id.q_answer_3);
        if (question3.getCheckedRadioButtonId() == R.id.q3_answer_c) {
            score++;
        }
        RadioGroup question4 = (RadioGroup) findViewById(R.id.q_answer_4);
        if (question4.getCheckedRadioButtonId() == R.id.q4_answer_a) {
            score++;
        }
        RadioGroup question5 = (RadioGroup) findViewById(R.id.q_answer_5);
        if (question5.getCheckedRadioButtonId() == R.id.q5_answer_a) {
            score++;
        }
        EditText text = (EditText) findViewById(R.id.rst_text_view);
        String username = text.getText().toString();
        String word = "division";
        if (username.equals(word)) {
            score++;
        }

        Toast.makeText(this, "You answered " + score + " correctly", Toast.LENGTH_SHORT).show();
        score = 0;


    }
}

