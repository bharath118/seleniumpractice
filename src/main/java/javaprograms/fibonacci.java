package javaprograms;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);

		for(int i=1;i<20;i++)
		{
			num3=num1 + num2;
			if(num3 <= 100)
			{
				System.out.println(num3);	
			}
			else
			{
				break;
			}
			num1=num2;
			num2=num3;
			
		}
	}

}
