package com.himank.specialnumber;

import java.util.Scanner;

public class FibonacciTerms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms of Fibonacii Terms you want to print");
        int no = sc.nextInt();
        printFib(no);
        sc.close();
    }

    private static void printFib(int no) {
        int a = 0, b = 1, count = 3;
        int c;
        if (no == 1)
            System.out.println(a);
        else if (no == 0)
            System.out.println("Wrong input");
        else {
            System.out.println(a);
            System.out.println(b);
        }
        while (count <= no) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            count++;
        }
    }
}
