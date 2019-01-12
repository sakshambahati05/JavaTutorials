package introduction;

public class CheckConstruct {

	String name;
	int age;
	String gender;

	// Below is the constructor, the constructor always has the same name as the
	// class in which it resides
	// As per present understanding its just like a method apart from the above
	// differentiation
	// Its used for setting the default values of the class's member variables

	/*
	 * This is the first constructor for this class which does not require any
	 * arguments
	 * 
	 */
	public CheckConstruct() {

		this.name = "\"Error. Please enter some name in the following program\"";
		this.age = 101;
		this.gender = "\"Error.Please enter some gender unless transgender\"";

		System.out.println("Without arguments constructor");
	}

	/*
	 * This is constructor # 2 which accepts arguments as well
	 */

	public CheckConstruct(String name, String gender) {
		this.name = name;
		this.gender = gender;
		System.out.println("With arguments constructor");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
