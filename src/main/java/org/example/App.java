/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        int people, pizzas, slices, total_slices;
        int leftovers, serving;
        String strPeople, strPizzas, strSlices;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people? ");
        strPeople = sc.nextLine();
        System.out.print("How many pizzas do you have? ");
        strPizzas = sc.nextLine();
        System.out.print("How many slices per pizza? ");
        strSlices = sc.nextLine();

        people = Integer.parseInt(strPeople);
        pizzas = Integer.parseInt(strPizzas);
        slices  = Integer.parseInt(strSlices);

        total_slices = pizzas * slices;

        serving = total_slices / people;
        leftovers = total_slices % people;

        System.out.println(people + " people with " + pizzas + " pizzas (" + total_slices + " slices)");
        System.out.println("Each person gets " + serving + " pieces of pizza.\n" + "There are " + leftovers + " leftover pieces.");
    }
}
