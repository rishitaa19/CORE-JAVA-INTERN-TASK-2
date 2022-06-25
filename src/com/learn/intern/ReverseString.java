package com.learn.intern;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String n = sc.nextLine();

        String sol = "";
        char ch;
        for (int i = 0; i < n.length(); i++) {
            ch = n.charAt(i);
            sol = ch + sol;
        }
        System.out.println(sol);
    }
}
