package com.learn.intern;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOU NUMBER");
        int n = sc.nextInt();
        printFibonnaci(n);

    }

    private static void printFibonnaci(int num){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int sol;
        for(int i = 0; i<num-2; i++){
            sol = a + b;
            a = b;
            b = sol;
            System.out.println(sol);
        }
    }
}
