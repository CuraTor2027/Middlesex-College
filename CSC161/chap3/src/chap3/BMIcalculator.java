/*
 * Ryan Arokia-Raj
 * 20230225
 * CSC161-03
 */
package chap3;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class BMIcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.0");
		
		double weight;
		double height;
		double bmi;
		
		System.out.println("Enter height(inches): ");
		height = input.nextDouble();
		System.out.println("Enter weight(pounds): ");
		weight = input.nextDouble();
		
		height = height * 0.0254;	// conversion of inches to meters
		weight = weight * 0.45359237;	// conversion of pounds to kilograms
		
		bmi = weight / Math.pow(height, 2);
		
		System.out.println("BMI: " + formatter.format(bmi));
		
	}

}
