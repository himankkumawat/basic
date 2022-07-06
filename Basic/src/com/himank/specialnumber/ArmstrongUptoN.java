package com.himank.specialnumber;

import java.util.Scanner;

public class ArmstrongUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the number is armstrong or not");
        int no = sc.nextInt();
        int i = 1, dig;
        while (i <= no) {
            dig = digit(i);
            if (arms(i, dig))
                System.out.println(i);
            i++;
        }
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
