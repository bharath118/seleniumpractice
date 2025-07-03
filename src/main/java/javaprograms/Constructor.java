package javaprograms;

public class Constructor {
	
	static int k;
	Constructor(int i)
	{
				k=i;
		
	}
	
	Constructor(int i, int j)
	{
				k=i+j;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cons = new Constructor(10,20);
		//Constructor cons = new Constructor(10);
		System.out.println(k);
	
	}

}
