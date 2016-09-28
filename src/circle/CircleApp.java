package circle;

import java.util.*;

public class CircleApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";

		// user input prompt
		System.out.print("Welcome to the Circle Tester! ");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {
			double r = Validator.getDouble(input, "Enter radius: ");
			System.out.println();
			Circle circleN = new Circle(r);
			System.out.println("Circumference: " + circleN.getFormattedCircumference());
			System.out.println("Area: " + circleN.getFormattedArea());

			// see if the user wants to continue
			System.out.print("Continue?? (y/n): ");
			choice = input.next();
			System.out.println();

			while (choice.equalsIgnoreCase("n")) {
				int counter = circleN.getObjectCount();
				System.out.println("Goodbye.  You created " + counter + " Circle object(s).");
				choice = input.next();
			}//2nd while loop closes
		} // 1st while loop closes

	}//main
}