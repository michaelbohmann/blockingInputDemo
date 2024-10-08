import java.util.Random;

public class WhileDemo
{
    public static void main(String[] args)
    {
        Random gen = new Random();

        int die1 = -1;
        int die2 = 0;

        while(die1 != die2)
        {

            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;

            dieRoll = die1 + die2;

            System.out.printf("%3d,");
        }
    }

}


