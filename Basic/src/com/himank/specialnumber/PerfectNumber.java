package com.himank.specialnumber;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is Perfect Number or not");
        int no = sc.nextInt();
        isPerfect(no);
        sc.close();
    }

    private static void isPerfect(int no) {
        int rem, sum = 0, i = 1;
        boolean rs;
        while (i <= no / 2) {
            rs = isDivisible(no, i);
            if (rs)
                sum = sum + i;
            i++;
        }
        if (sum == no)
            System.out.println("Number is Perfect Number");
        else
            System.out.println("Number is not Perfect Number");
    }

    private static boolean isDivisible(int no, int i) {
        return no % i == 0;
    }
}
