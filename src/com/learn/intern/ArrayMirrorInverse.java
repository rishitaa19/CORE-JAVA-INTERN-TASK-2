package com.learn.intern;

import java.util.Scanner;

public class ArrayMirrorInverse {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n+ " array elements");
        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isInverse(arr))
            System.out.println("Given Array is mirror inverse");
        else
            System.out.println("Given Array is not mirror inverse");
    }

    static boolean isInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {

            if (arr[arr[i]] != i)
                return false;
        }

        return true;
    }


}

