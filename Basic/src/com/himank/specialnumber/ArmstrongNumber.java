package com.himank.specialnumber;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the number is armstrong or not");
        int no = sc.nextInt();
        int dig = digit(no);
        boolean rs = arms(no, dig);
        if (rs)
            System.out.println("The number is Armstrong");
        else
            System.out.println("The number is not Armstrong");
    }

    private static int digit(int no) {
        int temp = 0;
        while (no != 0) {
            temp++;
            no /= 10;
        }
        return temp;
    }

    private static boolean arms(int no, int dig) {
        int sum = 0, t = no;
        while (t != 0) {
            int rem = t % 10;
            sum = sum + pro(rem, dig);
            t /= 10;
        }
        return sum == no;
    }

    private static int pro(int rem, int dig) {
        int pro = 1;
        while (dig > 0) {
            pro = pro * rem;
            dig--;
        }
        return pro;
    }
}
