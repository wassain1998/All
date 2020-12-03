package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;


public class Progressxxx extends AppCompatActivity {
ProgressBar pb_progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar);

        pb_progressBar = findViewById(R.id.ui_pb_progressBar);

       pb_progressBar.setMax(100);

    }
}
