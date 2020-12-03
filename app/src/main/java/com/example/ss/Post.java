package com.example.ss;

import java.io.Serializable;

public class Post implements Serializable {
    private String data;
    private String name;
    private String body;
    private int followers;
    private int following;
    private int posts;
   // private int img;

    public Post(String data, String name, String body, int followers, int following, int posts) {
        this.data = data;
        this.name = name;
        this.body = body;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
       // this.img = img;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }
/**
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
 **/
}
