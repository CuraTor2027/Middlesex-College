/*
	Ryan Arokia-Raj
	20230308
	introduction to arrays
*/
import java.util.Scanner;
import java.util.Random;
public class ArrayDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int[] numbers = new int[10];

		System.out.print("Enter value: ");
		numbers[0] = input.nextInt();

		System.out.println(numbers[0]);

		for(int index = 0; index < numbers.length; index++)
		{
			numbers[index] = rand.nextInt(100);
			System.out.println(index + " " + numbers[index]);
		}
	}
}
