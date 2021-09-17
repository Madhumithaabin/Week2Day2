package Assignments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";

		char[] charArray = test.toCharArray();

		int i;

		System.out.print("String :" + test + " Reversed String :");
		for (i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

		System.out.print("\nString :" + test + " Reversed String :");
		for (i = test.length() - 1; i >= 0; i--) {
			System.out.print(test.charAt(i));
		}

	}

}
