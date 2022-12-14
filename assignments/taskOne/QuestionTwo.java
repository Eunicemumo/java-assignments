package taskOne;

import java.util.Scanner;

public class QuestionTwo {

    // Write Java program to ask student to enter the marks
    // of the five units they did last semester, compute the
    // average and display it on the screen. (Average should
    // be given in two decimal places).

    // main function
    public static void main(String[] args) {

        // Scanner object
        Scanner myInput = new Scanner(System.in);
        // telling user about the program
        System.out.println(
                "\nEnter marks of the five units you did on last semester.");

        // These to store marks
        Double unitOne, unitTwo, unitThree, unitFour, unitFive, average;
        // inputting marks
        System.out.println("\nEnter marks for unit 1 : ");
        unitOne = myInput.nextDouble();
        System.out.println("Enter marks for unit 2 : ");
        unitTwo = myInput.nextDouble();
        System.out.println("Enter marks for unit 3 : ");
        unitThree = myInput.nextDouble();
        System.out.println("Enter marks for unit 4 : ");
        unitFour = myInput.nextDouble();
        System.out.println("Enter marks for unit 5 : ");
        unitFive = myInput.nextDouble();

        // getting average mark by calling getAverage() and assigning it to a variable
        average = unitOne + unitTwo + unitThree + unitFour + unitFive;
        average = average / 5;
        average = Math.round(average * 100.0) / 100.0;

        // Outputting the [average]
        System.out.println("\nAverage mark : " + average);

    }
}