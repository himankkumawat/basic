package com.himank.numberconversion;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary value");
        int no = sc.nextInt();
        int dec = binTDec(no);
        System.out.println("Decimal value is: " + dec);
        sc.close();
    }

    private static int pow(int n, int p) {
        int pw = 1;
        while (p > 0) {
            pw = pw * n;
            p--;
        }
        return pw;
    }

    private static int binTDec(int bin) {
        int dec = 0, c = 0;
        while (bin != 0) {
            int rem = bin % 10;
            dec = dec + rem * pow(2, c);
            c++;
            bin = bin / 10;
        }
        return dec;
    }
}
