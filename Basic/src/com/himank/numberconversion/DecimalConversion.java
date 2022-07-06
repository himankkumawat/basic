package com.himank.numberconversion;

import java.util.Scanner;

public class DecimalConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal value");
        int no = sc.nextInt();
        System.out.println("Enter the base value");
        int b = sc.nextInt();
        String s = conv(no, b);
        System.out.println("Equivalent converted Number is " + s);
        sc.close();
    }

    static String conv(int no, int b) {
        String con = "";
        while (no != 0) {
            int rem = no % b;
            if (rem < 10)
                con = rem + con;
            else
                con = (char) (rem + 55) + con;
            no = no / b;
        }
        return con;
    }
}
