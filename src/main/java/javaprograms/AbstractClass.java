package javaprograms;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiplication mul = new multiplication();
		mul.addition(10, 10);
		mul.subtraction(10, 5);
		mul.multiply(10, 5);

	}
}

abstract class maths
{

	public void addition(int a, int b){
		System.out.println(a+b);
	}
		
	public void subtraction(int c, int d){
			System.out.println(c-d);	
			
	}
	
	public abstract void multiply(int e, int f);

}

class multiplication extends maths
{
	@Override
	public void multiply(int e, int f)
	{
		System.out.println(e*f);	

	}
	
}