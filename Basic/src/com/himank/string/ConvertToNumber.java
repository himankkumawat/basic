package com.himank.string;

import java.util.Scanner;

public class ConvertToNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        int n = convertToInt(st);
        System.out.println(n);
    }

    private static int convertToInt(String st) {
        int n = 0;
        for (int i = 0; i < st.length(); i++) {
            n = n * 10 + (st.charAt(i) - 48);
        }
        return n;
    }
}
