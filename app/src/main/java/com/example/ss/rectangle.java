package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class rectangle extends AppCompatActivity {
    EditText et_width , et_height;
    TextView et_result;
    Button btn_culculeter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle);

        et_width = findViewById(R.id.et_width_ui);
        et_height = findViewById(R.id.et_height_ui);
        et_result = findViewById(R.id.tv_result_ui);
        btn_culculeter = findViewById(R.id.btn_culct_ui);

        btn_culculeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int width = Integer.parseInt(et_width.getText().toString());
                int height = Integer.parseInt(et_height.getText().toString());
                int area = width * height;
                Intent intent = new Intent();
                intent.putExtra("rectangle_area", area);
                 setResult(1,intent);
                 finish();
            }
        });
    }
}
