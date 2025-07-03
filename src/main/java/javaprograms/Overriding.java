package javaprograms;

public class Overriding{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentOverriding PO = new ChildOverriding();
		//ChildOverriding CO = new ChildOverriding();
		System.out.println(PO.method1(10, 5));
		System.out.println(PO.method2(10, 5));
	}
}	

class ParentOverriding {

	public int method1(int a, int b)
	{
		return a+b;
	}
	
	public int method2(int c, int d)
	{
		return c*d;
	}
	
}


class ChildOverriding extends ParentOverriding{

	@Override
	public int method1(int a, int b)
	{
		//super.method1(11, 12);
		return a-b;
	}
	
	@Override
	public int method2(int c, int d)
	{
		return c/d;
	}
}	
	
	
