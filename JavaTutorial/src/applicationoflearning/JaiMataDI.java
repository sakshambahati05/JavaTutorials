package applicationoflearning;

import java.util.*;

public class JaiMataDI {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Jai Mata Di, Please enter the word you would like to input in the following line\n");
		String textEntered = scan.nextLine();

		while (textEntered.isEmpty() || textEntered == null) {
			System.out.println("Please enter a valid text");
			textEntered = scan.nextLine();

		}
		scan.close();
		System.out.println("you've entered : " + textEntered + "\n");
		
	}

	public void startMethod() {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Jai Mata Di, Please enter the word you're thinking");
		String enteredText = s1.nextLine();
		System.out.println("This is the method call" + enteredText);
		s1.close();

	}

}
