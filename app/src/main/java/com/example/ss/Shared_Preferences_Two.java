package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Shared_Preferences_Two extends AppCompatActivity {

    SharedPreferences sp;
    SharedPreferences.Editor edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared__preferences__two);

            Button btn_save_two = findViewById(R.id.btn_save_two);//زر التخزين
            Button btn_restore_two = findViewById(R.id.btn_restore_two);


            //لأرجاع مؤشر على الملف الخاص حسب الاسم المدخل

            sp = getSharedPreferences("saif", MODE_PRIVATE); //لقراءة البيانات
            edit = sp.edit();//لتعديل البيانات


            //كود التخزين
            btn_save_two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    edit.putString("name", "saif ahmed ");
                    edit.apply();

                }
            });

            btn_restore_two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String  name = sp.getString("name" , " erorr ");

                    Toast.makeText(Shared_Preferences_Two.this, name  , Toast.LENGTH_LONG).show();

                }
            });






        }
}
