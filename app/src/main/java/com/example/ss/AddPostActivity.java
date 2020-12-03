package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class AddPostActivity extends AppCompatActivity {

    EditText et_name , et_body, et_data, et_followers, et_following, et_posts;
    Button btn_add;


   static final String POST_CON_NAME = "post";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
//inflata
        et_name = findViewById(R.id.add_post_name);
        et_body = findViewById(R.id.add_post_body);
        et_data = findViewById(R.id.add_post_data);
        et_followers = findViewById(R.id.add_post_followers);
        et_following = findViewById(R.id.add_post_following);
        et_posts = findViewById(R.id.add_post_posts);
       // et_spase = findViewById(R.id.spase);

       btn_add = findViewById(R.id.add_btn_save);

       btn_add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String name = et_name.getText().toString();
               String body = et_body.getText().toString();
               String data = et_data.getText().toString();
               int followers = Integer.parseInt(et_followers.getText().toString());
               int following = Integer.parseInt(et_following.getText().toString());
               int posts = Integer.parseInt(et_posts.getText().toString());
            //   int spase = Integer.parseInt(et_spase.getText().toString());

               Post post = new Post (data, name, body,  followers, following, posts);

               Intent intent = new Intent();
               intent.putExtra(POST_CON_NAME,post);

               setResult(RESULT_OK,intent);
               finish();

           }
       });

    }
}
