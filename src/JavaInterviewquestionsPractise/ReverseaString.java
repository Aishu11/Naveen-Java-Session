package JavaInterviewquestionsPractise;

public class ReverseaString {

	public static void main(String args[]) {
		// Method 1:
		String sr = "Aishu";
		String rev = "";

		for (int i = sr.length()-1; i >= 0; i--) {
			rev= rev+ sr.charAt(i);
		}
		System.out.println(rev);
		
		//Method 2:
		StringBuffer sb = new StringBuffer(sr);
		sb = sb.reverse();
		System.out.println(sb);
	}

}
