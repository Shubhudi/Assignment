	

import java.util.*;

public class EmailValidation {
	
	public static void main(String[] args) {
		
	
	
	ArrayList <String> A = new ArrayList <String>();
			
			
	A.add("shelakeshubhangi007@gmail.com");
	
	A.add("charudevc1@gmail.com");
	
	A.add("omkarshelake@gmail.com");
	
	A.add("poojashelake@gmail.com");
	
	A.add("poonamshelake@gmail.com");
	
	A.add("amangupta@gmail.com");
	
	A.add("mattling@gmail.com");
	
	A.add("jimcook@gmail.com");
	
	A.add("XYZ@gmail.com");
	
	A.add("jook@gmail.com");
	
	System.out.println("Enter the emailId");
	
	Scanner sc = new Scanner(System.in);
	
	String EmailId = sc.next();
	
	Iterator itr = A.iterator();

	while(itr.hasNext())
		
	{
		String S2 = (String) itr.next();
		
		
		
			if(S2.equals(EmailId))
				
			{
			
			
			System.out.println("This email id is present in the database");
			
			break;
			
			}
			
	
			
	}
	
}


}
		
	
	
	
	
			
	

