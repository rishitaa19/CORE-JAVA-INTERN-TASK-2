package com.learn.intern;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemove {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to be stored in array list:");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList();

        System.out.println("Enter " + n+ " numbers to store in arraylist");

        for(int i = 0; i< n; i++) {

            Integer k = Integer.valueOf(sc.nextInt());
            list.add(k);
        }

        System.out.println("Your current list is " + list);

        System.out.println("Enter an element to remove from arraylist");
        Integer remove = sc.nextInt();

        if(list.contains(remove)) {
            list.remove(remove);

            System.out.println("Your list after removing " + remove + " is " + list);
        } else {
            System.out.println("The list does not contain " + remove);
        }
    }
}
