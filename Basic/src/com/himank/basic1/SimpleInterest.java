package com.himank.basic1;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        long amt = sc.nextLong();
        System.out.println("Enter the Rate of Interest");
        double r = sc.nextDouble();
        System.out.println("Enter the time ");
        double y = sc.nextDouble();
        double si = (amt * r * y) / 100;
        System.out.println("The Simple Interest is " + si);

        sc.close();
    }
}
