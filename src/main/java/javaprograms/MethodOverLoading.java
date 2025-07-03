package javaprograms;

public class MethodOverLoading {

	public static void method1(int a)
	{
		System.out.println(a);
	}
	
	public static void method1(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mol = new MethodOverLoading();
		{
			method1(10);
			method1(10, 20);
		}

	}

}
