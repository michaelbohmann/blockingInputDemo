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
                elseif(grade >=0 && grade <= 100)
                {
                    totalGrades += grade
                }
                System.out.println("You said your age is " + age);
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash);
            }
        }while(!doneGrade);
    }
}
