package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class send extends AppCompatActivity {
Button btn_send_ui;
EditText et_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send);

        btn_send_ui = findViewById(R.id.btn_send);
        et_name = findViewById( R.id.ed_ui);

        btn_send_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext() , Listsss.class);
                intent.putExtra("user_name",et_name.getText().toString());
                startActivity(intent);
            }
        });


    }
}
