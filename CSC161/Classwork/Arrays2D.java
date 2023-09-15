/*
	Ryan Arokia-Raj
	20230412
	Arrays2D.java
*/
import java.util.Random;
import java.text.DecimalFormat;
public class Arrays2D
{
	/*
		Method: fillData()
		Parameters: final int DAYS, final int WEEKS, double[][] rainfall, Random rand
		Return Value: void
		Purpose: fill data for rainfall[52][7] randomly
	*/
	public static void fillData(final int DAYS, final int WEEKS, double[][] rainfall, Random rand)
	{
		for (int row = 0; row < WEEKS; row++)
		{
			for (int column = 0; column < DAYS; column++)
			{
				rainfall[row][column] = rand.nextDouble(4);
			}
		}
	}

	/*
		Method: rowTotalF()
		Parameters: final int DAYS, final int WEEKS, double[][] rainfall, double[] rowTotal
		Return Value: void
		Purpose: find row totals
	*/
	public static void rowTotalF(final int DAYS, final int WEEKS, double[][] rainfall, double[] rowTotal)
	{
		double rowSum = 0;
		for (int row = 0; row < WEEKS; row++)
		{
			for (int column = 0; column < DAYS; column++)
			{
				rowSum += rainfall[row][column];
			}
			rowTotal[row] = rowSum;
			rowSum = 0;
		}
	}

	/*
		Method: columnTotalF()
		Parameters: final int DAYS, final int WEEKS, double[][] rainfall, double[] columnTotal
		Return Value: void
		Purpose: find column totals
	*/
	public static void columnTotalF(final int DAYS, final int WEEKS, double[][] rainfall, double[] columnTotal)
	{
		double columnSum = 0;
		for (int column = 0; column < DAYS; column++)
		{
			for (int row = 0; row < WEEKS; row++)
			{
				columnSum += rainfall[row][column];
			}
			columnTotal[column] = columnSum;
			columnSum = 0;
		}
	}

	/*
		Method: printData()
		Parameters: final int DAYS, final int WEEKS, double[][] rainfall, DecimalFormat formatter, double[] rowTotal, double[] columnTotal
		Return Value: void
		Purpose: print array for rainfall and row/column totals
	*/
	public static void printData(final int DAYS, final int WEEKS, double[][] rainfall, DecimalFormat formatter, double[] rowTotal, double[] columnTotal)
	{
		System.out.println("\t\tDay\tDay\tDay\tDay\tDay\tDay\tDay");
		System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\tTotal");
		for (int row = 0; row < WEEKS; row++)
		{
			System.out.print("Week " + (row + 1) + "  |  ");
			for (int column = 0; column < DAYS; column++)
			{
				System.out.print(formatter.format(rainfall[row][column]) + "  |  " );
			}
			System.out.println(formatter.format(rowTotal[row]));
		}
		System.out.print("Total\t |  ");
		for (int column = 0; column < DAYS; column++)
		{
			System.out.print(formatter.format(columnTotal[column]) + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Random rand = new Random();
		DecimalFormat formatter = new DecimalFormat("#0.00");

		final int DAYS = 7;
		final int WEEKS = 52;
		double[][] rainfall = new double[52][7];
		double[] rowTotal = new double[52];
		double[] columnTotal = new double[7];

		fillData(DAYS, WEEKS, rainfall, rand);
		rowTotalF(DAYS, WEEKS, rainfall, rowTotal);
		columnTotalF(DAYS, WEEKS, rainfall, columnTotal);
		printData(DAYS, WEEKS, rainfall, formatter, rowTotal, columnTotal);
	}
}
