/*
 * Ryan Arokia-Raj
 * 20230225
 * CSC161-03
 */
package chap3;
import java.lang.Math;
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = 5.5;
		final double PI = 3.14159265;
		
		double perimeter = 2 * PI * radius;
		double area = PI * Math.pow(radius, 2);
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
		
	}

}
