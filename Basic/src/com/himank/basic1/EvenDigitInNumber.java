package com.himank.basic1;

import java.util.Scanner;

public class EvenDigitInNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int rem, count = 0;
        while (no != 0) {
            rem = no % 10;
            if (rem % 2 == 0) {
                count++;
            }
            no /= 10;
        }
        System.out.println("Total Even digits are " + count);
    }
}
