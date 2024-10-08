public class FormattedInput {
    public static void main(String[] args)
    {
        int age = 15;
        double salary = 45000.23;

        for(int c = 0; c <= 10; c++)
            System.out.printf("%10s %10.2f %5d\n", "Tom", salary, age);
    }
}
