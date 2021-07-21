package NaveenSessionPractiseAish;

public class GreatestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1000;
		int j = 200;
		int k = 30;
		int l = 25000;

		if ((i > j) && (i > k) && (i > l)) {
			System.out.println("i is the greatest" + i);
		} else if ((j > k) && (j > l)) {
			System.out.println("j is the greatest" + j);
		} else if (k > l) {
			System.out.println("k is the greatest" + k);
		} else {
			System.out.println("l is the greatest" + l);
		}

	}

}
