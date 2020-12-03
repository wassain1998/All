package com.example.ss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Recycler_View extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler__view);

        rv =  findViewById(R.id.rv_main);
      //  DatabaseAccess db = DatabaseAccess.getInstance(this);//تابعة للفديو ميتين واربعين في الدقيقة عشرة وسبعطش ثانية

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(R.drawable.cat1, "Cat 1"));
        cats.add(new Cat(R.drawable.cat2, "Cat 2"));
        cats.add(new Cat(R.drawable.cat3, "Cat 3"));

        RecyclerViewAdapter adapter  = new RecyclerViewAdapter(cats);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);

        rv.setHasFixedSize(true);//يعني ان العناصر ثابتة ولايتغير حجم عَرضها
        rv.setLayoutManager(lm);//تمرير LayoutManger
        rv.setAdapter(adapter);//تمرير Adapter




    }
}





















/*
    file xml:activity_main
    file java:MainActivity

    Class java : RecyclerViewAdapter
    Class java : Cat
    Class xml : cat_custom_item

 */