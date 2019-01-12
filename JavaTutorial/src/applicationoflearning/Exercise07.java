package applicationoflearning;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numberToTabulate= new Scanner(System.in);
		System.out.println("Enter the number for which you want table : ");
		int a=numberToTabulate.nextInt();
		tableUptoTen(a);
		numberToTabulate.close();
		
	}

	public static void tableUptoTen(int a) {
		for (int i=1;i<11;i++)
		{
			System.out.println(" "+a+" x "+i+" = "+(a*i));
		}
		

	}
}
