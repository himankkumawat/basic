package com.himank.basic2;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is strong number or not");
        int no = sc.nextInt();
        boolean rs = isStrong(no);
        if (rs)
            System.out.println("The number is strong Number");
        else
            System.out.println("The number is not strong number");
    }

    private static boolean isStrong(int no) {
        int no1 = no, sum = 0;
        while (no1 != 0) {
            int rem = no1 % 10;
            sum = sum + fact(rem);
            no1 = no1 / 10;
        }
        return sum == no;
    }

    private static int fact(int no) {
        int pro = 1;
        while (no != 0) {
            pro = pro * no;
            no--;
        }
        return pro;
    }
}
