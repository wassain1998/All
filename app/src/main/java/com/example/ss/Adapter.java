package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;



public class Adapter extends AppCompatActivity {
    ListView arry1;
    Button btn_add;
    EditText et_name;
    Myadapter_class adapter;

    //ملاحظة: يوجد كلاس تابع لهذا ال Activity اسمه Myadapter_class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter);

        arry1 = findViewById(R.id.ssssss);
        btn_add = findViewById(R.id.list_btn_add);
        et_name = findViewById(R.id.list_et);



        ArrayList<String> names =  new ArrayList<>();
       for (int i=1; i<5;i++)
           names.add("Name #"+i);

      final Myadapter_class adapter = new Myadapter_class(this,android.R.layout.simple_list_item_1,names);
        arry1.setAdapter(adapter);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addItem(et_name.getText().toString());
                adapter.notifyDataSetChanged();

            }
        });


    }


}







