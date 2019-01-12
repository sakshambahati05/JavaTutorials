package introduction;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 23658763;
		int j = 0;
		try {
			j = reverse(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Reverse of number (" + i + ") <-- is --> (" + j+")");
	}

	public static int reverse(int i) {

		int reverse = 0;
		while (i != 0) {
			reverse = reverse * 10 + i % 10;
			i = i / 10;
		}

		return reverse;

	}

}
