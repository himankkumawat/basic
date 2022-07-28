package com.himank.string;

import java.util.Scanner;

//  Shri Rama And Laxmana - Laxmana And Rama Shri
public class ReverseSentence {

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
        for (int i = ch.length - 1; i >= 0; i--) {
            int j = i;
            while (i >= 0 && ch[i] != ' ') {
                i--;
            }
            int k = i + 1;
            while (k <= j) {
                st = st + ch[k];
                k++;
            }
            if (i >= 0)
                st = st + ch[i];
        }
        return st;
    }
}
