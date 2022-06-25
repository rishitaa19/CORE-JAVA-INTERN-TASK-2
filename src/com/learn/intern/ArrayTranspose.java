package com.learn.intern;

import java.util.Scanner;

public class ArrayTranspose {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int array[][] = new int[m][n];
        System.out.println("Enter the elements of the array: ");


        int i, j;
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                array[i][j] = sc.nextInt();
        System.out.println("Elements of the array are: ");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        int transpose[][]=new int[m][n]; //create

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                transpose[i][j]=array[j][i];
            }
        }

        System.out.println("Array After Transpose:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
