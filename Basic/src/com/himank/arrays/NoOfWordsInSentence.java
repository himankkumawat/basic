package com.himank.arrays;

import java.util.Scanner;

public class NoOfWordsInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        int wc = 0;
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && st.charAt(i) != ' ' || st.charAt(i) != ' ' && st.charAt(i - 1) == ' ')
                wc++;
        }
        System.out.println("Number of words are : " + wc);
    }
}
