package com.himank.specialnumber;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        reverse(no);
        sc.close();
    }

    private static void reverse(int no) {
        int rev = 0, rem;
        while (no != 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no /= 10;
        }
        System.out.println("Reverse is " + rev);
    }
}
