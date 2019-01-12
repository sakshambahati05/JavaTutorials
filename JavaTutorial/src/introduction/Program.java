package introduction;

public class Program {
	  public static void main(final String[] args) {
	    final int n = 4;
	    System.out.println(n + "! = " + factorial(n));
	    String s="sakshambahati";
	   
	    int length=s.length();
	    System.out.println(length);
	    
	    char [] array=new char[length];
	    StringBuffer r=new StringBuffer(s);
	    
	    try{
	    	r.getChars(0, length, array, 0);
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	    
	    System.out.println(array);
	    
	    for (int i=0;i<length;i++)
	    {
	    	System.out.print(array[i]+",");
	    }
	    
	  }

	  private static int factorial(final int n) {
	    if (n == 0)
	      return 1;
	    return n * factorial(n - 1);
	  }
	}