package com.himank.numberconversion;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal value");
        int no = sc.nextInt();
        String bin = "";
        while (no != 0) {
            int rem = no % 2;
            bin = rem + bin;
            no /= 2;
        }
        System.out.println("Binary value is " + bin);
        sc.close();
    }
}
