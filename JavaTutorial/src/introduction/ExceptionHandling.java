package introduction;


public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int i=9/0;
		System.out.println(i);
		}
		catch (Exception e) {
			System.out.println("\n");
			e.printStackTrace(); //This statement ensures that the error caught by the catch statement gets displayed in the console
			System.out.println("\nClass in which error occured is -> "+e.getClass()+"\n"); //to get the class in which error occured

		}
		System.out.println("\n\nmy name is Saksham\n");
		
	}
	

}
