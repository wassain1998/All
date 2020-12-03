package com.example.ss;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;


public class Calendarsss extends AppCompatActivity {
    CalendarView ui_cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_view);

        ui_cv = findViewById(R.id.calendarView);

        ui_cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getBaseContext(),"year"+year + "month"+month + "day"+dayOfMonth, Toast.LENGTH_LONG).show();
            }
        });
    }
}
