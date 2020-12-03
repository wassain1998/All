package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Listsss extends AppCompatActivity {
ListView lv;
TextView tv_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        lv = findViewById(R.id.ListView);
        tv_name =findViewById(R.id.tv_name_ui);//استقبال البيانات

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"Vules: " +position, Toast.LENGTH_LONG).show();
            }
        });
        //استقبال البيانات

        Intent i = getIntent();
        String name = i.getStringExtra("user_name");
        tv_name.setText(name);
    }
}
