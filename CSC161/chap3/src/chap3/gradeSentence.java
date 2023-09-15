/*
 * Ryan Arokia-Raj
 * 20230225
 * CSC161-03
 */
package chap3;
import java.util.Random;
import java.text.DecimalFormat;
public class gradeSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		double grade1 = rand.nextDouble(101);
		double grade2 = rand.nextDouble(101);
		double grade3 = rand.nextDouble(101);
		char letterGrade = ' ';
		
		double average = (grade1 + grade2 + grade3) / 3;
		if ( average >= 90 && average <= 100 )
		{
			letterGrade = 'A';
		}
		else if ( average >= 80 && average <= 89 )
		{
			letterGrade = 'B';
		}
		else if ( average >= 70 && average <= 79 )
		{
			letterGrade = 'C';
		}
		else if ( average >= 66 && average <= 69 )
		{
			letterGrade = 'D';
		}
		else if ( average < 66 )
		{
			letterGrade = 'F';
		}
		
		System.out.println("Your grades were " + formatter.format(grade1) + ", " + formatter.format(grade2) + " and " + formatter.format(grade3) + ".");
		System.out.print("Your average is " + formatter.format(average) + ". Your grade is " + letterGrade + ".");
		
	}

}
