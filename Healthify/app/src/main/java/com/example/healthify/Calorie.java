package com.example.healthify;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calorie {

    private String Gender;
    private int age ;
    private int height;
    private int weight;

    public Calorie(){

    }


    public Calorie(String gender, int age, int height, int weight) {
        Gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Calorie(int age, int height, int weight) {
    }


    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double calculateCalorie() {
        int result = weight + height - age + 5;
        return result;
    }


    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
