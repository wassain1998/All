package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Shared_Preferences_Exercise extends AppCompatActivity {
    SharedPreferences sp;
    SharedPreferences.Editor edit;


    Button btn_save, btn_restors;
    EditText et_username, et_email, et_birthData;



    //المفاتيح_Keys
    public final String USERNAME_KEY = "username";
    public final String EMAIL_KEY    = "email";
    public final String BARITHDATA_KEY = "birthData";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared__preferences_exercise);

        btn_save = findViewById(R.id.btn_save2);
        btn_restors = findViewById(R.id.btn_res);
        et_username = findViewById(R.id.et_username);
        et_email = findViewById(R.id.et_email);
        et_birthData = findViewById(R.id.et_birthData);



        sp = PreferenceManager.getDefaultSharedPreferences(this);
        edit = sp.edit();

        //دالة الحفظ

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String email = et_email.getText().toString();
                String birthData = et_birthData.getText().toString();

                //هنا تم استدعاء المفاتيح_Kays
                edit.putString(USERNAME_KEY, username);
                edit.putString(EMAIL_KEY, email);
                edit.putString(BARITHDATA_KEY, birthData);
                edit.apply();
            }
        });


        //دالة الارجاع

        btn_restors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = sp.getString(USERNAME_KEY, null );
                String email = sp.getString(EMAIL_KEY, null );
                String birthData = sp.getString(BARITHDATA_KEY, null );

                Toast.makeText(Shared_Preferences_Exercise.this, username+" | " + email+ " | "+ birthData, Toast.LENGTH_LONG).show();


            }
        });




    }


    @Override
    protected void onDestroy() {//تم كتابة هذه الدالة لحفظ المعلومات في التطبيق  عندما يخرج المستخدم من التطبيق
        super.onDestroy();

        String username = et_username.getText().toString();
        String email = et_email.getText().toString();
        String birthData = et_birthData.getText().toString();

        edit.putString(USERNAME_KEY, username);
        edit.putString(EMAIL_KEY, email);
        edit.putString(BARITHDATA_KEY, birthData);
        edit.apply();
    }
}
