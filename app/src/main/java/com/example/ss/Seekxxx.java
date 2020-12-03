package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class Seekxxx extends AppCompatActivity {
SeekBar ui_seek ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekxxx);

        ui_seek = findViewById(R.id.seekBar);

        ui_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            //دالة تحريك الشريط
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getBaseContext(),"Vules: " +progress, Toast.LENGTH_LONG).show();
            }
// دالة الضغط على الشريط
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getBaseContext(),"Start" , Toast.LENGTH_LONG).show();
            }
// دالة رفع الاصبع من الشريط
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getBaseContext(),"Stop" , Toast.LENGTH_LONG).show();

            }
        });
    }
}
