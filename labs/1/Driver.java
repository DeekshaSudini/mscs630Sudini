/**
   * file: Driver.java
   * author: Deeksha Sudini
   * course: mscs630
   * assignment: lab 1
   * due date: January 24, 2018
   * version: 9.0.4
   * 
   * This file converts the plain text to cipher text .
   */
import java.util.*;
import java.io.*;
/*The Driver class takes the plain text as input string 
 *and maps it to int. */
class Driver{
  public static void main(String[] args) throws FileNotFoundException
  {
    System.out.println("Please Enter the String: ");
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()){
      String inputText = sc.nextLine();
      inputText = inputText.toUpperCase();
      int[] nums =str2int(inputText);
      for(int j=0; j<nums.length;j++)
        System.out.print(nums[j]+" ");
      System.out.println();
    }
  }
  /*The function str2int uses the plaintext which is inputed 
   *and converts it into integer by ascii representation 
   *and the spaces are filled with 26 */
  public static int[] str2int(String plainText){
    int[] temp = new int[plainText.length()] ;
    for (int i=0;i<plainText.length();i++){
      char c = plainText.charAt(i);
      if(c == 32)
      temp[i]=26;
      else
      temp[i]= ((int) c) - 65;
    }
    return temp;
  }
}


