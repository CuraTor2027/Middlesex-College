/*
	Ryan Arokia-Raj
	20230320
	CSC161
	Generating random numbers in methods
*/
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
public class RandomNumbers
{
	/*
		Method: randomInt()
		Parameters: int intRangeUpper, int intRangeLower
		Return Value: int
		Purpose: return random int from inputted range
	*/
	public static int randomInt(int intRangeUpper, int intRangeLower)
	{
		Random rand = new Random();
		int randomInteger;
		do {
			randomInteger = rand.nextInt(intRangeUpper) + intRangeLower;
		} while (randomInteger > intRangeUpper || randomInteger < intRangeLower);
		return randomInteger;
	}

	/*
		Method: randomDouble()
		Parameters: double doubleRangeUpper, double doubleRangeLower
		Return Value: double
		Purpose: return random double from inputted range
	*/
	public static double randomDouble(double doubleRangeUpper, double doubleRangeLower)
	{
		Random rand = new Random();
		double randomDouble;
		do {
			randomDouble = rand.nextDouble(doubleRangeUpper) + doubleRangeLower;
		} while (randomDouble > doubleRangeUpper || randomDouble < doubleRangeLower);
		return randomDouble;
	}

	/*
		Method: arrayInt()
		Parameters: int intRangeUpper, double intRangeLower
		Return Value: void
		Purpose: print array of 20 random integers from inputted range
	*/
	public static void arrayInt(int intRangeUpper, double intRangeLower)
	{
		Random rand = new Random();
		int randomInteger;
		final int SIZE = 25;
		int[] arrayInteger = new int[SIZE];
		for (int i = 0; i < SIZE; i++)
		{
			do {
				randomInteger = rand.nextInt(intRangeUpper);
				randomInteger += intRangeLower;
			} while (randomInteger > intRangeUpper || randomInteger < intRangeLower);
			arrayInteger[i] = randomInteger;
		}
		for (int i = 0; i < SIZE; i++)
		{
			System.out.println("Index: " + i + "\tValue: " + arrayInteger[i]);
		}
	}

	/*
		Method: arrayDouble()
		Parameters: double doubleRangeUpper, double doubleRangeLower
		Return Value: void
		Purpose: print array of 20 random doubles from inputted range
	*/
	public static void arrayDouble(double doubleRangeUpper, double doubleRangeLower)
	{
		Random rand = new Random();
		DecimalFormat formatter = new DecimalFormat("#0.00");
		double randomDouble;
		final int SIZE = 25;
		double[] arrayDouble = new double[SIZE];
		for (int i = 0; i < SIZE; i++)
		{
			do {
				randomDouble = rand.nextDouble(doubleRangeUpper);
				randomDouble += doubleRangeLower;
			} while (randomDouble > doubleRangeUpper || randomDouble < doubleRangeLower);
			arrayDouble[i] = randomDouble;
		}
		for (int i = 0; i < SIZE; i++)
		{
			System.out.println("Index: " + i + "\tValue: " + formatter.format(arrayDouble[i]));
		}
	}

	/*
		Method: printArray()
		Parameters: int intRangeUpper, double intRangeLower, double doubleRangeUpper, double doubleRangeLower
		Return Value: void
		Purpose: call arrays of 20 random integers and doubles from inputted range
	*/
	public static void printArray(int intRangeUpper, double intRangeLower, double doubleRangeUpper, double doubleRangeLower)
	{
		arrayInt(intRangeUpper, intRangeLower);
		arrayDouble(doubleRangeUpper, doubleRangeLower);
	}

	/*
		Method: userArray()
		Parameters: Scanner input, int[] arrInt
		Return Value: void
		Purpose: fill array from input
	*/
	public static void userArray(Scanner input, int[] arrInt)
	{
		for (int i = 0; i < arrInt.length; i++)
		{
			System.out.print("Enter a value for index " + i + ": ");
			arrInt[i] = input.nextInt();
		}
	}

	/*
		Method: printUserArray()
		Parameters: int[] arrInt
		Return Value: void
		Purpose: print user array
	*/
	public static void printUserArray(int[] arrInt)
	{
		for (int i = 0; i < arrInt.length; i++)
		{
			System.out.print("Index: " + i + "\tValue: " + arrInt[i] + "\n");
		}
	}
	/*
		Method: userArraySorter()
		Parameters: int[] arrInt
		Return Value: void
		Purpose: sort user array
	*/
	public static void userArraySorter(int[] arrInt)
	{
		int temp;
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

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int intRangeUpper;
		int intRangeLower;
		double doubleRangeUpper;
		double doubleRangeLower;
		int randInt;
		double randDouble;
		int[] arrInt = new int[5];

/*		System.out.print("Enter an upper range for your random integer: ");
		intRangeUpper = input.nextInt();
		System.out.print("Enter a lower range for your random integer: ");
		intRangeLower = input.nextInt();

		System.out.print("Enter an upper range for your random double: ");
		doubleRangeUpper = input.nextDouble();
		System.out.print("Enter a lower range for your random double: ");
		doubleRangeLower = input.nextDouble();

		randInt = randomInt(intRangeUpper, intRangeLower);
		randDouble = randomDouble(doubleRangeUpper, doubleRangeLower);

		printArray(intRangeUpper, intRangeLower, doubleRangeUpper, doubleRangeLower);

		System.out.println(randInt);
		System.out.println(randDouble);*/

		userArray(input, arrInt);
		printUserArray(arrInt);
		userArraySorter(arrInt);
		printUserArray(arrInt);
	}
}
