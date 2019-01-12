package introduction;

public class UsingObjectsOfDifferentClassInMainFunction {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

//Creating and initializing the object of another class (ex here is NewClassWithoutpsvm)
//syntax is --> classname <refernce-name> = new class-name, then the methods of the other 
//class can also be used in the new class ... Interesting 

		// # Example Number 1
		MoreThanOneMethods multipleMethods = new MoreThanOneMethods();
		multipleMethods.calculator();

		// # Example Number 2 : with Getters and Setters - from NewClassWithoutpsvm line
		// 23 & 24
		NewClassWithoutpsvm learnViral = new NewClassWithoutpsvm();
		learnViral.startLearning();
		learnViral.setLanguagePreference("Java It Is !!!!");
		System.out.println(learnViral.getLanguagePreference());

		learnViral.getDifficultyLevel(); // this statement is to make sure that the objects of a different class are
											// accessible here
		learnViral.setDifficultyLevel(21); // this statement is to make sure that we set the value for the variable of
											// an object
		System.out.println(learnViral.getDifficultyLevel()); // this statement just prints the value of the object

	}

}
