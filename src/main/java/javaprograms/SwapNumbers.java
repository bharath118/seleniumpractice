package javaprograms;

public class SwapNumbers {

	void swapNumbers(int a, int b)
	{
		System.out.println("Before Swap - " + a + " , " + b);	
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap - " + a + " , " + b);
	}
	
	public static void main(String[] args) {
		SwapNumbers swap = new SwapNumbers();
		swap.swapNumbers(111, 342);

	}

}
