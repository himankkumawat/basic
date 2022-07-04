package com.himank.basic1;

import java.util.Scanner;

public class TableOfN {

    public static void main(String[] args) {
        System.out.println("Enter te number of which you want to print table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(n + "*" + i + "=" + n * i);
            i++;
        }
        sc.close();
    }
}
