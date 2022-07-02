package com.himank.basic1;

import java.util.Scanner;

//  WAP to read the 4 subject marks from the user and display the result.
//  In any subject marks < 35 so fail; percentage> 80% so distinction,>60 first class,>50 2nd class. Otherwise just pass.

public class Exam {

    public static void main(String[] args) {
        double m1, m2, m3, m4, perc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student marks in 1st subject out of 100 ");
        m1 = sc.nextDouble();
        System.out.println("Enter student marks in 2nd subject out of 100 ");
        m2 = sc.nextDouble();
        System.out.println("Enter student marks in 3rd subject out of 100 ");
        m3 = sc.nextDouble();
        System.out.println("Enter student marks in 4th subject out of 100 ");
        m4 = sc.nextDouble();

        if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35)
            System.out.println("Student failed");

        perc = ((m1 + m2 + m3 + m4) * 100) / 400;
        if (perc > 80) {
            System.out.println("Distinction");
        } else if (perc > 60) {
            System.out.println("First Class");
        } else if (perc > 50) {
            System.out.println("Second Class");
        } else {
            System.out.println("Fail");
        }
        sc.close();

//        marks();                  // Alternative

    }

    private static void marks() {
        double m1, m2, m3, m4, perc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks in 1st subject out of 100 ");
        m1 = sc.nextDouble();
        System.out.println("Enter student marks in 2nd subject out of 100 ");
        m2 = sc.nextDouble();
        System.out.println("Enter student marks in 3rd subject out of 100 ");
        m3 = sc.nextDouble();
        System.out.println("Enter student marks in 4th subject out of 100 ");
        m4 = sc.nextDouble();
        if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35)
            System.out.println("Student failed");


        perc = ((m1 + m2 + m3 + m4) * 100) / 400;
        if (perc > 80) {
            System.out.println("Distinction");
        } else if (perc > 60) {
            System.out.println("First Class");
        } else if (perc > 50) {
            System.out.println("Second Class");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
