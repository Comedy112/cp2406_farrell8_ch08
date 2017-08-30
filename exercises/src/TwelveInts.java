
public class TwelveInts
{
    public static void main (String args[])
    {
        int[] twelve = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int i;
        for (i = 0; i < twelve.length; i++)
            System.out.print(twelve[i] + "  ");
        System.out.println();
        for (i = twelve.length - 1; i >= 0; i--)
            System.out.print("" + twelve[i] + "  ");
        System.out.println();
    }
}
