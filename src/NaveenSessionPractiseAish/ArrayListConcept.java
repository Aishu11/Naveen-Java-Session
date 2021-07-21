package NaveenSessionPractiseAish;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		ar.add(600); //5
		
		System.out.println(ar.size());
		
		ar.add(700);//6
		ar.add(800);//7
		ar.add(900); //8
		ar.add(1000);//9
		ar.add(1100);//10
		
		System.out.println(ar.size());
		
		ar.add(1200); //11
		ar.add(1200); //12
		ar.add(1200); //13
		
		System.out.println(ar.size());
		
		ar.add(1500); //14
		ar.add(1600); //15
		
		System.out.println(ar.size());
	//System.out.println(ar.get(16));
	
	for(int i= 0; i<ar.size();i++){
		System.out.println(ar.get(i));
	}
	
	System.out.println("**********");
	for(Object e: ar){
		System.out.println(e);
	}
	}
}
