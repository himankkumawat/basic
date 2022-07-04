package com.himank.basic1;

import java.util.Scanner;

public class OddDigitsInNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        countOdd(no);
        sc.close();
    }

    private static void countOdd(int no) {
        int rem, count = 0;
        while (no != 0) {
            rem = no % 10;
            if (rem % 2 != 0)
                count++;
            no = no / 10;
        }
        System.out.println("Total Odd digits are " + count);
    }
}
