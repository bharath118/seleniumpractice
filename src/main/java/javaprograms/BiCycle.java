package javaprograms;

public class BiCycle {

	int gear=1;
	int speed=0;
	String color="red";
	
	void changeColor(String newColor)
	{
		color=newColor;
		System.out.println(color);
	}
	
	void changeGear(int newgearvalue)
	{
		gear=newgearvalue;
		System.out.println(gear);
	}
	
	void speedUp(int increasespeed)
	{
		speed = speed + increasespeed;
		System.out.println(speed);
	}
	
	void applyBrake(int decreasespeed)
	{
		speed = speed - decreasespeed;
		System.out.println(speed);

	}
		
	
public static void main(String args[])
{
	BiCycle cycle = new BiCycle();
	cycle.changeGear(2);
	cycle.speedUp(1);
	cycle.applyBrake(1);
	cycle.changeColor("green");
}
	
}