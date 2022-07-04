package com.himank.basic1;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total digits are " + countDigits(n));
        sc.close();
    }

    private static int countDigits(int n) {
        int count = 0;
        if (n == 0)
            return 1;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
