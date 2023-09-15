/*
	Ryan Arokia-Raj
	20230401
	CSC161
	CurrencyConversion.java
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class CurrencyConversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");

		double exchangeRate;
		int whichConversion;
		double dollars;
		double rmb;

		System.out.print("Enter the exchange rate from US Dollars to Chinese RMD: ");
		exchangeRate = input.nextDouble();
		System.out.print("Enter 0 to convert US Dollars to Chinese RMB and 1 to convert Chinese RMB to US Dollars: ");
		whichConversion = input.nextInt();

		if ( whichConversion == 0 )
		{
			System.out.print("Enter the amount of US Dollars to convert: ");
			dollars = input.nextDouble();
			rmb = dollars * exchangeRate;
			System.out.println(formatter.format(dollars) + " US dollars is " + formatter.format(rmb) + " Chinese RMB.");
		}
		else if ( whichConversion == 1 )
		{
			System.out.print("Enter the amount of Chinese RMB to convert: ");
			rmb = input.nextDouble();
			dollars = (1 / exchangeRate) * rmb;
			System.out.println(formatter.format(rmb) + " Chinese RMB is " + formatter.format(dollars) + " US Dollars.");
		}
	}
}
