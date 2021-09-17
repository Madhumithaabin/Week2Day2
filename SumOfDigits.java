package Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, sum = 0;

		String text = "Tes12Le79af65";
		String replaceAll = text.replaceAll("[\\D]", "");
		System.out.print("Sum of : " + replaceAll + " is ");
		char[] charArray = replaceAll.toCharArray();
		for (i = 0; i < charArray.length; i++) {

			sum += Character.getNumericValue(charArray[i]);

		}
		System.out.print(sum);
	}

}
