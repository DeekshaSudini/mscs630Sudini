import java.util.*;
import java.io.*;

class Driver
{
  public static void main(String[] args) throws            FileNotFoundException
{
  System.out.println("Please Enter the String: ");
  Scanner sc = new Scanner(new File("input.txt"));
  while (sc.hasNext())
    {
      String inputText = sc.nextLine();
      inputText = inputText.toUpperCase();
      int[] nums =str2int(inputText);
      for(int j=0; j<nums.length;j++)
        System.out.print(nums[j]+" ");
      System.out.println();
    }
}
  public static int[] str2int(String plainText)
{
  int[] temp = new int[plainText.length()] ;
  for (int i=0;i<plainText.length();i++)
  {
    char c = plainText.charAt(i);
    if(c == 32)
      temp[i]=26;
    else
      temp[i]= ((int) c) - 65;
  }
  return temp;
}
}


