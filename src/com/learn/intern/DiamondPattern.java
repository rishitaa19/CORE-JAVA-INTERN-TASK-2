package com.learn.intern;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int i, j, k;

        int x;

        if(n%2 ==0) {
            x = n/2;
        } else {
            x = n/2 + 1;
        }

        for (i = 1; i <= x; i++) {
            for (j = x - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
       if(n%2 == 0) {
           i = x;
       } else {
           i = x-1;
       }
        for(;i>=1;i--)
        {
            for(j=1;j<=x-i;j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }
}

