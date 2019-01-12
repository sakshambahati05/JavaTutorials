package introduction;

/**
 * @author saksham
 *
 */

public class RemovingJunk {

	public static void main(String[] args) {

		String one = "(*&*%^*(&^^ this is\"\" *(&%&&&^^^^&^*^&*^&*^test";
		one = one.replaceAll("[^a-zA-Z0-9 \"]", "");
		System.out.println(one);

	}

}
