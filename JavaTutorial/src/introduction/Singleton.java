package introduction;

public class Singleton {

	private static Singleton reference_instance = null; // private static reference variable for a class
														// is'reference_name' which we have initialized as 'null'
	public String str;

	// Step 1 : Create a constructor of the class and set its visibility to
	// "private" as shown just below
	private Singleton() {
		str = "Check concept of singleton class";
	}

	// Step 2 : Lazy Initialization <---> Write a public static method(getInstance
	// method) that has return type object of this singleton class
	public static Singleton getInstance() {
		System.out.println("Inside getInstance() method");
		// first time the reference_instance will be null, so this will initialize it
		// only once for the first time
		if (reference_instance == null)
			reference_instance = new Singleton();
		// with the above statement,the private static reference class variable(global
		// object reference variable) is now pointing to the object of the class
		return reference_instance;
	}

	public static void main(String[] args) {
		Singleton x = getInstance(); // getInstance method is returning Singleton class's object so we will store it
										// somewhere. Hence, this statement
		Singleton y = getInstance();
		Singleton z = getInstance();

		// We are trying to create multiple Singleton objects using the above two
		// statements
		// But, due to the if block inside the getInstance method, the reference
		// instance is only created once.
		// Due to this at the end only one object will be created and all the other
		// object references shall point to the same object

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase(); // Using any of the three object references if any change is made in the object then it reflects for the object references as well
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
