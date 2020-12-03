package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
public class Spinnar extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnar);


        Spinner et_spinner = findViewById(R.id.spinner);
        final EditText et_height = findViewById(R.id.height);
        final EditText et_width = findViewById(R.id.width);
        final EditText et_redus = findViewById(R.id.redus);
        final EditText et_base = findViewById(R.id.base);
        final EditText et_till = findViewById(R.id.till);
        final Button et_ok = findViewById(R.id.ok);
        final TextView et_tvx = findViewById(R.id.tvx);




        //القوانين
        // قانون الدائرة  pi = r * r
        // قانون المستطيل الطول * العرض
        // قانون المثلث = نصف القاعدة * الارتفاع


        et_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){



                    case 0:
                        //اختر الشكل
                        et_height.setVisibility(View.GONE);
                        et_width.setVisibility(View.GONE);
                        et_redus.setVisibility(View.GONE);
                        et_base.setVisibility(View.GONE);
                        et_till.setVisibility(View.GONE);
                        et_ok.setVisibility(View.GONE);
                        et_tvx.setVisibility(View.GONE);
                        break;


                    case 1:
                        //الدائرة
                        et_height.setVisibility(View.GONE);
                        et_width.setVisibility(View.GONE);
                        et_redus.setVisibility(View.VISIBLE);
                        et_base.setVisibility(View.GONE);
                        et_till.setVisibility(View.GONE);
                        et_ok.setVisibility(View.VISIBLE);
                        et_tvx.setVisibility(View.VISIBLE);
                        break;


                    case 2:
                        //المثلث
                        et_height.setVisibility(View.GONE);
                        et_width.setVisibility(View.GONE);
                        et_redus.setVisibility(View.GONE);
                        et_base.setVisibility(View.VISIBLE);
                        et_till.setVisibility(View.VISIBLE);
                        et_ok.setVisibility(View.VISIBLE);
                        et_tvx.setVisibility(View.VISIBLE);
                        break;


                    case 3:
                        //المستطيل
                        et_height.setVisibility(View.VISIBLE);
                        et_width.setVisibility(View.VISIBLE);
                        et_redus.setVisibility(View.GONE);
                        et_base.setVisibility(View.GONE);
                        et_till.setVisibility(View.GONE);
                        et_ok.setVisibility(View.VISIBLE);
                        et_tvx.setVisibility(View.VISIBLE);
                        break;


                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });





    }
}
