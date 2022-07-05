package com.himank.specialnumber;

import java.util.Scanner;

public class NPowerP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent value");
        int no = sc.nextInt();
        int pw = sc.nextInt();
        System.out.println("Answer is " + pow(no, pw));
        sc.close();
    }

    private static int pow(int no, int pw) {
        int pro = 1;
        while (pw > 0) {
            pro = pro * no;
            pw--;
        }
        return pro;
    }
}
