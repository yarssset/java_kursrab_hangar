package com.kursach.app;

import java.io.Serializable;


enum Category {
    ELITE("элитное"),
    COLLECTION("коллекционное"),
    UNKNOWN("неизвестно"),
    ORDINARY("ординарное");

    private final String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}


public class INFO implements Serializable {

    private String name;
    private  int year;
    private Category category;

    private  double strength;
    private double  price ;
    private int stock;

    public INFO(String name, int year, Category category, double strength, double price, int stock) {

        this.name = name;
        this.year = year;
        this.category = category;
        this.strength = strength;
        this.price = price;
        this.stock = stock;
    }

    /**
     * используется для конвертации полностью текстовых данных в объект класса
     */
    public INFO(String name, String year, String category, String strength, String price, String stock) {
        this.name = name;
        this.year = Integer.parseInt( year);
        this.category = Category.UNKNOWN;
        for (Category c : Category.values()){
            if (category.equals(c.getCategory())){
                this.category = c;
            }
        }
        this.strength = Double.parseDouble(strength);
        this.price = Double.parseDouble(price);
        this.stock = Integer.parseInt(stock);
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Category getCategory() {
        return category;
    }

    public double getStrength() {
        return strength;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
