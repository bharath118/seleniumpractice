package javaprograms;

public class LargestNumbers {

	public static void main(String[] args) {
		
		int num[]={52,43,45,67,54,34,22,6,100};
		int smallest= num[0];
		int largest= num[0];
		for(int i=0;i<num.length;i++)
		{
			if(largest < num[i])
					{
						largest = num[i];
					}
			else if(num[i] < smallest)
				{
					smallest = num[i];
				}
			

			}
		System.out.println("Largest Number:" + largest);
		System.out.println("Smallest Number:" + smallest);
			
		}
		
		
	}

