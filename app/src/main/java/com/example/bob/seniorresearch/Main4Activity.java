package com.example.bob.seniorresearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    int counts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        counts = MainActivity.counter;
        TextView view = findViewById(R.id.textView5);
        view.setText(counts);
    }
}
