import java.util.Scanner;

public class SentinalInput
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double grade = 0; // 0-100 -1 to quit
        double average = 0;
        double totalGrades = 0;
        int numGrades = 0;
        String trash = "";
        boolean doneGrade = false;

        do
        {

            System.out.print("Enter your grade: ");
            if (in.hasNextDouble()) {
                grade = in.nextDouble();
                in.nextLine(); // clear the buffer
                if (grade == -1)
                {
                    doneGrade = true;
                }
                else if(grade >=0 && grade <= 100)
                {
                    totalGrades += grade;
                    numGrades++;
                }
                else
                {
                    System.out.println("Must be [0-100] not: " + grade);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash);
            }
        }while(!doneGrade);

        if(numGrades >0)
        {
            //calculate the average
            average = totalGrades / numGrades;
            System.out.println("The average grade of " + numGrades + "  grades is " + average);
        }
        else
        {
            System.out.println("Must enter a grade");
        }

    }
}
