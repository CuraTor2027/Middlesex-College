/*
	Ryan Arokia-Raj
	20230308
	PracticeQuiz.java
*/
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class PracticeQuiz
{
	public static void header()
	{
		System.out.println("Model\t\t\t\t\t\t\t\tPrice");
		System.out.println("Name\t\tCost\t\tPrice\t\tProfit\t\tCategory");
		System.out.println("________________________________________________________________________");
	}
	public static double calculateCost(double rangeOfCost)
	{
		Random rand = new Random();
		double cost = rand.nextDouble(rangeOfCost);
		return cost;
	}
	public static double calculatePrice(double cost)
	{
		double price = cost * 1.32;
		return price;
	}
	public static double calculateProfit(double price, double cost)
	{
		double profit = price - cost;
		return profit;
	}
	public static String category(double price)
	{
		String category;
		if (price > 60000)
		{
			category = "Luxury";
		}
		else if (price >= 40000 && price <= 60000)
		{
			category = "Midrange";
		}
		else
		{
			category = "Economy";
		}
		return category;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");

		double rangeOfCost;
		double cost;
		double price;
		double profit;
		String priceCategory;

		System.out.print("Enter the range of the cost: ");
		rangeOfCost = input.nextDouble();

		header();

		for (int index = 10001; index < 10016; index++)
		{
			cost = calculateCost(rangeOfCost);
			price = calculatePrice(cost);
			profit = calculateProfit(price, cost);
			priceCategory = category(price);
/*			System.out.println("Model " + index + "\t" + formatter.format(cost) + "\t" + formatter.format(price)
				+ "\t" + formatter.format(profit) + "\t\t" + priceCategory);*/
			System.out.print("Model " + index);
			System.out.printf("\t%8.2f\t%8.2f\t%8.2f\t", cost, price, profit);
			System.out.println(priceCategory);
		}
	}
}
