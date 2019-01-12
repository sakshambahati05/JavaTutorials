package introduction;

public class ConstructorDemo {

	public static void main(String[] args) {

		/*
		 * As soon as we create an object of a class, its constructor gets automatically
		 * called. This is implicit functioning of Java which happens irrespective of
		 * the fast that its explicitly defined The constructor always has the same name
		 * as the class name Check the first line that gets printed as a part of
		 * executing this code. Its coming in from the constructor as its not mentioned
		 * anywhere in this program
		 */

		CheckConstruct testConstruct = new CheckConstruct();
		// testConstruct.setName("Saksham");
		System.out.println("The name chosen by you is --> " + testConstruct.getName());

		System.out.println(testConstruct.getAge());
		System.out.println(testConstruct.getGender());

		CheckConstruct test2Constrct = new CheckConstruct("Djokoba", "female");
		System.out.println(test2Constrct.getName());
		System.out.println(test2Constrct.getGender());

	}

}

/*
 * In case constructor is not defined explicitly even then no argument
 * constructor of the class is automatically defined by java A constructor can
 * be defined a number of times in a class with arguments as well
 */

// You can call a constructor inside another constructor of the same class, but need to study why and when exactly it is done
//This is the text to make sure that I know what I dont know ;-) Tricky, yet true :-)