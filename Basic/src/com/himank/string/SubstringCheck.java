package com.himank.string;

import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String fs = sc.nextLine();
        System.out.println("Enter the Second String");
        String ss = sc.nextLine();
        sc.close();
        if (check(fs, ss)) {
            System.out.println("Second String is Present");
        } else
            System.out.println("Second String is not Present");
        if (check(fs, ss)) {
            System.out.println("Second Word is Present");
        } else
            System.out.println("Second Word is not Present");
        int c = countWord(fs, ss);
        System.out.println("Second Word is Present " + c + " times");
    }

    private static boolean check(String fs, String ss) {
        char[] c1 = fs.toCharArray();
        char[] c2 = ss.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            int j = 0, k = i;
            while (j < c2.length && c1[k] == c2[j]) {
                k++;
                j++;
            }
            if (j == c2.length)
                return true;
        }
        return false;
    }

    private static boolean checkWord(String fs, String ss) {
        char[] c1 = fs.toCharArray();
        char[] c2 = ss.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            int j = 0, k = i;
            while (j < c2.length && c1[k] == c2[j]) {
                k++;
                j++;
            }
            if (j == c2.length) {
                if ((i == 0 || c1[i - 1] == ' ') && (k == c1.length || c1[k] == ' '))
                    return true;
            }
        }
        return false;
    }

    private static int countWord(String fs, String ss) {
        char[] c1 = fs.toCharArray();
        char[] c2 = ss.toCharArray();
        int count = 0;
        for (int i = 0; i < c1.length; i++) {
            int j = 0, k = i;
            while (j < c2.length && c1[k] == c2[j]) {
                k++;
                j++;
            }
            if (j == c2.length) {
                if ((i == 0 || c1[i - 1] == ' ') && (k == c1.length || c1[k] == ' '))
                    count++;
            }
        }
        return count;
    }
}
