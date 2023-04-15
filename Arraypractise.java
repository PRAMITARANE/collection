package pramita;

public class Arraypractise {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int rollno[] = {41,51,61,71,81,91};
		
		System.out.println("first element: " +rollno[0]);
		System.out.println("first element:" +rollno[4]);
	String name = "Pramita";
	System.out.println(name.charAt(4));
	
	for (int i=0; i<rollno.length;i++)
	{System.out.println ("from the for loop:" +rollno[i]);
	}
	 System.out.println("**********");
	
	
	for(int i:rollno) {
		System.out.println("from the for each loop:" +i);
	}

	}

}

