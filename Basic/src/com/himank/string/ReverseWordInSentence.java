package com.himank.string;

import java.util.Scanner;

public class ReverseWordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        st = reverseString(st);
        System.out.println(st);
    }

    private static String reverseString(String st) {
        char[] ch = st.toCharArray();
        st = "";
        for (int i = 0; i < ch.length; i++) {
            int j = i;
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }
            int k = i - 1;
            while (k >= j) {
                st = st + ch[k];
                k--;
            }
            if (i < ch.length)
                st = st + ch[i];
        }
        return st;
    }
}
