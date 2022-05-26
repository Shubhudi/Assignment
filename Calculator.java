
import java.util.*;

import java.io.*;


		class calculation
		
		{
			
			
		void calculate()
		
		{

		System.out.println("Enter the First Number:");
		
		Scanner sc = new Scanner(System.in);
		
		int Num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		
		int Num2 = sc.nextInt(); 
		
		System.out.println("Enter Yoour Choice To Perform The Operation:");
		
		System.out.println("1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit");
		
		int choice = sc.nextInt();
		
		
			if(choice == 1)
		
			{
		
				int addition = Num1 + Num2;
		
				System.out.println("Addition is:"+addition);
		
		
			}
	
			else if(choice == 2)
		
			{
		
				int substraction = Num1 - Num2;
		
				System.out.println("Substraction is:"+substraction);
		
		
			}
	
			else if(choice==3)
		
			{
		
				int mul = Num1 * Num2;
		
				System.out.println("Multiplication is:"+mul);
		
		
			}
	
	
			else if(choice==4)
	
			{
	
				int div = Num1 / Num2;
	
				System.out.println("Division is:"+div);
	
	
			}
	
	
			else if(choice==5)
		
			{
	
				System.exit(0);
	
	
			}
	
			else
		
			{
		
				System.out.println("Invalid choice");
			}
	
			
	
	
		}
		
		}
	
	
	
		public class Calculator {
			
			public static void main(String a[])
			
			{
				
				for(int i=1;i<=5;i++)
					
				{
				
				calculation c = new calculation();
				
				c.calculate();
				
				}
			}
	
	
		}
	


