package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Implicitcall extends AppCompatActivity {
    Button btn_call;
    TextView et_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicitcall);
        btn_call = findViewById(R.id.btn_call_ui);
        et_call = findViewById(R.id.et_call_ui);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = et_call.getText().toString();
                Intent intent =  new  Intent();
                intent.setAction(Intent.ACTION_DIAL);

                // Universal Resource Identifier URI

                Uri uri = Uri.parse("tel:"+ number);
                intent.setData(uri);
                startActivity(intent);

            }
        });




    }
}
