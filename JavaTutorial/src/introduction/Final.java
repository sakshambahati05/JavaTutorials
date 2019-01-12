package introduction;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finallyConcept();
	}
	
	
	public static void finallyConcept() {
		
		try {
		System.out.println("Inside the try block");
		//throw new RuntimeException("test");
		}
		catch (Exception e) {
			System.out.println("inside the catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
		
		}
	
	
	}

