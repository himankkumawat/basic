package com.himank.basic1;

import java.util.Scanner;

public class Display1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        display1ToN(no);
        sc.close();
    }

    private static void display1ToN(int no) {
        int i = 1;
        while (i <= no) {
            System.out.println(i);
            i++;
        }
    }
}
