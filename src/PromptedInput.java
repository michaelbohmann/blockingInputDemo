import java.util.Scanner;

public class PromptedInput
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double totalCost = 0;
        String trash = "";
        String confirmYN = "";
        boolean doneItem = false;

        do
        {

            System.out.print("Enter your item Price: ");
            if (in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                in.nextLine(); // clear the buffer
                if (itemPrice > 0) {
                    totalCost += itemPrice;
                }
                System.out.print("\nDo you have another item [Y/N: ");
                confirmYN = in.nextLine();
                if (confirmYN.equalsIgnoreCase("N"))
                {
                    doneItem = true;
                }
            }
            else
                {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " try again!");
                }

        }while(!doneItem);

            System.out.println("The total of your items is " + totalCost);

    }
}

