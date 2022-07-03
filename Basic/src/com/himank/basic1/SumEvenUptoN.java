package com.himank.basic1;

import java.util.Scanner;

public class SumEvenUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        even(no);
    }

    private static void even(int no) {
        int i = 2, sum = 0;
        while (i <= no) {
//      System.out.println(i);
            sum += i;
            i += 2;
        }
        System.out.println("Sum of Even integer is " + sum);
    }
}
