package com.learn.intern;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate factorial");
        int n = sc.nextInt();
        FactorialPrint(n);
        }

    private static void FactorialPrint(int n) {
        int i;
        int fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+ n +" is "+ fact);
    }
}
