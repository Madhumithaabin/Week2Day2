package Assignments;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0, i, j;
		String result = "";
		System.out.println("original text: " + text);
		String[] split = text.split(" ");
		for (i = 0; i < split.length; i++) {
			for (j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					split[j] = "remove";
				}

			}
		}
		String finalstring = split.toString();
		for (String words : split) {
			if (words != "remove") {
				result = result + words + " ";
			}
		}

		System.out.print("Duplicates text removed :" + result);
	}

}
