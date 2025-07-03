package javaprograms;

import java.util.Scanner;

public class SpiltCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner name =new Scanner(System.in);
	    System.out.println("Enter the string: ");
	    String getName = name.next().toString();
	    char[] name1 = new char[getName.length()]; 
		char[] name2= new char[getName.length()];
		int i;
		boolean pal = true;
		char[] stringtoCharArray = getName.toCharArray();
		//System.out.println(stringtoCharArray.length);
		
		for(i=0;i<stringtoCharArray.length;i++)
		{
			name1[i] = stringtoCharArray[i];
			System.out.println(name1[i]);
			
		}
		int l = 0;
		for(int j=(stringtoCharArray.length)-1;j>=0;j--)
		{
			//System.out.println("inside");
			name2[l] = stringtoCharArray[j];
			System.out.println(name2[l]);
			l++;
		}
		for(int k=0; k<stringtoCharArray.length;k++)
		{
			System.out.println(name1[k]);
			System.out.println(name2[k]);
			if (name1[k] != name2[k]){
				pal = false;
				break;
			}
		
		}
		if(pal==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}

}