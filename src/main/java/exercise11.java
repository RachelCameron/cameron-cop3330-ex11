/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 *  Note to TA/Professor: The example output rounds down, which conflicts with what the constraint tells us to do. I coded to match the example instead of the constraint.
 */

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        double euroamount = input.nextDouble();
        System.out.println("What is the exchange rate?");
        double exchangerate = input.nextDouble();
        double dollaramount = exchangerate * euroamount;
        System.out.printf("%.2f euros at an exchange rate of %f is %.2f U.S. dollars.", euroamount, exchangerate, dollaramount);
    }
}