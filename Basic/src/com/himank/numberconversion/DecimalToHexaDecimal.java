package com.himank.numberconversion;

import java.util.Scanner;

public class DecimalToHexaDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal value");
        int no = sc.nextInt();
        String s = decToHex(no);
        System.out.println("Equivalent Hexadecimal is " + s);
        sc.close();
    }

    private static String decToHex(int no) {
        String hx = "";
        while (no != 0) {
            int rem = no % 16;
            if (rem < 10)
                hx = rem + hx;
            else
                hx = (char) (rem + 55) + hx;
            no = no / 16;
        }
        return hx;
    }
}
