/*
	Ryan Arokia-Raj
	20230227
	LabQuiz1.java
*/
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LabQuiz1
{
	public static void main(String[] args)
	{

		// File imports
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");

		// Variables
		double costRange = 0;
		double priceRange = 0;
		int quantityRange = 0;
		double cost = 0;
		double price = 0;
		int quantity = 0;
		double profit = 0;
		int i;

		// User prompts
		System.out.print("Enter the range for the cost of the items: ");
		costRange = input.nextDouble();
		System.out.print("Enter the range for the price of the items: ");
		priceRange = input.nextDouble();

		// Report heading
		System.out.println("Part\t\t\t\tQuantity");
		System.out.println("Name\t\tCost\tPrice\tin Stock\tProfit\t\tReorder");

		for (i = 0; i < 10; i++)
		{
			cost = rand.nextDouble(costRange);
			do {
				price = rand.nextDouble(priceRange);
			} while (price < cost);
			quantity = rand.nextInt(10000);

			profit = (price - cost) * quantity;

			System.out.print("Widget " + (i + 1) + "\t" + formatter.format(cost) + "\t" + formatter.format(price) + "\t" + quantity + "\t\t" + formatter.format(profit) + "\t");

			if (quantity < 25)
			{
				System.out.print("Yes");
			}
			else
			{
				System.out.print("No");
			}
			System.out.println();
		}

	}
}
