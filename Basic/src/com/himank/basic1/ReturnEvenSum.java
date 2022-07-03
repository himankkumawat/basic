package com.himank.basic1;

import java.util.Scanner;

public class ReturnEvenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int sum = sumEven(no);
        System.out.println("Sum of First even Numbers is " + sum);
//      System.out.println("Sum of First even Numbers is " + sumEven(no));
    }

    private static int sumEven(int no) {
        int i = 2, sum = 0;
        while (i <= no) {
            sum += i;
            i += 2;
        }
        return sum;
    }

}
