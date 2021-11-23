package curs2;

public class Shape {
	
	public Shape(int leng) {
		System.out.println("The area of the square is: " + calculateSquareArea(leng));
	}
	
	public Shape(int leng, int width) {
		System.out.println("The area of the rectanlge is: " + calculateRectangleArea(leng, width));
	}
	
	public Shape(double radius) {
		System.out.println("The area of the circle is: " + radius * radius * Math.PI);
	}

	public int calculateSquareArea(int leng) {
		return leng * leng;
	}

	public int calculateRectangleArea(int leng, int width) {
		return leng * width;
	}
}
