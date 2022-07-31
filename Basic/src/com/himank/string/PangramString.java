package com.himank.string;

import java.util.Scanner;

public class PangramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        st = st.replaceAll(" ", "");
        st = st.toLowerCase();
        if (check(st)) {
            System.out.println("Strings are Anagram");
        } else
            System.out.println("Strings are not Anagram");
    }

    private static boolean check(String s) {
        int l = s.length();
        if (l < 26) {
            System.out.println("Entered String is not Panagram");
            return false;
        }
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                c[s.charAt(i) - 97]++;
            }
        }
        for (int value : c) {
            if (value == 0) {
                System.out.println(value);
                return false;
            }
        }
        return true;
    }
}
