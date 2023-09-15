package chap3;
import java.util.Scanner;

public class Exercise03_02
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
		double a1 = input.nextDouble();
		double b1 = input.nextDouble();
		double c1 = input.nextDouble();
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();
		double c2 = input.nextDouble();
		
		double num = a1 * a2 - b1 * c1;
		if ( num == 0 )
		{
			System.out.println("The equation has no solution");
		}
		else
		{
			double x = (b2 * c1 - b1 * c2) / (b2 * a1 - b1 * a2);
			double y = (a2 * c1 - a1 * c2) / (a2 * b1 - a1 * b2);
			System.out.println("\nx is " + x + " and y is " + y);
		}
		
	}
	
}
