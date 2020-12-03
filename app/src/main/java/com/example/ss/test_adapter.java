package com.example.ss;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class test_adapter extends AppCompatActivity {
final int REQ_CODE_ADD = 1;
PostAdapter adapter;
ListView lv;
Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_adapter);

        lv = findViewById(R.id.test_list);
        btn_add = findViewById(R.id.list_btn_add);






        ArrayList<Post> posts = new ArrayList<>();
      posts.add(new Post("12 , may 2015", "saif ahmed ", "wlcome to java ",  15,  26,  19 ));
        posts.add(new Post("14 , jun 2023", "mohamed ahmed ", "wlcome tmhamed ", 12, 100, 35 ));
        posts.add(new Post("18 , April 2000", "Hussam Mohamed ", "wlcome to #C ", 100, 200, 28 ));












        PostAdapter adapter = new PostAdapter(this, R.layout.custom_post_layout,posts);
        lv.setAdapter(adapter);



        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), AddPostActivity.class);
               startActivityForResult(intent,REQ_CODE_ADD);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQ_CODE_ADD && resultCode == RESULT_OK){
            Post p = (Post) data.getSerializableExtra(AddPostActivity.POST_CON_NAME);
            adapter.addItem(p);
            adapter.notifyDataSetChanged();
        }
}
}

// super.onActivityResult(requestCode, resultCode, data);