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

public class Main2Activity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton q1a, q1b, q1c;
    private Button button;
    String q1 = "0";
    String q2 = "0";
    static int counter1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView question1 = (TextView)findViewById(R.id.questionView);

        Random randomNum = new Random();
        int x = randomNum.nextInt(2);

        radioGroup = (RadioGroup) findViewById(R.id.answers);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case (R.id.q1a):
                        if (q1 == "1") {
                            counter1++;
                            break;
                        }
                    case (R.id.q1b):
                        break;
                    case (R.id.q1c):
                        if (q2 == "1") {
                            counter1++;
                            break;
                        }
                }
            }
        });

        String q1 = "What would be the output of System.out.print(\"Hello World!\")";
        String q12 = "What would be the output of System.out.print(Hello World!)";

        if (x == 0) {
            question1.setText(q1);
            q1 = "1";
            q2 = "0";
        } else {
            question1.setText(q12);
            q1 = "0";
            q2 = "1";
        }
        Button button = findViewById(R.id.q1button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
