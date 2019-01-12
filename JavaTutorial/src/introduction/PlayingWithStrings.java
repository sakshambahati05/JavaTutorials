package introduction;

public class PlayingWithStrings {

	public static void main(String[] args) {

		String str1 = "     This is a check for installation which";

		System.out.println(str1.concat(" fails or passes !"));

		System.out.println(str1);
		System.out.println(
				"This shows that on doing string operations the original object is not modified, and instead just the appended text is shown as printed. Now what to do with it ?");

		char[] charminar = str1.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			System.out.println("Printing at position " + i + " --> " + charminar[i]);

		}

		System.out.println("showing in lower case -> " + str1.toLowerCase());
		System.out.println("showing in upper case -> " + str1.toUpperCase() + " <- check this");

		System.out.println("This is an example of trim -->" + str1.trim() + "<--This is good");

		System.out.println("This returns the substring example with just the beginning index explicitly mentioned --> "
				+ str1.substring(10));
		System.out.println(
				"This returns the substring example with just the beginning & ending index explicitly mentioned --> "
						+ str1.substring(10, 20));

	}

}
