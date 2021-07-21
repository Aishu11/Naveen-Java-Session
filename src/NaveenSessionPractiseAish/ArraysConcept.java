package NaveenSessionPractiseAish;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[] = new int[5];
		i[0] = 3;
		i[1] = 5;
		i[2] = 6;
		i[3] = 4;
		i[4] = 10;
		
		
		for(int k=0;k<i.length;k++){
			System.out.println(i[k]);
		}
		
		//If we try to access beyond 4, then we will get Array Index out of Bound Exception
		
		//**** For Each **** //
		for(int e: i){
			System.out.println(e);
		}
		
		//**** String Type Array **** //
		String s[] = new String[3];
		s[0] = "Aish";
		s[1] = "Amma";
		s[2] = "Appa";
		
		for(String ele: s){
			System.out.println(ele);
		}
		
		/*//New Keyword used in two places.
		1. To create the Object of the class
		2. To create the memory for Array Variable*/
		
		//Object Array: Used to store any data type values
		
		Object ob[] = new Object[3];
		
		ob[0] = "abc";
		ob[1] = 12;
		ob[2] = '$';
		
		for(Object ele:ob){
			System.out.println(ele);
		}
		
		//When we fill the value beyond 3 above and try to access it, then the same Array out of Bound Exception
		//If we want to compare two integer then we shall use '==' 
		//If we want to compare object to integer then we need to use .equals method.
	}

}
