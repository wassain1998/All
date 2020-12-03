package com.example.ss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Myadapter_class extends BaseAdapter {

    Context context;
    ArrayList<String> data;
    int resource;
    public Myadapter_class (Context c ,int resource, ArrayList<String> data){
        this.context = c;
        this.data = data;
        this.resource = resource;
    }
    public void addItem (String item){
        data.add(item);
    }

    @Override
    public int getCount() {// دالة ترجع طول المصفوفة
        return data.size();
    }

    //ملاحظة الدالة Object getItem والدالة getItemId ممكن ان نستغني عنهم دون ان كتب تحتهم كود

    @Override
    public String getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
            View v = view;
        if(v==null){
            v = LayoutInflater.from(context).inflate(resource, null , false);

        }

        TextView tv = v.findViewById(android.R.id.text1);
        String name = getItem(position);
        tv.setText(name);
        return v;
    }


}

// دوال ثابتة تكتب تحت الكلاس ويتم معالجتها فيما بعد
/**
 *  @Override
 *     public int getCount() {
 *         return data.size();
 *     }
 *
 *
 *
 *     @Override
 *     public Object getItem(int position) {
 *         return null;
 *     }
 *
 *     @Override
 *     public long getItemId(int position) {
 *         return 0;
 *     }
 *
         *     @Override
 *     public View getView(int position, View view, ViewGroup viewGroup) {
        *         return null;
        *     }
        */
