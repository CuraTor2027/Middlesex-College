/*
	Ryan Arokia-Raj
	20230222
	Practice Test 1
*/
import java.util.Random;
public class PracticeTestOne
{
	public static int randomNum(int min, int max)
	{
		Random rand = new Random();
		int num = rand.nextInt(max) + min;
		return num;
	}
	public static void main(String[] args)
	{
		int miles = 0;
		int gallons = 0;
		double milesPerGallon = 0;
		String rating = " ";
		int totalMiles = 0;
		int totalGallons = 0;
		double totalMilesPerGallon = 0;

		System.out.println("Automobile Mileage Chart");
		System.out.println("Tip Number\tMiles\tGallons\t\tMiles per Gallon\tRating");
		for (int i = 1; i < 6; i++)
		{
				miles = randomNum(100, 451);
				gallons = randomNum(15, 20);
				milesPerGallon = miles / gallons;

				if (milesPerGallon < 15)
				{
					rating = "Poor";
				}
				else if (milesPerGallon >= 15 && milesPerGallon < 20)
				{
					rating = "Fair";
				}
				else if (milesPerGallon >= 20 && milesPerGallon < 26)
				{
					rating = "Good";
				}
				else if (milesPerGallon > 25)
				{
					rating = "Excellent";
				}
				System.out.print(i + "\t\t" + miles + "\t" + gallons + "\t\t" + milesPerGallon + "\t\t\t" + rating + "\n");

				totalMiles += miles;
				totalGallons += gallons;
				miles = 0;
				gallons = 0;
				milesPerGallon = 0;
		}

		totalMilesPerGallon = totalMiles / totalGallons;
		if (totalMilesPerGallon < 15)
		{
			rating = "Poor";
		}
		else if (totalMilesPerGallon >= 15 && totalMilesPerGallon < 20)
		{
			rating = "Fair";
		}
		else if (totalMilesPerGallon >= 20 && totalMilesPerGallon < 26)
		{
			rating = "Good";
		}
		else if (totalMilesPerGallon > 25)
		{
			rating = "Excellent";
		}
		System.out.println("Total\t\t" + totalMiles + "\t" + totalGallons + "\t\t" + totalMilesPerGallon + "\t\t\t" + rating + "\n");
	}
}
