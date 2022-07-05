package com.himank.specialnumber;

import java.util.Scanner;

// Disarium : Sum of power of individual digit by their position.
public class Disarium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is Disarium Number or not");
        int no = sc.nextInt();
        isDisarium(no);
        sc.close();
    }

    private static void isDisarium(int no) {
        int dig = digit(no);
        int sum = 0, no1 = no, rem;
        while (no1 != 0) {
            rem = no1 % 10;
            no1 /= 10;
            sum = sum + power(rem, dig);
            dig--;
        }
        if (sum == no)
            System.out.println("Disarium Number");
        else
            System.out.println("Not Disarium Number");
    }

    private static int digit(int no) {
        int count = 0;
        if (no == 0)
            count = 1;
        while (no != 0) {
            count++;
            no /= 10;
        }
        return count;
    }

    private static int power(int rem, int dig) {
        int pw = 1;
        while (dig > 0) {
            pw *= rem;
            dig--;
        }
        return pw;
    }
}
