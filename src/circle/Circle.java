package circle;

import java.lang.Math;
import java.text.NumberFormat;

public class Circle {

	public double radius;
	public double circumference;
	public double area;
	public String formattedCircumference;
	public String formattedArea;
	private static final double PI = 3.14159;
	public static int counter;

	public Circle(double r) {
		// Assigning instance variables for the parameters
		radius = r;
		counter++;
	}

	// methods
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public String getFormattedCircumference() {
		NumberFormat circumference = NumberFormat.getNumberInstance();
		circumference.setMaximumFractionDigits(2);
		return formattedCircumference = circumference.format(getCircumference());
	}

	public double getArea() {
		return Math.PI * (radius * radius);
	}

	public String getFormattedArea() {
		NumberFormat area = NumberFormat.getNumberInstance();
		area.setMaximumFractionDigits(2);
		return formattedArea = area.format(getArea());
	}

	public static int getObjectCount() {
		return counter;
	}
}