package introduction;

import java.util.ArrayList;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(-4);
		ar.add(-3);
		ar.add(-1);
		ar.add(0);

		try {
			missingNumber(ar);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int missingNumber(ArrayList<Integer> arr) {
		int num = 0;
		int acNum = 0;
		int limit = arr.size();

		for (int i = limit - 1; i >= 0; i--) {
			num = num + arr.get(i);
		}
		//System.out.println(num);
		for (int j = arr.get(limit - 1); j >= 0; j--) {
			//System.out.println(limit);
			System.out.println(j);
			acNum = acNum + j;
		}
		//System.out.println(acNum);

		System.out.println("Missing number is --> " + (acNum - num));
		return (acNum - num);

	}
}
