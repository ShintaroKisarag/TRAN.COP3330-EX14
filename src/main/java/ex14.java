/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();    //stores order amount
        System.out.print("What is the state? ");
        String state = input.next();    //stores state
        double tax; //initializes tax

        if (state.equalsIgnoreCase("WI")) {
            System.out.printf("The subtotal is $%.2f\n", orderAmount);
            tax=5.5/10; //calculate tax
            System.out.printf("The tax is $%.2f\n",tax);
        }else{
            tax = 0;
        }
        double total = orderAmount + tax;   //calculate total
        System.out.printf("The total is $%.2f\n",total);
    }
}
