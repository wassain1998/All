package com.example.ss;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class ImgCam extends AppCompatActivity {

    ImageButton btn;
    ImageView image;

    final static  int CAPTURE_REQ_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imgcam);

        btn = findViewById(R.id.btn_image_ui);
        image = findViewById(R.id.image_ui);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent();
                in.setAction(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(in, CAPTURE_REQ_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAPTURE_REQ_CODE && resultCode == RESULT_OK){
            Bitmap b = (Bitmap) data.getExtras().get("data");
            image.setImageBitmap(b);
        }
         else {
            Toast.makeText(this,  "حدث خطأ", Toast.LENGTH_LONG).show();
        }
    }
}
