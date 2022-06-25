package com.learn.intern;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not:");
        String n = sc.nextLine();

        String sol = "";
        char ch;
        for (int i = 0; i < n.length(); i++){
            ch = n.charAt(i);
            sol = ch + sol;
        }
        System.out.println(sol);

        if(n.equals(sol)){
            System.out.println("STRING IS PALINDROME");
        }
        else{
            System.out.println("STRING IS NOT PALINDROME");
        }
    }
}
