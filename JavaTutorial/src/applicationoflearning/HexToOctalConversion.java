/**
 * 
 */
package applicationoflearning;

import java.util.Scanner;

/**
 * @author saksham
 *
 */
public class HexToOctalConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter the hexadecimal number to be converted");
		Scanner s1 = new Scanner(System.in);
		String hexNumber = s1.nextLine();
		hexNumber = hexNumber.toUpperCase();
		System.out.println(hexNumber);

		int decimal = Integer.parseInt(hexNumber, 16);
		System.out.println("Decimal equivalent of the hex string entered by you is : " + decimal);

		String octalString = Integer.toOctalString(decimal);
		System.out.println("Octal equivalent of the number so entered is" + octalString);

		System.out.println("Press 1 to exit");
		int userOption = Integer.parseInt(s1.nextLine());

		if (userOption==1) {
			s1.close();
				return;
		} else { 
			System.out.println("Please enter the next hex number for conversion");
			hexNumber=s1.nextLine();
			hexNumber = hexNumber.toUpperCase();
			System.out.println(hexNumber);

			decimal = Integer.parseInt(hexNumber, 16);
			System.out.println("Decimal equivalent of the hex string entered by you is : " + decimal);

			octalString = Integer.toOctalString(decimal);
			System.out.println("Octal equivalent of the number so entered is" + octalString);
			
		}
				
		s1.close();
	}

}
