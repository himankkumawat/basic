package com.himank.specialnumber;

import java.util.Scanner;

public class SumFibonacciUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms of Fibonacii Terms you want to get sum");
        int no = sc.nextInt();
        int sum = printFib(no);
        System.out.println("Sum is " + sum);
        sc.close();
    }

    private static int printFib(int no) {
        if (no == 0)
            return 0;
        if (no == 1)
            return 1;
        if (no == 2)
            return 2;
        int a = 0, b = 1;
        int c = 1;
        int sum = 0;
        while (c < no) {
            sum += c;
            c = a + b;
            a = b;
            b = c;
        }
        return sum;
    }
}
