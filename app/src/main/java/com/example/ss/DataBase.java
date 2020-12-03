package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class DataBase extends AppCompatActivity {

    Button btn_save, btn_restore;
    EditText et_model, et_color, et_distance;
    MyDatabase db;//انفلات للمؤشر


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_base);

        btn_save = findViewById(R.id.btn_save5);
        btn_restore = findViewById(R.id.btn_res5);
        et_model = findViewById(R.id.et_model);
        et_color = findViewById(R.id. et_color);
        et_distance = findViewById(R.id.et_distance);


        db = new MyDatabase(this);//انشئ الداتا بيس اذا كانت غير موجودة واذا كانت موجودة هات مؤشر الداتا بيس


        // لأنشاء قواعد البيانات
      //  MyDatabase db = new MyDatabase(this);


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String model = et_model.getText().toString();
                String color = et_color.getText().toString();
                double dbl  = Double.parseDouble(et_distance.getText().toString());

                Car c = new Car (model,color,dbl);
                boolean res = db.insertCar(c);

                if(res)
                    Toast.makeText(DataBase.this, "Succses insertion", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(DataBase.this, "Erorr occurred", Toast.LENGTH_LONG).show();

            }
        });
//الخطأ في استرجاع البيانات فقط
        btn_restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ملاحظة يرجى ارجاع الكود حسب ترتيب الفديو 211 ومابعد هذا الفديو يكون في زر عملية اخرى مختلفة

              ArrayList <Car> cars = db.getCars("2018");//هات كل السيارات وخزنها في المصفوفة
                //نطبع Toast بعدد العناصر
                //Toast.makeText(DataBase.this, "#"+cars.size(), Toast.LENGTH_LONG).show();

                for (Car c : cars) {

                    Log.d("car #"+c.getId(),c.getModel());
                }

            }


        });

    }
}


