package com.himank.basic2;

import java.util.Scanner;

public class SquareOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the square of digits");
        int no = sc.nextInt();
        int sum = squareOfDigit(no);
        System.out.println("The sum of square of digits is " + sum);
        sc.close();
    }

    private static int squareOfDigit(int no) {
        int sum = 0;
        while (no != 0) {
            int rem = no % 10;
            sum = sum + (rem * rem);
            no /= 10;
        }
        return sum;
    }
}
