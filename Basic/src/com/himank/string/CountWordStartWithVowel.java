package com.himank.string;

import java.util.Scanner;

public class CountWordStartWithVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            while (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
                if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    count++;
                }
                i++;
            }
        }
        System.out.println("Total Number of words starting with vowel are : " + count);
    }
}
