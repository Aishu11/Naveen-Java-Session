package NaveenSessionPractiseAish;
import java.util.ArrayList;

public class StreamsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> emplist = new ArrayList<String>();
		emplist.add("Aish");
		emplist.add("Harish");
		emplist.add("Krithi Family");
		emplist.add("Arun Family");
		emplist.add("Kanish Family");
		
		emplist.stream().
		filter(ele -> ele.contains("Family")).
		forEach(ele -> System.out.println(ele));
	}

}
