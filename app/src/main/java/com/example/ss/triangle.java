package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangle extends AppCompatActivity {

    EditText et_base , et_height;
    TextView et_result;
    Button btn_culculeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);

        et_base = findViewById(R.id.et_base_ux);
        et_height = findViewById(R.id.et_height_ux);
        et_result = findViewById(R.id.tv_result_ux);
        btn_culculeter = findViewById(R.id.btn_culct_ux);

        btn_culculeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int base = Integer.parseInt(et_base.getText().toString());
                int height = Integer.parseInt(et_height.getText().toString());

                double area = 0.5 * base * height;
                Intent intent = new Intent();
                intent.putExtra("triangle_area", area);
                setResult(1,intent);
                finish();
            }
        });

    }
}
