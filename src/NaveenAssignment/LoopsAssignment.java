package NaveenAssignment;

public class LoopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("I am Batman");
		}

		System.out.println("************");
		for (int k = 0; k <= 9; k++) {
			System.out.println("I am Batman" + k);
		}

		System.out.println("*********");
		System.out.println("*** for****");

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("*********");
		System.out.println("*** while****");
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		System.out.println("*********");
		System.out.println("*** Do while****");
		int k = 10;
		do {
			System.out.println(k);
			k--;
		} while (k >= 1);

		System.out.println("*********");
		System.out.println("*** while with String ****");

		int j = 0;
		while (j <= 10) {
			System.out.println("Hello World");
			j++;
		}

		System.out.println("*********");
		System.out.println("*** while with condition ****");
		int l = 0;
		while (l <= 10) {
			System.out.println(l);
			if (l == 7) {
				System.out.println("Number 7 is encountered");
				break;
			}
			l++;
		}

	}

}
