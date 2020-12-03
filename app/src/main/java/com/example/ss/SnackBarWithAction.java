package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarWithAction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_bar_with_action);

        Button btn = findViewById(R.id.btn_s);


        Snackbar s = Snackbar.make(btn,"hello", Snackbar.LENGTH_LONG);
        s.setAction("Ok", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SnackBarWithAction.this, "Ok Clicked", Toast.LENGTH_LONG).show();
            }
        });
        s.show();
    }
}
