package introduction;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("Step 1");
		
		try{
			throw new Exception("<----This is SakshamCalling from outer Galaxy from a time far far away---->");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Step 2 : Check this");
	
	}

}
