import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scaner in = new Scanner(System.in);
        int age = 0;
        double salary = 0;
        String trash = "";

        System.out.println("Enter your age: ");
        age = int.nextInt();
        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); // clear the buffer
            System.out.println("You said your age is " + age);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
        }

    }
}