/*
 * Ryan Arokia-Raj
 * 20230225
 * CSC161-03
 */
package chap3;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double side1;
		double side2;
		double side3;
		int whichSide;
		double base = 0.0;
		double height;
		double perimeter;
		double area;
		
		System.out.println("Enter side 1: ");
		side1 = input.nextDouble();
		System.out.println("Enter side 2: ");
		side2 = input.nextDouble();
		System.out.println("Enter side 3: ");
		side3 = input.nextDouble();
		System.out.println("Which side is the base: ");
		whichSide = input.nextInt();
		if (whichSide == 1)
		{
			base = side1;
		}
		else if (whichSide == 2)
		{
			base = side2;
		}
		else if (whichSide == 3)
		{
			base = side3;
		}
		System.out.println("Enter height: ");
		height = input.nextDouble();
		
		perimeter = side1 + side2 + side3;
		area = 0.5 * base * height;
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
		
	}

}
