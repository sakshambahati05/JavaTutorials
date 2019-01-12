package introduction;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThrowsKeyword m = new ThrowsKeyword();
		try{
			m.multiple();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Is this printed ??");

	}

	public void multiple() throws Exception{
		divide();
	}
	
	public int divide() throws Exception{ 
		int i=9/0;
		return i;
	}
}
