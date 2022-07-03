package com.himank.basic1;

import java.util.Scanner;

public class EvenUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        even(no);
    }

    private static void even(int no) {
        int i = 2, count = 0;
        while (i <= no) {
//      System.out.println(i);
            i += 2;
            count++;
        }
        System.out.println("Total of " + count + " even numbers");
    }
}
