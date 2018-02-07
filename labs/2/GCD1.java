 import java.util.*;
import java.io.*;

class GCD1
{
  public static void main(String[] args) throws FileNotFoundException
{
  System.out.println("Please enter two number to perform GCD: ");
  Scanner sc = new Scanner(new File("input.txt"));
  while (sc.hasNext())
    {
      long m = sc.nextLong();
      long n = sc.nextLong();
      long result = euclidAlg(m,n);
        System.out.print(result);
      System.out.println();
    }
}
  public static long euclidAlg(long a, long b)
{
    if (b>a)
    {
        long temp = b;
        b = a;
        a = temp;
    }

    while (b != 0)
        {
            long temp2 = b;
            b = a % b;
            a = temp2;
        }
        return a;

}
}
