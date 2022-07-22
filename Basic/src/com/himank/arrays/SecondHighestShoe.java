package com.himank.arrays;

//Mrs. Sofia as imported container of shoes. The container has different size of shoes and needs to know the second highest shoes size in the
//container. Could you help Sofia by writing a method to find the second highest size of shoes in the container?

import java.util.Scanner;

public class SecondHighestShoe {

    public static void main(String[] args) {
        int[] arr = readArray();
        int no = secondHighest(arr);
        System.out.println("Second Highest is : " + no);
    }

    private static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int secondHighest(int[] arr) {
        for (int value : arr) {
            int count = 0;
            for (int i : arr) {
                if (i > value)
                    count++;
            }
            if (count == 1)
                return value;
        }
        return -1;
    }

}
