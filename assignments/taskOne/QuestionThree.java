package taskOne;

import java.util.Scanner;

public class QuestionThree {
    // Write a program that will help kids learn divisibly test of
    // numbers of integers. The program should check whether the
    // given integer is divisible by integers in the range of 0-9.

    // main function

    public static void main(String[] args) {

        try (// Scanner object
                Scanner myInput = new Scanner(System.in)) {

            System.out.println("Enter any integer :");

            // storing user input.
            Integer userInput = myInput.nextInt();

            // calling the tests
            divTest0(userInput);
            divTest1(userInput);
            divTest2(userInput);
            divTest3(userInput);
            divTest4(userInput);
            divTest5(userInput);
            divTest6(userInput);
            divTest7(userInput);
            divTest8(userInput);
            divTest9(userInput);
        }
    }

    // divisibility test for 0
    static void divTest0(int num) {
        System.out.println("\n" + num + " can't be divisible by 0.");
    }

    // divisibility test for 1
    static void divTest1(int num) {
        if ((num % 1) == 0)
            System.out.println(num + " is divisible by 1.");

    }

    // divisibility test for 2
    static void divTest2(int num) {
        if ((num % 2) == 0) {
            System.out.println(num + " is divisible by 2.");
        } else {
            System.out.println(num + " is not divisible by 2.");
        }
    }

    // divisibility test for 3
    static void divTest3(int num) {
        if ((num % 3) == 0) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
    }

    // divisibility test for 4
    static void divTest4(int num) {
        if ((num % 4) == 0) {

            System.out.println(
                    num + " is divisible by 4.");
        } else {
            System.out.println(
                    num + " is not divisible by 4.");
        }
    }

    // divisibility test for 5
    static void divTest5(int num) {
        if ((num % 5) == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5");
        }
    }

    // divisibility test for 6
    static void divTest6(int num) {
        if ((num % 6) == 0) {
            System.out.println(num + " is divisible by 6");
        } else {
            System.out.println(num + " is not divisible by 6");
        }
    }

    // divisibility test for 7
    static void divTest7(int num) {
        if ((num % 7) == 0) {
            System.out.println(num + " is divisible by 7");
        } else {
            System.out.println(num + " is not divisible by 7");
        }
    }

    // divisibility test for 8
    static void divTest8(int num) {
        if ((num % 8) == 0) {
            System.out.println(num + " is divisible by 8");
        } else {
            System.out.println(num + " is not divisible by 8");
        }
    }

    // divisibility test for 9
    static void divTest9(int num) {
        if ((num % 9) == 0) {
            System.out.println(num + " is divisible by 9");
        } else {
            System.out.println(num + " is not divisible by 9");
        }
    }
}