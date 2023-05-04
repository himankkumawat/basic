package com.himank.java.serialization.example1;

import java.io.Serializable;

public class Vehicle implements Serializable {
    int price;
    String color;

    public Vehicle(int price, String color) {
        this.price = price;
        this.color = color;
    }
}
