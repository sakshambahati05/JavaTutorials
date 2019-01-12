/**
 * Write a Java program to print the sum of two numbers.
 */
package applicationoflearning;

import java.util.*;

/**
 * @author saksham
 *
 */
public class ExerciseTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// There is a lmitation/feature in Java that whatever inputs it takes from user
		// is in form of String
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the 1st String number to be multiplied ");
		String num1 = s1.nextLine();
		System.out.println("Please enter the 2nd String number to be multiplied ");
		String num2 = s1.nextLine();
		System.out.println("Please enter the 3rd number");

		// Converting the value of a string to a double value, the same can be done for
		// string to integer conversion as well
		double num11 = Double.valueOf(num1);
		double num22 = Double.valueOf(num2);
		double result = multiply(num11, num22);
		System.out.println("The result of multiplication of the two is :" + result);
		s1.close();

	}

	public static double multiply(double a, double b) {
		double c = a * b;
		return c;

	}

}
