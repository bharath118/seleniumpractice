package javaprograms;

import java.util.Scanner;


public class ArithmeticOperations {
	
	public int addition(int n1, int n2)
	{
		int add = n1 + n2;
		return add;
		
	}
	
	public int subtraction(int n1, int n2)
	{
		int sub = n1 - n2;
		return sub;
		
	}
	
	public int multiplication(int n1, int n2)
	{
		int multiply = n1 * n2;
		return multiply;
		
	}
	
	public int division(int n1, int n2)
	{
		int div = n1 / n2;
		return div;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner num1=new Scanner(System.in); 
		   Scanner num2=new Scanner(System.in);
		   Scanner operator = new Scanner(System.in);
		   System.out.println("Enter 2 numbers: ");
		   int n1=num1.nextInt();
		   int n2=num2.nextInt();
		   System.out.println("Enter operator: ");
		   String oper=operator.next();
		   ArithmeticOperations ao = new ArithmeticOperations();
		   if(oper.equals("Add"))
		   {
			   System.out.println("Addition: " + ao.addition(n1, n2));
		   }
		   else if(oper.equals("Subtraction"))
		   {
			   System.out.println("Subtraction: " + ao.subtraction(n1, n2));
			   
		   }
		   else if(oper.equals("Multiplication"))
		   {
			   System.out.println("Multiplication: " + ao.multiplication(n1, n2));
			   
		   }
		   else if(oper.equals("Division"))
		   {
			   System.out.println("Division: " + ao.division(n1, n2));
			   
		   }
		   else
		   {
			   System.out.println("Invalid Operator");
		   }
		   
	}

}
