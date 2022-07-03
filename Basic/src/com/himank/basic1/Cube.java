package com.himank.basic1;

import java.util.Scanner;

public class Cube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double no = sc.nextDouble();
        double c = cube(no);
        System.out.println(c);
        sc.close();
    }

    private static double cube(double no) {
        return no * no * no;
    }
}
