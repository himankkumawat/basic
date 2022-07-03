package com.himank.basic1;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("From where you want to print the number");
        int i = sc.nextInt();
        System.out.println("Upto what number you want to print the numbers");
        int n = sc.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
