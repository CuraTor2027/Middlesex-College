/*
	Ryan Arokia-Raj
	20230510
	FinalExam.java
*/
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
public class FinalExam
{
	public static void inputData(Scanner input, String[] parkName, double[] squareMiles, int[] population)
	{
		for (int i = 0; i < 14; i++)
		{
			parkName[i] = input.nextLine();
			if (parkName[i].equals(""))
			{
				parkName[i] = input.nextLine();
			}
			squareMiles[i] = input.nextDouble();
			population[i] = input.nextInt();
		}
	}

	public static void calculations(double[] squareMiles, int[] population, double[] LanternFlyPerSquareMile, double[] damageCoefficient, String[] threatIndicator)
	{
		for (int i = 0; i < 14; i++)
		{
			LanternFlyPerSquareMile[i] = population[i] / squareMiles[i];
			damageCoefficient[i] = LanternFlyPerSquareMile[i] / population[i];
			if (damageCoefficient[i] <= 0.35)
			{
				threatIndicator[i] = "RED";
			}
			else if (damageCoefficient[i] > 0.35 && damageCoefficient[i] <= 0.50)
			{
				threatIndicator[i] = "ORANGE";
			}
			else if (damageCoefficient[i] > 0.50 && damageCoefficient[i] <= 0.65)
			{
				threatIndicator[i] = "YELLOW";
			}
			else if (damageCoefficient[i] > 0.65 && damageCoefficient[i] <= 0.75)
			{
				threatIndicator[i] = "GREEN";
			}
			else if (damageCoefficient[i] > 0.75)
			{
				threatIndicator[i] = "BLUE";
			}
		}
	}

	public static void printScreen(DecimalFormat formatter, String[] parkName, double[] squareMiles, int[] population, double[] LanternFlyPerSquareMile, double[] damageCoefficient, String[] threatIndicator)
	{
		System.out.println("\n\t\t\t\t\tLantern Fly Threat Report\n");
		System.out.println("Park\t\t\tSquare\tLantern Fly\tLantern Fly per\tDamage\t\tThreat");
		System.out.println("Name\t\t\tMiles\tPopulation\tSquare Mile\tCoefficient\tStatus");
		System.out.println("=====================\t=======\t==========\t==============\t==========\t========");
		for (int i = 0; i < 14; i++)
		{
			if (i == 1 || i == 2 || i == 3)
			{
				System.out.println(parkName[i] + "\t\t" + formatter.format(squareMiles[i]) + "\t" + population[i] + "\t\t" + formatter.format(LanternFlyPerSquareMile[i]) + "\t\t" + formatter.format(damageCoefficient[i]) + "\t\t" + threatIndicator[i]);
			}
			else if (i == 7)
			{
				System.out.println(parkName[i] + " " + formatter.format(squareMiles[i]) + "\t" + population[i] + "\t\t" + formatter.format(LanternFlyPerSquareMile[i]) + "\t\t" + formatter.format(damageCoefficient[i]) + "\t\t" + threatIndicator[i]);
			}
			else
			{
				System.out.println(parkName[i] + "\t" + formatter.format(squareMiles[i]) + "\t" + population[i] + "\t\t" + formatter.format(LanternFlyPerSquareMile[i]) + "\t\t" + formatter.format(damageCoefficient[i]) + "\t\t" + threatIndicator[i]);
			}
		}
	}

	public static void printFile(PrintWriter writer, DecimalFormat formatter, String[] parkName, double[] squareMiles, int[] population, double[] LanternFlyPerSquareMile, double[] damageCoefficient, String[] threatIndicator)
	{
		writer.println("\n\t\t\t\t\tLantern Fly Threat Report\n");
		writer.println("Park\t\t\tSquare\tLantern Fly\tLantern Fly per\tDamage\t\tThreat");
		writer.println("Name\t\t\tMiles\tPopulation\tSquare Mile\tCoefficient\tStatus");
		writer.println("=====================\t=======\t==========\t==============\t==========\t========");
		for (int i = 0; i < 14; i++)
		{
			if (i == 1 || i == 2 || i == 3)
			{
				writer.println(parkName[i] + "\t\t" + formatter.format(squareMiles[i]) + "\t" + population[i] + "\t\t" + formatter.format(LanternFlyPerSquareMile[i]) + "\t\t" + formatter.format(damageCoefficient[i]) + "\t\t" + threatIndicator[i]);
			}
			else if (i == 7)
			{
				writer.println(parkName[i] + " " + formatter.format(squareMiles[i]) + "\t" + population[i] + "\t\t" + formatter.format(LanternFlyPerSquareMile[i]) + "\t\t" + formatter.format(damageCoefficient[i]) + "\t\t" + threatIndicator[i]);
			}
			else
			{
				writer.println(parkName[i] + "\t" + formatter.format(squareMiles[i]) + "\t" + population[i] + "\t\t" + formatter.format(LanternFlyPerSquareMile[i]) + "\t\t" + formatter.format(damageCoefficient[i]) + "\t\t" + threatIndicator[i]);
			}
		}
	}

