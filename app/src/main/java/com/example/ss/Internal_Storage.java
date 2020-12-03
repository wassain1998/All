package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Internal_Storage extends AppCompatActivity {


    Button btn_save3, btn_restore3;
    EditText et_username3, et_birthData3, et_email3;

    public static final String FILE_NAME = "users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internal__storage);

        btn_save3 = findViewById(R.id.btn_save3);
        btn_restore3 = findViewById(R.id.btn_res3);
        et_username3 = findViewById(R.id.et_username3);
        et_birthData3 = findViewById(R.id.et_birthData3);
       et_email3 = findViewById(R.id.et_email3);




       //قراءة وحفظ البيانات\
       btn_save3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String username = et_username3.getText().toString();
               String email = et_email3.getText().toString();
               String birthData = et_birthData3.getText().toString();
              //ننشأ مجرى
               // Stream
               try{
              FileOutputStream fos =  openFileOutput(FILE_NAME, MODE_PRIVATE);
              PrintWriter pw = new PrintWriter(fos);
              pw.println(username+ " , "+ email + " , "+ birthData);
              pw.close();
              fos.close();
               }
               catch (FileNotFoundException e){
                   e.printStackTrace();
               }

               catch (IOException e ){
                   e.printStackTrace();
               }
              /*
                 openFileOutput
           يعني افتح مجرى للملف حتى نكتب من خلاله (الملف)

           MODE_PRIVATE
           يعني اي واحد خارج هذا التطبيق لايمكن ان يرى هذا الملف او يتعامل معه
               */

           }
       });


       //الاسترجاع
       btn_restore3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               try{
                   FileInputStream fis = openFileInput(FILE_NAME);
                   InputStreamReader isr = new InputStreamReader(fis);
                   BufferedReader br = new BufferedReader(isr);

                   String allText = "";
                   String temp = "";
                   while ((temp = br.readLine()) !=null){
                       allText += temp;

                   }
                   br.close();
                   isr.close();
                   fis.close();

                   Toast.makeText(Internal_Storage.this ,allText , Toast.LENGTH_LONG).show();
               }
               catch (FileNotFoundException e){
                   Toast.makeText(Internal_Storage.this ,"الملف غير موجود" , Toast.LENGTH_LONG).show();

                   //!= يعني لايساوي
               }

               catch (IOException e ){
                   e.printStackTrace();
               }


           }
       });


    }
}
