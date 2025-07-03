package javaprograms;

class getset {
private int a = 10;
private int b = 20;
int prod = 0;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public int product() {
	prod = a * b;
	return prod;
}

}

public class gettersetter {

	public static void main(String[] args) {
		
		getset gs = new getset();
		gs.setA(2);
		gs.setB(4);
		System.out.println("Product of a and b is: " + gs.product());
		// TODO Auto-generated method stub

	}


}
