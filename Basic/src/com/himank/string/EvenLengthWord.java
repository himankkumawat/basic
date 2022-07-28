package com.himank.string;

import java.util.Scanner;

public class EvenLengthWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        int ewc = 0;
        for (int i = 0; i < ch.length; i++) {
            int wl = 0;
            while (i == 0 && ch[i] != ' ' || i < ch.length && ch[i] != ' ' && ch[i - 1] == ' ' || i < ch.length && ch[i] != ' ' && ch[i - 1] != ' ') {
                wl++;
                i++;
            }
            if (wl > 0 && wl % 2 == 0) {
                ewc++;
            }
        }
        System.out.println("Total Even Words are : " + ewc);
    }
}
