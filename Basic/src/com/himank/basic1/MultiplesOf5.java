package com.himank.basic1;

import java.util.Scanner;

public class MultiplesOf5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        multiples(no);
    }

    private static void multiples(int no) {
        int i = 5;
        while (i <= no) {
            System.out.println(i);
            i += 5;
        }
    }
}
