package com.example.ss;



//عملنا الاوبجكت هذا لغرض تجميع البيانات وارسالها مرة واحدة
public class Car {

    private int id ;
    private String model;
    private String color;
    private double dp1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDp1() {
        return dp1;
    }

    public void setDp1(double dp1) {
        this.dp1 = dp1;
    }


    //للأدراج _ isert
    public Car(int id, String model, String color, double dp1) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.dp1 = dp1;
    }

    //للتحديث_Update
    public Car(String model, String color, double dp1) {
        this.model = model;
        this.color = color;
        this.dp1 = dp1;
    }




}
