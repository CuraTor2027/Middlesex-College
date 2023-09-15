/*
	Ryan Arokia-Raj
	20230306
	Learning methods
*/
import java.util.Scanner;
public class LearningMethods
{
	/*
		Method: writeName()
		Parameters: N/A
		Return Value: void
		Purpose: print name to console
	*/
	public static void writeName()
	{
		System.out.println("My name is Ryan Arokia-Raj.");
		return;
	}

	/*
		Method: writeName2()
		Parameters: String firstName, String lastName
		Return Value: void
		Purpose: take in first and last name as parameters, concatenate strings and print to console
	*/
	public static void writeName2(String firstName, String lastName)
	{
		System.out.println("Your name is " + firstName + " " + lastName + ".");
		return;
	}

	/*
		Method: formatName()
		Parameters: String firstName, String lastName
		Return Value: String
		Purpose: take in first and last name as parameters, concatenate strings and return full name
	*/
	public static String formatName(String firstName, String lastName)
	{
		String fullName = firstName + " " + lastName;
		return fullName;
	}

	/*
		Method: upperCaseFormatName()
		Parameters: String firstName, String lastName
		Return Value: String
		Purpose: take in first and last name as parameters, change case to upper, concatenate strings and return full name
	*/
	public static String upperCaseFormatName(String firstName, String lastName)
	{
		String fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
		return fullName;
	}

	/*
		Method: lowerCaseFormatName()
		Parameters: String firstName, String lastName
		Return Value: String
		Purpose: take in first and last name as parameters, change case to lower, concatenate strings and return full name
	*/
	public static String lowerCaseFormatName(String firstName, String lastName)
	{
		String fullName = firstName.toLowerCase() + " " + lastName.toLowerCase();
		return fullName;
	}

	public static String lastNameError(Scanner input)
	{
		String lastName;
		System.out.println("Error: last name cannot be a void");
		do {
			System.out.print("Enter your last name: ");
			lastName = input.nextLine();
		while (lastName == " ");
		return lastName;
	}

	public static String firstNameError(Scanner input)
	{
		String firstName;
		System.out.println("Error: first name cannot be a void");
		do {
			System.out.print("Enter your first name: ");
			firstName = input.nextLine();
		while (input.equals(""));
		return firstName;
	}
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		String firstName;
		String lastName;
		String fullName;
		String fullNameUpper;

		System.out.print("Enter your first name: ");
		firstName = input.nextLine();
		System.out.print("Enter your last name: ");
		lastName = input.nextLine();

		if (firstName == " ")
		{
			firstName = firstNameError(input);
		}
		else if (lastName == " ")
		{
			lastName = lastNameError(input);
		}

		fullName = formatName(firstName, lastName);
		System.out.println("\nYour full name is " + fullName + ".");

		fullNameUpper = upperCaseFormatName(firstName, lastName);
		System.out.println("Your full name is " + fullNameUpper + ".");

	}
}
