package applicationoflearning;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the first number ");
		double a=s1.nextDouble();
		System.out.println("Please enter the second number");
		double b=s1.nextDouble();
		double c=multiply(a,b);
		System.out.println("The product of the two numbers is :" +c);
		s1.close();
	}

	public static double multiply(double a,double b) {
		
		double c=a*b;
		return c;
		//System.out.println("The product of the two numbers is :" + c*d);
	}
	
}
