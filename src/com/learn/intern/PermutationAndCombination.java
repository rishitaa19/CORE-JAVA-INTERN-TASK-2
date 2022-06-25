package com.learn.intern;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        FactorialPrint(n);
        int p = (int)(FactorialPrint(n)/FactorialPrint(n-r));
        int c = (int)(FactorialPrint(n)/(FactorialPrint(n-r)*FactorialPrint(r)));
        System.out.println("PERMUTATION: " +p);
        System.out.println("COMBINATION: " +c);
    }

    private static long FactorialPrint(int num) {
        int i;
        int fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

