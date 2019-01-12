package applicationoflearning;

public class SwapNumbers {
	
	public void swapNumbersProgram(int a,int b) {
		// The below mentioned implementation is using a third variable
		
		System.out.println("Prior to swapping the first number you entered is "+a+" & the second number is "+b);
		int swapBuffer;
		swapBuffer=a;
		a=b;
		b=swapBuffer;
		System.out.println("Post swapping the first number now is "+a+" & the second number is "+b);
		
//		w/o using a third variable the same implementation can be 
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		At the end of the above operations the values would have swapped
		
	}

}
