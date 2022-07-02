package com.himank.basic1;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer ");

        int no = sc.nextInt();
        if (no % 2 == 0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }
        sc.close();
    }
}
