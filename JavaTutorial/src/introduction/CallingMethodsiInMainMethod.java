package introduction;

public class CallingMethodsiInMainMethod {

	public static void main(String[] args) {

		double d = multiply(-2.26767623, -4.5676553);
		display(d);
		d = multiply(-3.4676764, -4.322676724);
		display(d);

	}

	public static double multiply(double a, double b) {

		double c = a * b;
		// System.out.println("The product of the two numbers is-->"+c);
		return c;

	}

	public static void display(double e) {

		System.out.println("***********************************************************");
		System.out.println("The product of the two numbers is ==>> " + e);
		System.out.println("***********************************************************");
	}
}
