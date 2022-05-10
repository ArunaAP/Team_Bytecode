package com.example.healthify;

public class CalorieModel {
    private  int id;
    private String result;
    private int age;
    private int height;
    private int weight;
    private String date;

    public CalorieModel(){

    }
    public CalorieModel(String result, int age, int height, int weight, String date) {
        this.result = result;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.date = date;
    }

    public CalorieModel(int id, String result, int age, int height, int weight, String date) {
        this.id = id;
        this.result = result;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
