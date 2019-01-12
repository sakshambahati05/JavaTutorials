/**
 * 
 */
package introduction;

/**
 * @author saksham
 *
 */

public class PalindromeAlgo2 {

	public static void main(String[] args) {
		String input = "rrr";
		boolean b = isPallindrom(input);
		if (b == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

	public static boolean isPallindrom(String y) {
		int length = y.length();
		char[] ar = y.toCharArray();

		int j = length - 1;
		for (int i = 0; i < length / 2; i++) {
			if (ar[j] == ar[i]) {
				j--;
			} else {

				return false;
			}

		}
		return true;

	}
}