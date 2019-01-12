/**
 * 
 */
package introduction;

/**
 * @author saksham
 *
 */
public class ForLoops {
	public static void main(String[] args) {

		
		// Basic for loop for iterating among numbers using index of an array
		for (int i = 0; i < 10; i++) {
			System.out.println("The value of i: " + i);
		}
		
		// method # 1 Basic for loop for iterating among numbers without using index of an array
		int[] numbers = {10, 20, 30};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The value of index " + i + " is: " + numbers[i]);
		}
		
		// method # 2 for iterating among the different values of an int array
		for (int number: numbers) {
			System.out.println("The value is: " + number);
			
		}
		
		// Looping through the strings array 
		String[] cars = {"bmw", "audi", "honda"};
		for (String car: cars) {
			System.out.println(car);
		}
	}



}
