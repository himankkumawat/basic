package com.himank.basic1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural number");
        int no = sc.nextInt();
        fact(no);
    }

    private static void fact(int no) {
        int prod = 1;
        while (no > 1) {
            prod *= no;
            no -= 1;
        }
        System.out.println("Factorial is " + prod);
    }
}