	public static void lookupName(PrintWriter writer, DecimalFormat formatter, String[] parkName, double[] squareMiles, int[] population, double[] LanternFlyPerSquareMile, double[] damageCoefficient, String[] threatIndicator, int output, String name)
	{
		int j = 0;
		for (int i = 0; i < 14; i++)
		{
			if (parkName[i] == name)
			{
				j = i;
				break;
			}
		}
		if (output == 1)
		{
			System.out.println(parkName[j] + "\t" + formatter.format(squareMiles[j]) + "\t" + population[j] + "\t\t" + formatter.format(LanternFlyPerSquareMile[j]) + "\t\t" + formatter.format(damageCoefficient[j]) + "\t\t" + threatIndicator[j]);
		}
		else if (output == 2)
		{
			writer.println(parkName[j] + "\t" + formatter.format(squareMiles[j]) + "\t" + population[j] + "\t\t" + formatter.format(LanternFlyPerSquareMile[j]) + "\t\t" + formatter.format(damageCoefficient[j]) + "\t\t" + threatIndicator[j]);
		}
		else if (output == 3)
		{
			System.out.println(parkName[j] + "\t" + formatter.format(squareMiles[j]) + "\t" + population[j] + "\t\t" + formatter.format(LanternFlyPerSquareMile[j]) + "\t\t" + formatter.format(damageCoefficient[j]) + "\t\t" + threatIndicator[j]);
			writer.println(parkName[j] + "\t" + formatter.format(squareMiles[j]) + "\t" + population[j] + "\t\t" + formatter.format(LanternFlyPerSquareMile[j]) + "\t\t" + formatter.format(damageCoefficient[j]) + "\t\t" + threatIndicator[j]);
		}
	}

	public static void main(String[] args) throws IOException
	{
		final String FILE_NAME = "laternflypop.txt";
		File fn = new File(FILE_NAME);
		Scanner input = new Scanner(fn);
		Scanner keyboard = new Scanner(System.in);
		PrintWriter writer = new PrintWriter("ThreatReport.txt", "UTF-8");
		DecimalFormat formatter = new DecimalFormat("#0.00");

		// Input Data
		String[] parkName = new String[14];
		double[] squareMiles = new double[14];
		int[] population = new int[14];

		// Calculations
		double[] LanternFlyPerSquareMile = new double[14];
		double[] damageCoefficient = new double[14];
		String[] threatIndicator = new String[14];

		String name = " ";

		inputData(input, parkName, squareMiles, population);
		calculations(squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator);

		System.out.println("\tMenu\n");
		System.out.println("1.) Report sorted by Park Name");
		System.out.println("2.) Report sorted by Square Miles");
		System.out.println("3.) Look up by Park Name");
		System.out.println("4.) Exit");

		System.out.print("\nEnter selection by number: ");
		int selection = keyboard.nextInt();
		System.out.print("Enter whether output goes to (1)Sreen, (2)File, or (3) Both: ");
		int output = keyboard.nextInt();

		if ((selection == 1 || selection == 2) && output == 1)
		{
			printScreen(formatter, parkName, squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator);
		}
		else if ((selection == 1 || selection == 2) && output == 2)
		{
			printFile(writer, formatter, parkName, squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator);
		}
		else if ((selection == 1 || selection == 2) && output == 3)
		{
			printScreen(formatter, parkName, squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator);
			printFile(writer, formatter, parkName, squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator);
		}
		else if (selection == 3)
		{
			System.out.print("Enter park name: ");
			name = keyboard.nextLine();
			if (output == 1)
			{
				lookupName(writer, formatter, parkName, squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator, output, name);
			}
			else if (output == 2)
			{
				lookupName(writer, formatter, parkName, squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator, output, name);
			}
			else if (output == 3)
			{
				lookupName(writer, formatter, parkName, squareMiles, population, LanternFlyPerSquareMile, damageCoefficient, threatIndicator, output, name);
			}
		}

		writer.close();
	}
}
