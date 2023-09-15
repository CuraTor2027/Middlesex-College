/*
	Ryan Arokia-Raj
	20230322
	CSC161
	Practice Quiz 2
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
public class PracticeQuiz2_1
{
	/*
		Method: inputPounds()
		Parameters: Scanner input, double[] pounds, String[] fruits
		Return Value: void
		Purpose: input pounds in array
	*/
	public static void inputPounds(Scanner input, double[] pounds, String[] fruits)
	{
		for (int i = 0; i < pounds.length; i++)
		{
			System.out.print("Enter the range of the pounds in stock for " + fruits[i] + ": ");
			pounds[i] = input.nextDouble();
		}
	}

	/*
		Method: calculateKilos
		Parameters: double[] pounds, double[] kilos
		Return Value: void
		Purpose: calculate kilograms in array from array of pounds
	*/
	public static void calculateKilos(double[] pounds, double[] kilos)
	{
		for (int i = 0; i < pounds.length; i++)
		{
			kilos[i] = pounds[i] * 0.453;
		}
	}

	/*
		Method: printFile
		Parameters: String[] fruits, int[] fruitCode, double[] pounds, double[] kilos, DecimalFormat formatter, PrintWriter writer
		Return Value: void
		Purpose: print report to text file
	*/
	public static void printFile(String[] fruits, int[] fruitCode, double[] pounds, double[] kilos, DecimalFormat formatter, PrintWriter writer)
	{
		double poundsTotal = 0;
		double kilosTotal = 0;
		writer.println(" Fruit");
		writer.println(" Code\tName\t\tPounds\tKilos");
		for (int i = 0; i < pounds.length; i++)
		{
			writer.printf("| %-4s | %-10s | %8s | %8s | %n", fruitCode[i], fruits[i], formatter.format(pounds[i]), formatter.format(kilos[i]));
			poundsTotal += pounds[i];
			kilosTotal += kilos[i];
		}
		writer.printf("Total %24s | %8s |", formatter.format(poundsTotal), formatter.format(kilosTotal));
		writer.close();
	}

	public static void userArraySorter(int[] arrInt, String[] fruits)
	{
		int temp;
		String tempStr;
		for (int index1 = 0; index1 < arrInt.length - 1; index1++)
		{
			for (int index2 = index1 + 1; index2 < arrInt.length; index2++)
			{
				if (arrInt[index1] > arrInt[index2])
				{
					temp = arrInt[index1];
					arrInt[index1] = arrInt[index2];
					arrInt[index2] = temp;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		PrintWriter writer = new PrintWriter("PracticeQuiz2.txt", "UTF-8");

		String fruits[] = {"Apples", "Oranges", "Grapes", "Blueberry", "Cherry", "Bananas", "Mango", "Lemon", "Peaches", "Strawberry"};
		int fruitCode[] = {1010, 1020, 1030, 1040, 1050, 1060, 1070, 1080, 1090, 1100};
		int num = fruits.length;
		double[] pounds = new double[num];
		double[] kilos = new double[num];

/*		inputPounds(input, pounds, fruits);
		calculateKilos(pounds, kilos);
		printFile(fruits, fruitCode, pounds, kilos, formatter, writer);*/
		userArraySorter(fruitCode, fruits);
	}
}
