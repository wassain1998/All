package com.example.ss;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//تعبأة البيانات
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CatViewHolder> {
ArrayList<Cat> cats;

    public RecyclerViewAdapter(ArrayList<Cat> cats) {
        this.cats = cats;
    }



    @NonNull
    @Override
    public RecyclerViewAdapter.CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate( R.layout.cat_custom_item , null , false  );

        CatViewHolder viewHolder =  new CatViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.CatViewHolder holder, int position) {
        Cat c = cats.get(position);
        holder.iv_img.setImageResource(c.getImg());
        holder.tv_name.setText(c.getName());

    }

    @Override
    public int getItemCount() {
        return cats.size();
    }


    //Class holder for Recycler View

    class CatViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        ImageView iv_img;
        public CatViewHolder (@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.cat_custom_tv);
            iv_img = itemView.findViewById(R.id.cat_custom_iv);
        }
    }



}
