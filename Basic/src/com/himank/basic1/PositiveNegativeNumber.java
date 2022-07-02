package com.himank.basic1;

import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();
        if (no >= 0)
            System.out.println("Number is a positive number.");
        else
            System.out.println("Number is a negative number.");
        sc.close();
    }
}
