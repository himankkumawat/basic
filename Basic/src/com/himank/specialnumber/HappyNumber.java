package com.himank.specialnumber;

import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Happy number or not");
        int no = sc.nextInt();
        isHappy(no);
        sc.close();
    }

    private static void isHappy(int no) {
        while (no > 9) {
            int sum = 0;
            while (no != 0) {
                int rem = no % 10;
                sum += (rem * rem);
                no /= 10;
            }
            no = sum;
        }
        if (no == 1 || no == 7)
            System.out.println("The number is a Happy Number");
        else
            System.out.println("The number is not a Happy Number");
    }
}
