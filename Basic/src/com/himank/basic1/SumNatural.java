package com.himank.basic1;

import java.util.Scanner;

public class SumNatural {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int sum = 0;
        int no = sc.nextInt();
        while (no > 0) {
            sum = sum + no;
            no = no - 1;
        }
        System.out.println(sum);
    }
}
