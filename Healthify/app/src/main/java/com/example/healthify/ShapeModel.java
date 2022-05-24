 package com.example.healthify;

public class ShapeModel {

    private static int hip;
    private int id;
    private String result;
    private int age;
    private int bust;
    private int waist;
    private int highHip;
    private String date;
    private int shape;
    private Integer highhip;


    public ShapeModel(int bust) {

    }

    public ShapeModel(int id, String result, int age, int bust, int waist, int hip, int highHip, String date) {
        this.id = id;
        this.result = result;
        this.age = age;
        this.waist = waist;
        this.hip = hip;
        this.highHip = highHip;
        this.date = date;
    }

    public ShapeModel(String finalResult, int AGE, int BUST, int WAIST, int HIP, int HIGHHIP, String date) {
        this.result = result;
        this.age = age;
        this.waist = waist;
        this.hip = hip;
        this.highHip = highHip;
        this.date = this.date;
    }

    public static Integer getHip() {


        return hip;
    }

    public static void setHip(Integer hip) {
        ShapeModel.hip = hip;
    }


    public int calculate(){

        int bust = 0;
        if ((bust - hip) <= 1 && (hip - bust) < 3.6 && (bust - waist) >= 9 || (hip - waist) >= 10){
            return R.drawable.hour_glass;
        } else if ((hip - bust) > 2 && (hip - waist) >= 7 && (highHip/waist) >= 1.193){
            return R.drawable.pear;
        } else if ((bust - hip) >= 3.6 && (bust - waist) < 9) {
            return R.drawable.apple;
        }else if ((hip - bust) < 3.6 && (bust - hip) < 3.6 && (bust - waist) < 9 && (hip - waist) < 10){
            return R.drawable.inverted_triangle;
        }

        return R.drawable.shapes;
    }

    public int getShape() {

        return this.shape;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public Integer getBust() {
        return bust;
    }

    public void setBust(Integer bust) {
        this.bust = bust;
    }

    public Integer getWaist() {
        return waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Integer getHighhip() {
        return highhip;
    }

    public void setHighhip(Integer highhip) {
        this.highhip = highhip;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWaist(int waist) {
        this.waist = waist;

    }


    }

