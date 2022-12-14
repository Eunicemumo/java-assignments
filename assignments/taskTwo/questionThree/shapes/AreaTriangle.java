package taskTwo.questionThree.shapes;

import java.util.Scanner;

public class AreaTriangle {

    static double myBase, myHeight, myArea;

    // 1st method
    // this method asks the user to enter the base and the height
    void get_baseANDheight() {

        // Scanner object
        Scanner input = new Scanner(System.in);
        // prompt user
        System.out.println("Enter the base of the triangle: ");
        myBase = input.nextDouble(); // store the input

        System.out.println("Enter the height of the triangle: ");
        myHeight = input.nextDouble(); // store the input

    }

    // 2nd method
    // method gets the area of the rectangle
    void getArea() {

        // doing calculations
        myArea = 0.5 * myBase * myHeight;
    }

    // 3rd method
    // method to output area
    void outputArea() {

        // output the area
        System.out.println("The area of our triangle is: " + myArea);
    }

    // main method
    public static void main(String[] args) {

        // Creating an obj of this class to allow me use the non-static methods
        AreaTriangle triangle = new AreaTriangle();

        // calling the non-static method
        triangle.get_baseANDheight();
        triangle.getArea();
        triangle.outputArea();

    }
}