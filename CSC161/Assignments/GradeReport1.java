/*
    Ryan Arokia-Raj
    20230410
    GradeReport1.java
*/
import java.util.Scanner;
import java.io.*;
public class GradeReport1
{
    public static void inputStudentData(Scanner input, String[] studentName, int[] studentID, int[] testOne, int[] testTwo, int[] testThree)
    {
        for (int i = 0; i < 5; i++)
        {
            studentName[i] = input.nextLine();
            if (studentName[i].equals(""))
            {
                studentName[i] = input.nextLine();
            }
            studentID[i] = input.nextInt();
            testOne[i] = input.nextInt();
            testTwo[i] = input.nextInt();
            testThree[i] = input.nextInt();
        }
    }

    public static void getAverage(double[] average, int[] testOne, int[] testTwo, int[] testThree)
    {
        double avg;
        for (int i = 0; i < 5; i++)
        {
            avg = (testOne[i] + testTwo[i] + testThree[i]) / 3.0;
            average[i] = avg;
        }
    }

    public static void getGrade(char[] grade, double[] average)
    {
        for (int i = 0; i < 5; i++)
        {
            if (average[i] >= 89.5)
            {
                grade[i] = 'A';
            }
            else if (average[i] >= 79.5 && average[i] < 89.5)
            {
                grade[i] = 'B';
            }
            else if (average[i] >= 69.5 && average[i] < 79.5)
            {
                grade[i] = 'C';
            }
            else if (average[i] >= 59.5 && average[i] < 69.5)
            {
                grade[i] = 'D';
            }
            else if (average[i] < 59.5)
            {
                grade[i] = 'F';
            }
        }
    }

    public static void getStatus(String[] status, char[] grade)
    {
        for (int i = 0; i < 5; i++)
        {
            if (grade[i] == 'A')
            {
                status[i] = "Excellent";
            }
            else if (grade[i] == 'B')
            {
                status[i] = "Good";
            }
            else if (grade[i] == 'C')
            {
                status[i] = "Satisfactory";
            }
            else if (grade[i] == 'D')
            {
                status[i] = "Poor";
            }
            else if (grade[i] == 'F')
            {
                status[i] = "Fail";
            }
        }
    }

    public static void classAverage(int output, PrintWriter writer, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status, int testOneAvg, int testTwoAvg, int testThreeAvg, double classAvg, char classGrade, String classStatus)
    {
        for (int i = 0; i < 5; i++)
        {
            testOneAvg += testOne[i];
            testTwoAvg += testTwo[i];
            testThreeAvg += testThree[i];
        }
        testOneAvg /= 5;
        testTwoAvg /= 5;
        testThreeAvg /= 5;

        classAvg = (testOneAvg + testTwoAvg + testThreeAvg) / 3.0;

        if (classAvg >= 89.5)
        {
            classGrade = 'A';
        }
        else if (classAvg >= 79.5 && classAvg < 89.5)
        {
            classGrade = 'B';
        }
        else if (classAvg >= 69.5 && classAvg < 79.5)
        {
            classGrade = 'C';
        }
        else if (classAvg >= 59.5 && classAvg < 69.5)
        {
            classGrade = 'D';
        }
        else if (classAvg < 59.5)
        {
            classGrade = 'F';
        }

        if (classGrade == 'A')
        {
            classStatus = "Excellent";
        }
        else if (classGrade == 'B')
        {
            classStatus = "Good";
        }
        else if (classGrade == 'C')
        {
            classStatus = "Satisfactory";
        }
        else if (classGrade == 'D')
        {
            classStatus = "Poor";
        }
        else if (classGrade == 'F')
        {
            classStatus = "Fail";
        }

        if (output == 1)
        {
            System.out.println("\nClass Average\t\t" + testOneAvg + "\t" + testTwoAvg + "\t" + testThreeAvg + "\t" + classAvg + "\t" + classGrade + "\t" + classStatus);
        }
        else if (output == 2)
        {
            writer.println("\nClass Average\t\t" + testOneAvg + "\t" + testTwoAvg + "\t" + testThreeAvg + "\t" + classAvg + "\t" + classGrade + "\t" + classStatus);
        }
        else if (output == 3)
        {
            System.out.println("\nClass Average\t\t" + testOneAvg + "\t" + testTwoAvg + "\t" + testThreeAvg + "\t" + classAvg + "\t" + classGrade + "\t" + classStatus);
            writer.println("\nClass Average\t\t" + testOneAvg + "\t" + testTwoAvg + "\t" + testThreeAvg + "\t" + classAvg + "\t" + classGrade + "\t" + classStatus);
        }
    }

