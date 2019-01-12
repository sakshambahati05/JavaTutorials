/**
 * This program has two methods, one of which tells if a number is prime or not
 * and the second method returns all the list of prime numbers less than the number you've enetered
 */
package introduction;

/**
 * @author saksham
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 23;
		if (isPrime(i) == true) {
			System.out.print(
					"Output 1 : The number you've entered is also prime and all the prime numbers less than and equal to the given number are -> \n");
			listPrimenumbers(i);
			System.out.println("\n");

		} else if (isPrime(i) == false) {
			System.out.print("Output 1 : Although the number you've entered (" + i + ") is not a prime number, "
					+ "all the prime numbers below that number is/are -> \n");
			listPrimenumbers(i);
			System.out.println("\n");

		}

		int j = 24;
		if (isPrime(j) == true) {
			System.out.print(
					"Output 2 : The number you've entered is also prime and all the prime numbers less than and equal to the given number are -> \n");
			listPrimenumbers(j);
			System.out.println("\n");

		} else if (isPrime(j) == false) {
			System.out.print("Output 2 : Although the number you've entered (" + j + ") is not a prime number, "
					+ "all the prime numbers below that number is/are -> \n");
			listPrimenumbers(j);
			System.out.println("\n");

		}

	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}

		}
		return true;
	}

	public static void listPrimenumbers(int num) {

		for (int i = 1; i <= num; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + ",");

			}
		}
	}

}
