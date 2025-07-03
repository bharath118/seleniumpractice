package javaprograms;

public class InterfaceClass implements Interface {

	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void subtraction(int c, int d)
	{
		System.out.println(c-d);

	}
			
	public void multiply(int e, int f)
	{
		System.out.println(e*f);

	}

	public static void main(String args[])
	
	{
		InterfaceClass ic = new InterfaceClass();
		ic.addition(10, 11);
		ic.subtraction(10, 5);
		ic.multiply(5, 4);
	}
	
}
