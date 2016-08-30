/**
 * Created by jc321687 on 30/08/16.
 */
public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}