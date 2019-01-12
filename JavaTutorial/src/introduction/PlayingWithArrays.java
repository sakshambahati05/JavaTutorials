package introduction;

public class PlayingWithArrays {

	public static void main(String[] args) {

// 1. One way of defining an array is this --->
		int[] myIntArray1;
		myIntArray1 = new int[10];

		myIntArray1[0] = 12453;
		myIntArray1[1] = 12454;
		myIntArray1[2] = 12455;
		myIntArray1[3] = 12456;
		myIntArray1[4] = 12457;
		myIntArray1[5] = 12458;
		myIntArray1[6] = 12459;
		myIntArray1[7] = 12410;
		myIntArray1[8] = 12411;
		// myIntArray1[9]=12412;

		for (int i = 0; i < myIntArray1.length; i++) {
			System.out.println("The value of array index #" + i + "-->" + myIntArray1[i]);

		}
		System.out.println(
				"\n\nSince you've not mentioned at the 9th index of the array thats why its showing default integer value in case of empty which is "
						+ myIntArray1[9] + "\n\n\n");

// 2.This is another way of declaring an array directly in one line --->

		String[] myStringArray1 = { "test", "the", "best" };
		for (int j = 0; j < myStringArray1.length; j++) {
			System.out.println("The value of string array index #" + j + " --> " + myStringArray1[j]);

		}
//	3. Saving the length of an array in a variable 

		int integerArrayLength = myIntArray1.length;
		int stringArrayLength = myStringArray1.length;
		System.out.println("The length of the Interget type array declared is --> " + integerArrayLength);
		System.out.println("The length of the String type array declared is --> " + stringArrayLength);

	}

}
