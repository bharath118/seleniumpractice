package javaprograms;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=23; 
		int flag=0;





		for(int j=2;j<i;j++)
		{
			if((i%j)==0)
			{
				//System.out.println( j + ":" + "Not a Prime");
				flag=1;
				//break;
			}
		}
		if(flag==0)
		{
			System.out.println( i + ":" + "Prime");

		}

		if(flag==1)
		{
			System.out.println( i + ":" + "Not a Prime");

		}
	}
}
