package com.himank.arrays;

import java.util.Scanner;

public class CharactersInWord2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            int c = 0;
            String t = "";
            while (i < st.length() && st.charAt(i) != ' ') {
                t = t + st.charAt(i);
                c++;
                i++;
            }
            if (c > 0) {
                System.out.println(t + " waor has " + c + " words");
            }
        }
    }
}
