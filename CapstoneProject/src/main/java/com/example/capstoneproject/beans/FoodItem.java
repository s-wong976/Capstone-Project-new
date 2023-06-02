package com.example.capstoneproject.beans;

public class FoodItem {
    private int id;
    private String name;

    private float price;

    public FoodItem(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
