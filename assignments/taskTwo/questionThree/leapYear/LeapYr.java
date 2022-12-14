package taskTwo.questionThree.leapYear;

import java.util.Scanner;

public class LeapYr {

    // this method will determine the leap year
    static void determineLeapYr() {
        try (Scanner input = new Scanner(System.in)) {
            // getting the year
            System.out.println("\nThis program determines if the year is leap or not.");
            System.out.println("Enter year :");

            // create and init year
            Integer year = input.nextInt();

            // if the modulus of [year] by 4 is [0]
            if ((year % 4) == 0) {
                // then it is a leap year
                System.out.println(year + " is a leap year");
            } else {
                // otherwise, not a leap yr
                System.out.println(year + " is not a leap year");
            }
        }
    }

    // main method
    public static void main(String[] args) {

        // calling the method
        determineLeapYr();
    }
}