package introduction;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1;
		int factorial = calculator(number);

		if (factorial == 0) {
			System.out.println("You must enter a positive integer");
		} else {
			System.out.println("factorial of the number " + number + " is --- > " + factorial);

		}

	}

	public static int calculator(int num) {

		if (num == 0) {
			return 1;
		}

		else if (num < 0) {
			System.out.println("Please enter a valid number");
			return 0;
		}

		int result = num;
		int j = num;

		for (int i = 1; i < num; i++) {
			result = result * (j - 1);
			//System.out.println(result);
			j--;
		}
		return result;

	}

}
