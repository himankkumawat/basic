package com.himank.string;

import java.util.Scanner;

public class FirstCapital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        for (int i = 0; i < st.length(); i++) {
            if (i == 0 && st.charAt(i) != ' ' || st.charAt(i) != ' ' && st.charAt(i - 1) == ' ') {
                if (ch[i] >= 97 && ch[i] <= 122)
                    ch[i] = (char) (ch[i] - 32);
            } else {
                if (ch[i] >= 65 && ch[i] <= 90)
                    ch[i] = (char) (ch[i] + 32);
            }
        }
        String s = new String(ch);
        System.out.println(s);
    }
}
