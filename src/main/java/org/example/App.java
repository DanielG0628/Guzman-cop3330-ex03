package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare inputs
        String userQuote, userName;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("What is the quote?");
        userQuote = sc.nextLine();
        System.out.println("Who said it?");
        userName = sc.nextLine();

        //output
        System.out.println(userName + " says, \"" + userQuote + "\"");

        //close scanner
        sc.close();
    }
}
