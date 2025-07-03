package javaprograms;

import java.util.Scanner;

public class LeapYear {

	static void calculateLeapYear(int year)
	{
		if(((year%4)==0) && ((year%100)==0) && ((year%400)==0))
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LeapYear ly = new LeapYear();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int yr = sc.nextInt();
		calculateLeapYear(yr);

	}

}
