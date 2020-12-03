package com.example.ss;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Explicittamreen extends AppCompatActivity {

    Button btn_triangle, btn_rectangle;
    TextView tv_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicittamreen);

        btn_triangle = findViewById(R.id.main_btn_triangle);
        btn_rectangle = findViewById(R.id.main_btn_rectangle);
        tv_result = findViewById(R.id.main_tv_result);


        btn_triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext() , triangle.class);
                startActivityForResult(intent, 1);
            }
        });

        btn_rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(),  rectangle.class);
                startActivityForResult(intent, 2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            String oldText = tv_result.getText().toString();
            int newArea = data.getIntExtra("rectangle_area", 0);
            tv_result.setText(oldText + "\nRectangle"+ newArea);
        }



       else if(requestCode == 2){
            String oldText = tv_result.getText().toString();
            double newArea = data.getDoubleExtra("triangle_area", 0);
            tv_result.setText(oldText + "\ntriangle"+ newArea);
        }

    }
}
