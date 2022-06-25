package com.learn.intern;

import java.util.Scanner;
import java.lang.Math;

public class basiccalculator {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER ONE");
        double i = sc.nextDouble();

        System.out.println("ENTER NUMBER TWO");
        double i2 = sc.nextDouble();

        System.out.println("ENTER THE OPERATOR (+.-.*,/)");
        char sign = sc.next().charAt(0);

        double sol= calculate(i,i2,sign);

        System.out.println(i + " " + sign + " " + i2 + " " + "=" + " " + sol);
    }

    private static double calculate(double i, double i2, char sign) throws Exception{
        switch(sign){
            case '+':
                return i+i2;

            case '-':
                return i-i2;

            case '*':
                return i*i2;

            case '/':
                return i/i2;

            default:
                throw new Exception("YOU HAVE ENTERED AN INVALID OPERATION. ALLOWED OPERATION ARE +,-,*,/");
        }
    }
}