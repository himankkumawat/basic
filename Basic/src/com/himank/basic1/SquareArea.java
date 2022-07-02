package com.himank.basic1;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square");
        double side = sc.nextDouble();
        double area = area(side);
        System.out.println(area);
        System.out.println(area(side));
        sc.close();
    }

    private static double area(double side) {
        return (side * side);
    }
}
