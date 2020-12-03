package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Shared_Preferences extends AppCompatActivity {

    SharedPreferences sp;
    SharedPreferences.Editor edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared__preferences);

        Button btn_save = findViewById(R.id.btn_save);//زر التخزين
        Button btn_restore = findViewById(R.id.btn_restore);


        //لأرجاع مؤشر على الملف العام التابع للتطبيق ككل
        sp = PreferenceManager.getDefaultSharedPreferences(this);//لقراءة البيانات
        edit = sp.edit();//لتعديل البيانات


        //كود التخزين
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit.putString("name", "saif ahmed ");
                edit.apply();

            }
        });

        btn_restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  name = sp.getString("name" , " erorr ");

                Toast.makeText(Shared_Preferences.this, name  , Toast.LENGTH_LONG).show();

            }
        });













    }
}
