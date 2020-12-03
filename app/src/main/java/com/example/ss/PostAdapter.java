package com.example.ss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapter extends BaseAdapter {
    private Context c;
    private  int resource;
    private ArrayList<Post> posts;

    public PostAdapter (Context c, int resource, ArrayList<Post> posts ){
        this.c = c;
        this.posts = posts;
        this.resource = resource;
    }

    public void addItem(Post post){
        this.posts.add(post);
        notifyDataSetChanged();
    }

    @Override
      public int getCount() {
          return posts.size();
      }
      
             @Override
      public Post getItem(int position) {
          return posts.get(position);
      }

              @Override
      public long getItemId(int position) {
          return 0;
      }

             @Override
      public View getView(int position, View view, ViewGroup viewGroup) {

          View v = view;
          if (v == null){
              v = LayoutInflater.from(c).inflate(resource, null , false);
          }
          //in flate
                 TextView tv_data = v.findViewById(R.id.custom_post_tv_data);
                 TextView tv_name = v.findViewById(R.id.custom_post_tv_name);
                 TextView tv_following = v.findViewById(R.id.custom_post_tv_following_data);
                 TextView tv_followers = v.findViewById(R.id.custom_post_tv_follwers_data);
                 TextView tv_posts = v.findViewById(R.id.custom_post_tv_posts_data);
                 TextView tv_body = v.findViewById(R.id.custom_post_tv_body);



                 Post  p = getItem(position);


                 tv_data.setText(p.getData());
                 tv_name.setText(p.getName());
                 tv_body.setText(p.getBody());
                 tv_followers.setText(p.getFollowers()+"");
                 tv_following.setText(p.getFollowing()+"");
                 tv_posts.setText(p.getPosts()+"");
                 return v;
      }
}

