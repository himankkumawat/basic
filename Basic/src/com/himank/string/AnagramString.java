package com.himank.string;

import java.util.Scanner;

//E.g. s1=keep s2=peek, s1=listen s2=silent, s1=debit card s2=bad credit
//s1=mother in law s2=Hitler mother.
public class AnagramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String st1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String st2 = sc.nextLine();
        st1 = st1.replaceAll(" ", "");
        st2 = st2.replaceAll(" ", "");
        int l1 = st1.length();
        int l2 = st2.length();
        if (l1 != l2) {
            System.out.println("Strings are not Anagram");
        }
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();
        st1 = sort(st1);
        st2 = sort(st2);
        if (check(st1, st2)) {
            System.out.println("Strings are Anagram");
        } else
            System.out.println("Strings are not Anagram");
    }

    private static String sort(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char t = ch[i];
                    ch[i] = ch[j];
                    ch[j] = t;
                }
            }
        }
        return new String(ch);
    }

    private static boolean check(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