    public static void consoleHeader()
    {
        System.out.println("\t\tClass Report");
        System.out.println("\nStudent\tStudent\tTest\tTest\tTest");
        System.out.println("Number\tName\tOne\tTwo\tThree\tAverage\tGrade\tStatus");
        System.out.println("=====================================================");
    }

    public static void fileHeader(PrintWriter writer)
    {
        writer.println("\t\tClass Report");
        writer.println("\nStudent\tStudent\tTest\tTest\tTest");
        writer.println("Number\tName\tOne\tTwo\tThree\tAverage\tGrade\tStatus");
        writer.println("=====================================================");
    }

    public static void printConsole(String[] studentName, int[] studentID, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(studentID[i] + "\t" + studentName[i] + "\t" + testOne[i] + "\t" + testTwo[i] + "\t" + testThree[i] + "\t" + average[i] + "\t" + grade[i] + "\t" + status[i]);
        }
    }

    public static void printFile(PrintWriter writer, String[] studentName, int[] studentID, int[] testOne, int[] testTwo, int[] testThree, double[] average, char[] grade, String[] status)
    {
        for (int i = 0; i < 5; i++)
        {
            writer.println(studentID[i] + "\t" + studentName[i] + "\t" + testOne[i] + "\t" + testTwo[i] + "\t" + testThree[i] + "\t" + average[i] + "\t" + grade[i] + "\t" + status[i]);
        }
    }

    public static void main(String[] args) throws IOException
    {
        final String FILE_NAME = "GradeReport.txt";
        File fn = new File(FILE_NAME);
        Scanner input = new Scanner(fn);

        String[] studentName = new String[5];
        int[] studentID = new int[5];
        int[] testOne = new int[5];
        int[] testTwo = new int[5];
        int[] testThree = new int[5];

        double[] average = new double[5];
        char[] grade = new char[5];
        String[] status = new String[5];

        int testOneAvg = 0;
        int testTwoAvg = 0;
        int testThreeAvg = 0;
        double classAvg = 0;
        char classGrade = ' ';
        String classStatus = "";

        Scanner keyboard = new Scanner(System.in);
        int output;
        PrintWriter writer = new PrintWriter("GradeReport1.txt", "UTF-8");

        inputStudentData(input, studentName, studentID, testOne, testTwo, testThree);
        getAverage(average, testOne, testTwo, testThree);
        getGrade(grade, average);
        getStatus(status, grade);

        System.out.print("Enter where you want report to be produced(1 is Console, 2 is File, 3 is Both): ");
        output = keyboard.nextInt();

        if (output == 1)
        {
            consoleHeader();
            printConsole(studentName, studentID, testOne, testTwo, testThree, average, grade, status);
        }
        else if (output == 2)
        {
            fileHeader(writer);
            printFile(writer, studentName, studentID, testOne, testTwo, testThree, average, grade, status);
        }
        else if (output == 3)
        {
            consoleHeader();
            printConsole(studentName, studentID, testOne, testTwo, testThree, average, grade, status);
            fileHeader(writer);
            printFile(writer, studentName, studentID, testOne, testTwo, testThree, average, grade, status);
        }
        classAverage(output, writer, testOne, testTwo, testThree, average, grade, status, testOneAvg, testTwoAvg, testThreeAvg, classAvg, classGrade, classStatus);

        writer.close();
    }
}
