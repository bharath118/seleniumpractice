package javaprograms;





public class addition {
	
	private int sum;
	
	void addNumbers(int a, int b)
	{
		sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is: " + sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition add=new addition();
		add.addNumbers(2, 3);
	}
}
