package taskOne;

import java.util.Scanner;

public class QuestionOne {
    // Write a Java program that asks the user to enter their surname and
    // current age then print the number of characters of their surname
    // and even or odd depending on their age number.

    // main function
    /**
     * @param args
     */
    public static void main(String[] args) {

        // createing Scanner object
        Scanner input = new Scanner(System.in);

        String surName;
        Integer age, surNameLength;

        // getting surName
        System.out.println("\nEnter your surname :");
        surName = input.nextLine(); // store name

        // getting user's age
        System.out.println("Enter your age :");
        age = input.nextInt(); // stores the age of the user.

        // getting the number of characters in surName
        surNameLength = surName.length();

        // is age odd or even
        String oddEven; // to store either "odd" or "even"
        // if the modulus of age by 2 is 0,
        if ((age % 2) == 0) {
            // [oddEven] is "even"
            oddEven = "even";
        } else {
            // else [oddEven] is "odd"
            oddEven = "odd";
        }

        System.out.println("\nThe number of characters in your surname is : " + surNameLength);
        System.out.println("Your current age(" + age +") is an " + oddEven + " number.");
    }
}