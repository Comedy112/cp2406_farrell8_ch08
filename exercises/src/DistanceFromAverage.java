import java.util.*;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double entry;
        double total = 0;
        double average = 0;
        final int STOP = 99999;
        int x = 0, y;
        System.out.print("Enter a numeric value or " +
                STOP + " to quit >> ");
        entry = input.nextDouble();
        while(entry != STOP && x < numbers.length)
        {
            numbers[x] = entry;
            total += numbers[x];
            ++x;
            if(x < numbers.length)
            {
                System.out.print("Enter next number or enter " +
                        STOP + " to quit" + "\nEnter numbers here: ");
                entry = input.nextDouble();
            }
        }
        if(x == 0)
            System.out.println("ERROR: No numbers were entered. Please try again");

        else
        {
            average = total / x;
            System.out.println("You entered " + x +
                    " numbers and their average is " + average);
            for(y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " +
                        (numbers[y] - average) + " away from the average");
        }
    }
}