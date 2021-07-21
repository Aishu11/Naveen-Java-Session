package NaveenAssignment;

public class ConditionalOperators {

	public static void main(String[] args) {
		//Geratest Three
		int a = 25;
		int b = 78;
		int c = 87;

		if ((a >b) && (a > c)) {
			System.out.println("Greatest is: " + a);
		} else if (b > c) {
			System.out.println("Greatest is: " + b);
		} else {
			System.out.println("Greatest is: " + c);
		}
		
		//Gereatest Four
		int a1 = 25;
		int b1 = 78;
		int c1 = 800;
		int d1 = 91;
		
		if((a1>b1)&&(a1>c1)&&(a1>d1)){
			System.out.println("Greatest is: " + a1);
		}
		else if((b1>c1)&&(b1>d1)){
			System.out.println("Greatest is: " + b1);
		}
		else if(c1>d1){
			System.out.println("Greatest is: " + c1);
		}
		else{
			System.out.println("Greatest is:" + d1);
		}
		
		//Positive or Negative Number
		int num = 11;
		
		if(num == 35){
			System.out.println("Positive number");
		}
		else if(num == 11){
			System.out.println("Negative number");
		}
		
		//Eligible to vote
		

	}

}
