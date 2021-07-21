package NaveenAssignment;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + + j);
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("******Cricket Player*****");

		String name[] = new String[3];
		int age[] = new int[3];
		String teamname[] = new String[3];
		String dob[] = new String[3];
		char gender[] = new char[3];
		double strikerate[] = new double[3];
		boolean isActive[] = new boolean[3];

		// Player 1
		name[0] = "Sachin";
		age[0] = 30;
		teamname[0] = "India";
		dob[0] = "12/06/90";
		gender[0] = 'M';
		strikerate[0] = 56.68;
		isActive[0] = true;

		// Player 2
		name[1] = "Sam Curran";
		age[1] = 33;
		teamname[1] = "England";
		dob[1] = "11/02/70";
		gender[1] = 'M';
		strikerate[1] = 112.68;
		isActive[1] = false;

		// Player 3
		name[2] = "Jaisurya";
		age[2] = 35;
		teamname[2] = "srilanka";
		dob[2] = "14/06/79";
		gender[2] = 'M';
		strikerate[2] = 118.68;
		isActive[2] = true;
		
		for(String e:name){
			System.out.println(e);
		}
		
		for(String e:teamname){
			System.out.println(e);
		}
		
		for(String e: dob){
			System.out.println(e);
		}
	}

}
