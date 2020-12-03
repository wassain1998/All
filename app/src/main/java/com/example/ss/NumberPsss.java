package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.Toast;

public class NumberPsss extends AppCompatActivity {
    NumberPicker np ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_picker);

        np = findViewById(R.id.NumberPicker);

        //دالتين واجب كتابتهن
        np.setMaxValue(30);// اعلى قيمة
        np.setMinValue(1); //اقل قيمة

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(getBaseContext(), ": "+newVal, Toast.LENGTH_LONG).show();
            }
        });
    }
}
