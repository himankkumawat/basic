package com.himank.basic1;

import java.util.Scanner;

public class MainFact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        FactorialN f = new FactorialN();
        System.out.println("Factorial is " + f.getFact(no));
        sc.close();
    }

    private static class FactorialN {
        int getFact(int n) {
            int P = 1;
            while (n > 0) {
                P = P * n;
                n--;
            }
            return P;
        }
    }
}
