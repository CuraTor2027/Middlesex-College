/*
 * Ryan Arokia-Raj
 * 20230225
 * CSC161-03
 */
package chap3;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class windChillFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.0");
		
		double temperature = 0;
		double windSpeed = 4;
		double windChillFactor;
		
		do
		{
			System.out.print("Enter temperature in Fahrenheit: ");
			temperature = input.nextDouble();
			System.out.print("Enter wind speed in miles per hour: ");
			windSpeed = input.nextDouble();
			if (temperature < -58 || temperature > 41 || windSpeed < 2)
			{
				System.out.println("Error: Enter a temperature between -58 and 41 and a wind speed greater than 2.");
			}
		} while (temperature < -58 || temperature > 41 || windSpeed < 2);
		
		windChillFactor = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
		
		System.out.println("The wind chill temperature is " + formatter.format(windChillFactor) + ".");
		
	}

}
