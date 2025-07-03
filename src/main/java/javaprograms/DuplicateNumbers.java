package javaprograms;

import java.util.HashSet;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={34,67,45,98,56,34,67,60,60,98,67,34};
		//int k=0;
		//int array[]=new int[num.length];
		HashSet<Integer> hash = new HashSet<Integer>();

		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{

					hash.add(num[i]);



				}

			}

		}

		System.out.println(hash);
	}



}


