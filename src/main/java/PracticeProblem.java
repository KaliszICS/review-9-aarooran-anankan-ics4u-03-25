public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(lettersToFive("aarooran anankan", 'a'));
		System.out.println(countLetter("aarooran anankan", 'a'));
		System.out.println(oddSum(2, 6));
	}

	public static int lettersToFive(String word, char letter) { //1
		
		int occ = 0; //the amount of occurences
		int let = 0; //each letter index

		

		for (int eachLetter = 0; eachLetter < word.length(); eachLetter++) {
			
			while (occ < 5 && let < word.length()) {

				if (word.charAt(let) == letter) {
					occ++;
					let++;
				}
	
				else {
					let++;
				}
	
			}

		}

		if (occ <= 4) {
			let = -1;
		}

		return let;

	}

	public static int countLetter(String word, char letter) { //2

		int occ = 0; //amount of occurences
		int let = 0; //letter indexes

		while (let < word.length()) {

			if (word.charAt(let) == letter) {
				occ++;
				let++;
			}
			
			else {
				let++;
			}

		}

		return occ;

	}

	public static int oddSum(int num1, int num2) { //3

		int sum = 0;
		int une;
		int deux;

		if (num1 < num2) {

			une = num1; //2
			deux = num2; //6

			for (int i=num1; i<=num2; i++) { //=2, <=6

				if (une%2==0) { //if even
					une++;
				}

				else { //if odd
					sum = sum + une;
					une++;
				}

			}

		}

		else if (num1 > num2) {

			une = num1;
			deux = num2;

			for (int i=num2; i<=num1; i++) {

				if (deux%2==0) { //if even
					deux++;
				}

				else { //if odd
					sum = sum + deux;
					deux++;
				}

			}

		}

		else { //when they are equal
			
			if (num1%2!=0) { //if even
				sum = num1;
			}

		}

		return sum;

	}
}
