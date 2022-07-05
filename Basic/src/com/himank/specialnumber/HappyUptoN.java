package com.himank.specialnumber;

import java.util.Scanner;

public class HappyUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which Happy Number has to be printed");
        int no = sc.nextInt();
        int i = 1;
        while (i <= no) {
            if (isHappy(i))
                System.out.println(i);
            i++;
        }
        sc.close();
    }

    private static boolean isHappy(int no) {
        while (no > 9) {
            int sum = 0;
            while (no != 0) {
                int rem = no % 10;
                sum += (rem * rem);
                no /= 10;
            }
            no = sum;
        }
        return no == 1 || no == 7;
    }
}
