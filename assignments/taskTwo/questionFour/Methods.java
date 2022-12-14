package taskTwo.questionFour;

import java.util.Scanner;

public class Methods {

    // Create a java program that has one non-static method,
    // two static methods and a constructor.

    // 1st static method; also main method
    public static void main(String[] args) {

        // calling a static method
        var myName = "Your name is " + getName();

        // using non-static method
        Methods person = new Methods();
        person.printName(myName);
    }

    // 2nd static method
    static String getName() {
        Scanner input = new Scanner(System.in);
        // getting name input
        System.out.println("Enter your name :");
        var name = input.nextLine();

        return name;

    }

    // non-static method
    void printName(String name) {
        System.out.println(name);
    }
}