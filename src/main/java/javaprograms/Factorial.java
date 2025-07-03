package javaprograms;

import java.util.Scanner;

public class Factorial {

	void printFactorial(int n)
	{
		int factorial = 0;
		int multiply = 1; 
		if(n%2==0)
		{
			for(int i=n; i>=2; i-=2)
			{
				{
					factorial = multiply * i * (i-1);
																
				}
				multiply = factorial;
			}
		}
		else
		{
			for(int i=n; i>=2; i-=2)
			{
				{
					factorial = multiply * i * (i-1) * 1;
				}
					multiply = factorial;
			}
		}
		System.out.println(factorial);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in); 
		   System.out.println("Enter number: ");
		   int factNumber=sc.nextInt();
		   Factorial fact = new Factorial();
		   fact.printFactorial(factNumber);
		
	}

}
