package com.himank.string;

import java.util.Scanner;

public class CountSmallLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        int c , wc = 1;
        for (int i = 0; i < ch.length; i++) {
            c = 0;
            while ((i == 0 && ch[i] != ' ') || (i < ch.length && ch[i] != ' ' && ch[i - 1] == ' ') || (i < ch.length && ch[i] != ' ' && ch[i - 1] != ' ')) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    c++;
                }
                i++;
            }
            System.out.println(wc + " word ----> " + c + " Small letters");
            wc++;
        }
    }
}
