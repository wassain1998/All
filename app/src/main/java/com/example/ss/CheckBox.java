package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class CheckBox extends AppCompatActivity {

ProgressBar pb_progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box);

        pb_progressBar = findViewById(R.id.ui_pb_progressBar);

        pb_progressBar.setMax(80);


        }
    }

