package com.himank.string;

import java.util.Scanner;

public class CharacterOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        int[] c = new int[128];
        for (int i = 0; i < st.length(); i++) {
            c[st.charAt(i)]++;
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                System.out.println((char) i + "----->" + c[i]);
            }
        }
    }
}
