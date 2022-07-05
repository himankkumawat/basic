package com.himank.specialnumber;

import java.util.Scanner;

public class Palindrome1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you wnat to print Palindrome Number");
        int no = sc.nextInt();
        int i = 1;
        while (i <= no) {
            if (isPalindrome(i)) System.out.println(i);
            i++;
        }
        sc.close();
    }

    private static boolean isPalindrome(int no) {
        int rev = 0, rem, c = no;
        while (no != 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no /= 10;
        }
        return c == rev;
    }
}
