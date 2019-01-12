package introduction;

public class PalindromeCheck {

	public static void main(String[] args) {
		String input = "r";
		int i = input.length();
		char[] ar = input.toCharArray();
		boolean b = isPallindrom(i, ar);
		if (b==true) {
			System.out.println("Mr. Saksham Bahati, The number youve entered is pallidrome");
		}
		else {
			System.out.println("Mr. Saksham Bahati The number you've entered is not pallindrome");
		}
	}

	public static boolean isPallindrom(int length, char y[]) {

		int j = length - 1;
		for (int i = 0; i < length/2; i++) {
			if (y[j]==y[i]) {
				j--;
			}
			else {
				
				return false;
			}

		}
		return true;
		
	}
}