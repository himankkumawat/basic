package com.himank.basic1;

import java.util.Scanner;

public class EvenOddMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int no = sc.nextInt();
        if (isEven(no))
            System.out.println("Even");
        else
            System.out.println("ODD");

        sc.close();
    }

    private static boolean isEven(int no) {
        return no % 2 == 0;
    }
}
