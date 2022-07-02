package Testing;

import java.security.InvalidParameterException;

public class Box {
	
	int x;
	int y;
	
	//Overloaded Constructor for Box
	public Box(int theX, int theY) {
		
		x = theX;
		y = theY;
		
	}
	//Function return the variables x and y
	
	public int getArea() {
		// TODO Auto-generated method stub
		return x * y;
	}
	
	public void setSize(int theX, int theY) throws InvalidParameterException
	{
		if (theX < 0 || theY < 0) {
			throw new InvalidParameterException();
		}
		x = theX;
		y = theY;
	}

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello Ayo Oni");
		
		Box b1 = new Box(100, 15); 
		System.out.println("Area: " + b1.getArea());

	}

	
}
