package taskFour;

import java.util.Arrays;
import java.util.Scanner;

class QuestionOne {

    // Write a Java program that takes 15 values of type integer as
    // inputs from user, store the values in an array.
    //
    // a) Print the values stored in the array on screen.
    // b) Ask user to enter a number, determine if that number (entered by user) is
    // present in array or not. If it is present print, “the number found at
    // index (index of the number) ” and the text “number not found in this array”

    private static void determine(int[] arr, int valueToCheck) {

        boolean test = false;
        for (int element : arr) {
            if (element == valueToCheck) {
                test = true;
                break;
            }
        }

        // Print the result
        System.out.println("Is " + valueToCheck
                + " present in the array: " + test);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // declaring my array and setting it to empty.
            int[] fifteenNums = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

            System.out.println("Enter the first number: ");
            fifteenNums[0] = input.nextInt();
            System.out.println("Enter the second number: ");
            fifteenNums[1] = input.nextInt();
            System.out.println("Enter the third number: ");
            fifteenNums[2] = input.nextInt();
            System.out.println("Enter the fourth number: ");
            fifteenNums[3] = input.nextInt();
            System.out.println("Enter the fifth number: ");
            fifteenNums[4] = input.nextInt();
            System.out.println("Enter the sixth number: ");
            fifteenNums[5] = input.nextInt();
            System.out.println("Enter the seventh number: ");
            fifteenNums[6] = input.nextInt();
            System.out.println("Enter the eighth number: ");
            fifteenNums[7] = input.nextInt();
            System.out.println("Enter the ninth number: ");
            fifteenNums[8] = input.nextInt();
            System.out.println("Enter the tenth number: ");
            fifteenNums[9] = input.nextInt();
            System.out.println("Enter the eleventh number: ");
            fifteenNums[10] = input.nextInt();
            System.out.println("Enter the twelfth number: ");
            fifteenNums[11] = input.nextInt();
            System.out.println("Enter the thirteenth number: ");
            fifteenNums[12] = input.nextInt();
            System.out.println("Enter the fourteenth number: ");
            fifteenNums[13] = input.nextInt();
            System.out.println("Enter the fifteenth number: ");
            fifteenNums[14] = input.nextInt();

            // converting the array to a string list.
            var myList = Arrays.toString(fifteenNums);
            // display the array to the user in form of a list.
            System.out.println("Our array contains the following values: ");
            System.out.println(myList);

            System.out.println("Enter any number to determine if it is in our array: ");
            var newNumber = input.nextInt();

            determine(fifteenNums, newNumber);

        }
    }
}