package com.himank.arrays;

import java.util.Scanner;

public class NumberToSentence {

    static String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] two = {"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        nToWord(n / 10000000 % 100, "Crore ");
        nToWord(n / 100000 % 100, " Lakh");
        nToWord(n / 1000 % 100, " Thousand");
        nToWord(n / 100 % 10, " Humdred");
        nToWord(n % 100, "");
    }

    private static void nToWord(int n, String s) {
        if (n < 20) {
            System.out.print(one[n]);
        } else {
            System.out.print(two[n / 10] + one[n % 10] + " ");
        }
        if (n != 0) {
            System.out.print(s + " ");
        }
    }
}
