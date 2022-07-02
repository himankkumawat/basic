package com.himank.basic1;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a > b)
            System.out.println(a + " is Bigger");
        else if (b > a)
            System.out.println(b + " is Bigger");
        else
            System.out.println("Both the numners are equal");
        sc.close();
    }
}
