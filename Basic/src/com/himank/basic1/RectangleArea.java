package com.himank.basic1;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        area(length, width);
        sc.close();
    }

    private static void area(double l, double w) {
        double a = l * w;
        System.out.println("Area = " + a);
    }
}
