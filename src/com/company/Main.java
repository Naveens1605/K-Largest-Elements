package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
            System.out.println("Enter No of Largest elements:");
            int k = sc.nextInt();
            Stack<Integer> stack = new Stack<>();
            for (int i = arr.length - 1; i > arr.length - k - 1; i--) {
                if (k > arr.length) {
                    System.out.println("Can't Print " + k + " Largest Numbers. So, Here are " + arr.length + " Largest Numbers");
                    k = arr.length;
                }
                stack.push(arr[i]);
            }
            System.out.println(stack);
    }
}
