package taskFour;

import java.util.Arrays;
import java.util.Scanner;

class QuestionOne {

    // Write a Java program that takes 15 values of type integer as
    // inputs from user, store the values in an array.
    //
    // a) Print the values stored in the array on screen.
    // b) Ask user to enter a number, check if that number (entered by user) is
    // present in array or not. If it is present print, “the number found at
    // index (index of the number) ” and the text “number not found in this array”

    
    private static void check(int[] arr, int toCheckValue) {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }

        // Print the result
        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declaring my array and setting it to empty.
        int[] arrayFifteen = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        System.out.println("Enter the first number: ");
        arrayFifteen[0] = input.nextInt();
        System.out.println("Enter the second number: ");
        arrayFifteen[1] = input.nextInt();
        System.out.println("Enter the third number: ");
        arrayFifteen[2] = input.nextInt();
        System.out.println("Enter the fourth number: ");
        arrayFifteen[3] = input.nextInt();
        System.out.println("Enter the fifth number: ");
        arrayFifteen[4] = input.nextInt();
        System.out.println("Enter the sixth number: ");
        arrayFifteen[5] = input.nextInt();
        System.out.println("Enter the seventh number: ");
        arrayFifteen[6] = input.nextInt();
        System.out.println("Enter the eighth number: ");
        arrayFifteen[7] = input.nextInt();
        System.out.println("Enter the ninth number: ");
        arrayFifteen[8] = input.nextInt();
        System.out.println("Enter the tenth number: ");
        arrayFifteen[9] = input.nextInt();
        System.out.println("Enter the eleventh number: ");
        arrayFifteen[10] = input.nextInt();
        System.out.println("Enter the twelfth number: ");
        arrayFifteen[11] = input.nextInt();
        System.out.println("Enter the thirteenth number: ");
        arrayFifteen[12] = input.nextInt();
        System.out.println("Enter the fourteenth number: ");
        arrayFifteen[13] = input.nextInt();
        System.out.println("Enter the fifteenth number: ");
        arrayFifteen[14] = input.nextInt();

        // converting the array to a string list.
        var myList = Arrays.toString(arrayFifteen);
        // display the array to the user in form of a list.
        System.out.println("Our array has the following values: ");
        System.out.println(myList);

        System.out.println("Enter any number to check if it is in the array: ");
        var newNumber = input.nextInt();

        check(arrayFifteen, newNumber);

    }
}