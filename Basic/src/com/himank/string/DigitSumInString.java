package com.himank.string;

import java.util.Scanner;

//E.g. Fs8g6hu o/p should be 14
public class DigitSumInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        int sum = 0;
        for (char c : ch) {
            if (c >= '1' && c <= '9') {
                sum = sum + c - 48;
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
