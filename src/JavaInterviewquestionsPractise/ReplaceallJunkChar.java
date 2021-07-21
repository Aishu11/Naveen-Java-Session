package JavaInterviewquestionsPractise;

public class ReplaceallJunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sr = "#$#$#@#$@#$#@ Aish 080 #@#@!@)&&(&5";
		sr = sr.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sr);

	}

}
