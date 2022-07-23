package com.himank.arrays;

import java.util.Scanner;

public class CountInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        int nv = 0, nc = 0, nd = 0, ns = 0, nu = 0, nl = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                nu++;
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    nv++;
                else
                    nc++;
            } else if (ch >= 'a' && ch <= 'z') {
                nl++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    nv++;
                else
                    nc++;
            } else if (ch >= '0' && ch <= '9')
                nd++;
            else
                ns++;
        }
        System.out.println("Number of Vowels : " + nv);
        System.out.println("Number of Consonant : " + nc);
        System.out.println("Number of Digits : " + nd);
        System.out.println("Number of Upper case Letters : " + nu);
        System.out.println("Number of Lower case Letters : " + nl);
        System.out.println("Number of Special Characters : " + ns);
    }
}
