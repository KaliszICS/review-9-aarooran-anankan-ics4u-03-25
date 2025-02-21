public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String word, char letter) { //1
		
		int num = 0;
		int i = 0;

		while (num <= 4) {

			if (word.charAt(i) == letter) {
				num++;
				i++;
			}

			else {
				i++;
			}

		}

		return i;

	}
}
