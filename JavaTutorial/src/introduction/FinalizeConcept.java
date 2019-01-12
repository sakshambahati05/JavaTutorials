package introduction;

public class FinalizeConcept {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeConcept F1 = new FinalizeConcept();
		FinalizeConcept F2 = new FinalizeConcept();

		F1 = null;
		F2 = null;

		// if not object reference is there for an object then garbage collector
		// destroys those objects
		System.gc(); // Calls the Garbage collector --- explicit garbage collector call

	}

	public void finalize() {
		System.out.println("finalize method");
	}

}