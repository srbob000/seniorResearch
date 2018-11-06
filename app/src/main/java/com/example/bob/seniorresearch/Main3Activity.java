package com.example.bob.seniorresearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton q2a, q2b, q2c;
    private Button button2;
    String q1 = "0";
    String q2 = "0";
    static int counter2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String q21 = "What is the output of System.out.print(\"\\\\Hello World!\")";
        String q22 = "What is the output of System.out.print(\"Hello \\n World!\")";

        TextView questions = (TextView) findViewById(R.id.question2);
        Random randomNum = new Random();
        int x = randomNum.nextInt(2);

        if (x == 0) {
            questions.setText(q21);
            q1 = "1";
            q2 = "0";
        } else {
            questions.setText(q22);
            q1 = "0";
            q2 = "1";
        }

        radioGroup = (RadioGroup) findViewById(R.id.answers2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case (R.id.q2a):
                        if (q1 == "1") {
                            counter2++;
                            break;
                        }
                    case (R.id.q2b):
                        if (q2 == "1") {
                            counter2++;
                            break;
                        }

                    case (R.id.q2c):
                        break;
                }
            }
        });
        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
    }
}
