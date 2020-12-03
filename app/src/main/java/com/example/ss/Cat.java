package com.example.ss;


//مشروع لاضافة صور القطط والاسم
public class Cat {
    private  int img; //الصورة
    private String name ; //الاسم

    public Cat(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
