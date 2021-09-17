package Assignments;

public class ReverseEvenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] words = test.split(" ");
		String reverseWord = "";
		String reversedString = "";
		String reversedString1 = "";
		System.out.println("Orginal text : " + test);

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			if (i % 2 != 0) {

				for (int j = word.length() - 1; j >= 0; j--) {
					reverseWord = reverseWord + word.charAt(j);

				}
				reversedString = reversedString + reverseWord;
				reversedString1 = reversedString;

			} else {
				reverseWord = reverseWord + " " + word + " ";
				reversedString = reversedString + reverseWord;
				reversedString1 = reversedString;
			}

			reversedString = "";
		}

		System.out.println("Even posistion are reversed : " + reversedString1);

	}

}
