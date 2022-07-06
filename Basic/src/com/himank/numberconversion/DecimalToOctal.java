package com.himank.numberconversion;

import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal value");
        int no = sc.nextInt();
        String s = decToOct(no);
        System.out.println("Equivalent Octal is " + s);
        sc.close();
    }

    private static String decToOct(int no) {
        String oct = "";
        while (no != 0) {
            int rem = no % 8;
            oct = rem + oct;
            no = no / 8;
        }
        return oct;
    }
}
