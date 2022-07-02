package com.himank.basic1;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double r1 = sc.nextDouble();
        area(r1);
        sc.close();
    }

    private static void area(double r) {
        double area = 3.14 * r * r;
        System.out.println("Area is " + area);
    }
}
