/*
	Ryan Arokia-Raj
	20230329
	CSC162
	Lab Quiz 2
*/
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.io.*;
public class Quiz2
{
	/*
		Method: generateData()
		Parameters: int[] studentNumber, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status
		Return Value: void
		Purpose: generate all data for students except class average
	*/
	public static void generateData(int[] studentNumber, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status)
	{
		Random rand = new Random();

		for (int i = 0; i < 5; i++)
		{
			studentNumber[i] = rand.nextInt(100000);
			if (studentNumber[i] < 10000)
			{
				studentNumber[i] += 10000;
			}
			testOne[i] = rand.nextInt(100);
			testTwo[i] = rand.nextInt(100);
			testThree[i] = rand.nextInt(100);
		}

		for (int i = 0; i < 5; i++)
		{
			average[i] = (testOne[i] + testTwo[i] + testThree[i]) / 3.0;
			if (average[i] >= 90 && average[i] <= 100)
			{
				grade[i] = 'A';
				status[i] = "Excellent";
			}
			else if (average[i] >= 80 && average[i] <= 89)
			{
				grade[i] = 'B';
				status[i] = "Good";
			}
			else if (average[i] >= 70 && average[i] <= 79)
			{
				grade[i] = 'C';
				status[i] = "Satisfactory";
			}
			else if (average[i] >= 60 && average[i] <= 69)
			{
				grade[i] = 'D';
				status[i] = "Poor";
			}
			else if (average[i] < 60)
			{
				grade[i] = 'F';
				status[i] = "Fails";
			}
		}
	}

	/*
		Method: classAverage()
		Parameters: PrintWriter writer, DecimalFormat formatter, int output, int[] testOne, int[] testTwo, int[] testThree, double[] average
		Return Value: void
		Purpose: generate and print class averages to console, output file or both
	*/
	public static void classAverage(PrintWriter writer, DecimalFormat formatter, int output, int[] testOne, int[] testTwo, int[] testThree, double[] average)
	{
		int classTestOne = 0;
		int classTestTwo = 0;
		int classTestThree = 0;
		double averageOfClass = 0;
		char averageGradeOfClass = ' ';
		String averageStatusOfClass = " ";

		for (int i = 0; i < 5; i++)
		{
			classTestOne += testOne[i];
			classTestTwo += testTwo[i];
			classTestThree += testThree[i];
			averageOfClass += average[i];
		}
		classTestOne /= 5;
		classTestTwo /= 5;
		classTestThree /= 5;
		averageOfClass /= 5.0;

		if (averageOfClass >= 90 && averageOfClass <= 100)
		{
			averageGradeOfClass = 'A';
			averageStatusOfClass = "Excellent";
		}
		else if (averageOfClass >= 80 && averageOfClass <= 89)
		{
			averageGradeOfClass = 'B';
			averageStatusOfClass = "Good";
		}
		else if (averageOfClass >= 70 && averageOfClass <= 79)
		{
			averageGradeOfClass = 'C';
			averageStatusOfClass = "Satisfactory";
		}
		else if (averageOfClass >= 60 && averageOfClass <= 69)
		{
			averageGradeOfClass = 'D';
			averageStatusOfClass = "Poor";
		}
		else if (averageOfClass < 60)
		{
			averageGradeOfClass = 'F';
			averageStatusOfClass = "Fails";
		}

		if (output == 1)
		{
			writer.println("\nClass Average\t" + classTestOne + "\t" + classTestTwo + "\t" + classTestThree + "\t" + formatter.format(averageOfClass) + "\t" + averageGradeOfClass + "\t" + averageStatusOfClass);
		}
		else if (output == 2)
		{
			System.out.println("\nClass Average\t" + classTestOne + "\t" + classTestTwo + "\t" + classTestThree + "\t" + formatter.format(averageOfClass) + "\t" + averageGradeOfClass + "\t" + averageStatusOfClass);
		}
		else if (output == 3)
		{
			writer.println("\nClass Average\t" + classTestOne + "\t" + classTestTwo + "\t" + classTestThree + "\t" + formatter.format(averageOfClass) + "\t" + averageGradeOfClass + "\t" + averageStatusOfClass);
			System.out.println("\nClass Average\t" + classTestOne + "\t" + classTestTwo + "\t" + classTestThree + "\t" + formatter.format(averageOfClass) + "\t" + averageGradeOfClass + "\t" + averageStatusOfClass);
		}
	}

	/*
		Method: printFile()
		Parameters: PrintWriter writer, DecimalFormat formatter, int[] studentNumber, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status
		Return Value: void
		Purpose: print all data for students to output file
	*/
	public static void printFile(PrintWriter writer, DecimalFormat formatter, int[] studentNumber, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status)
	{
		writer.println("\n\t\t\tClass Report");
		writer.println("Student\t\tTest\tTest\tTest");
		writer.println("Number\t\tOne\tTwo\tThree\tAverage\tGrade\tStatus");
		writer.println("===========\t=====\t====\t=====\t======\t=====\t========\n");
		for (int i = 0; i < 5; i++)
		{
			writer.println(studentNumber[i] + "\t\t" + testOne[i] + "\t" + testTwo[i] + "\t" + testThree[i] + "\t" + formatter.format(average[i]) + "\t" + grade[i] + "\t" + status[i]);
		}
	}

	/*
		Method: printScreen
		Parameters: DecimalFormat formatter, int[] studentNumber, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status
		Return Value: void
		Purpose: print all data for students to console
	*/
	public static void printConsole(DecimalFormat formatter, int[] studentNumber, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status)
	{
		System.out.println("\n\t\t\tClass Report");
		System.out.println("Student\t\tTest\tTest\tTest");
		System.out.println("Number\t\tOne\tTwo\tThree\tAverage\tGrade\tStatus");
		System.out.println("===========\t=====\t====\t=====\t======\t=====\t========\n");
		for (int i = 0; i < 5; i++)
		{
			System.out.println(studentNumber[i] + "\t\t" + testOne[i] + "\t" + testTwo[i] + "\t" + testThree[i] + "\t" + formatter.format(average[i]) + "\t" + grade[i] + "\t" + status[i]);
		}
	}

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		PrintWriter writer = new PrintWriter("Quiz2.txt", "UTF-8");

		int output;
		int[] studentNumber = new int[5];
		int[] testOne = new int[5];
		int[] testTwo = new int[5];
		int[] testThree = new int[5];
		double[] average = new double[5];
		char[] grade = new char[5];
		String[] status = new String[5];

		System.out.println("Enter whether output goes to (1) File, (2) Screen or (3) Both.");
		System.out.print("Enter the number that corresponds to your choice: ");
		output = input.nextInt();

		generateData(studentNumber, testOne, testTwo, testThree, average, grade, status);

		if (output == 1)
		{
			printFile(writer, formatter, studentNumber, testOne, testTwo, testThree, average, grade, status);
		}
		else if (output == 2)
		{
			printConsole(formatter, studentNumber, testOne, testTwo, testThree, average, grade, status);
		}
		else if (output == 3)
		{
			printFile(writer, formatter, studentNumber, testOne, testTwo, testThree, average, grade, status);
			printConsole(formatter, studentNumber, testOne, testTwo, testThree, average, grade, status);
		}

		classAverage(writer, formatter, output, testOne, testTwo, testThree, average);
		writer.close();
	}
}
