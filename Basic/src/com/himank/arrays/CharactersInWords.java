package com.himank.arrays;

import java.util.Scanner;

public class CharactersInWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        int wc = 0, c = 0;
        for (int i = 0; i < st.length(); i++) {
            c = 0;
            while (i < st.length() && st.charAt(i) != ' ') {
                c++;
                i++;
            }
            if (c > 0) {
                wc++;
                System.out.println(wc + "--->" + c);
            }
        }
    }
}
