/**
 * 
 */
package applicationoflearning;

import java.util.Scanner;

/**
 * @author saksham
 *This program binary multiplication program is not working as expected and needs to be changed
 */
public class ProgramHub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		System.out.println("First Number");
		int one = s1.nextInt();
		System.out.println("Second Number");
		int two = s1.nextInt();
		//s1.close();
		System.out.println(one);
		System.out.println(two);
		SwapNumbers s2 = new SwapNumbers();
		s2.swapNumbersProgram(one, two);
		System.out.println("\n\n\n\n_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_\n\n");
		

		
		
		binaryMultiply();

	}

	public static void binaryMultiply() {

		System.out.println("Enter first binary number");
		Scanner s=new Scanner(System.in);
		int input = s.nextInt();
		System.out.println(input);
		System.out.println("Enter second binary number");
		int input2 = s.nextInt();
		System.out.println(input2);
		String inputF=Integer.toBinaryString(input);
		String inputS=Integer.toBinaryString(input2);
		System.out.println(inputF+inputS);
		s.close();
		

	}

}
