package com.himank.numberconversion;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Hexadecimal value");
        String st = sc.next();
        int dec = hexToDec(st);
        System.out.println(dec);
        sc.close();
    }

    private static int hexToDec(String st) {
        int dec = 0, c = 0;
        int i = st.length() - 1;
        while (i >= 0) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'F')
                dec = dec + (ch - 55) * pow(16, c);
            else if (ch >= 'a' && ch <= 'f')
                dec = dec + (ch - 87) * pow(16, c);
            else
                dec = dec + (ch - 48) * pow(16, c);
            c++;
            i--;
        }
        return dec;
    }

    private static int pow(int a, int c) {
        int pow = 1;
        while (c != 0) {
            pow = pow * a;
            c--;
        }
        return pow;
    }
}
