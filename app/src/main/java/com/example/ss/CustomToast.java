package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_toast);

        View v = LayoutInflater.from(this).inflate(R.layout.custom_toast_layout, null, false );
        TextView tv = v.findViewById(R.id.tv_text);
        ImageView img  = v.findViewById(R.id.iv_imge);

        tv.setText("hello from my custm Toast");

        Toast t = new Toast(this);
        t.setView(v);
        t.setDuration(Toast.LENGTH_LONG);//المدة

        t.show();


    }


//ملاحظة : تم اضافة onClick في Img داخل ال Toast عندما نضغط عليها ننتقل لل MainActivity

    public void iv_imge (View view){
        Intent intent = new Intent( CustomToast.this, MainActivity.class);
        startActivity(intent);
    }



}
