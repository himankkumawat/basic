package com.himank.specialnumber;

import java.util.Scanner;

public class FibonacciUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms of Fibonacii Terms you want to print");
        int no = sc.nextInt();
        printFib(no);
        sc.close();
    }

    private static void printFib(int no) {
        int a = 0, b = 1;
        int c = 1;
        if (no == 1)
            System.out.println(a);
        else if (no == 0)
            System.out.println("Wrong input");
        else
            System.out.println(a);
        while (c < no) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
