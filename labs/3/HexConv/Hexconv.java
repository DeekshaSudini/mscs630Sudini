import java.util.*;
import java.util.Scanner;
import java.io.*;
/*This class outputs hexadecimal value of the given input string by dividing the string into 16 characters*/
public class Hexconv {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input.txt"));
    // It takes the substitution character
    char substution_char = sc.nextLine().charAt(0);
    // It takes the Actual String
    String actual_string = sc.nextLine();
    int len = actual_string.length();
    double num = (double) len / 16;
    //To find the number of matrices(4x4) to convert the string
    int num_of_martices = (int) Math.ceil(num);
    //To calculate the number total spaces in the 4x4 matrix
    int total_spaces = 16 * num_of_martices;
    //To find the number of spaces to fill in the substitution character
    int sub_num_values = total_spaces-len;
    String temp_string = actual_string;
    //Padding the substitution character to the existing string to create a new complete string
    while(sub_num_values!=0){
      for (int i=0; i<sub_num_values; i++){
        temp_string += substution_char;
      }
      break;
    }
    int count = 0;
    while(count<temp_string.length()){
      //Creating a sub string of 16 characters
      String current_string = temp_string.substring(count, count + 16);
      //Invoking getHexMatP to convert the charaters into its ASCII values.
      int[][] temp = getHexMatP(substution_char, current_string);
      for (int i = 0;
        i < 4; i++) {
        //Printing the Hexadecimal values of converted string in the 4x4 matrix foramt
        System.out.println(Integer.toHexString((temp[0][i])).toUpperCase() + " " + Integer.toHexString((temp[1][i])).toUpperCase() + " " + Integer.toHexString((temp[2][i])).toUpperCase() + " " + Integer.toHexString((temp[3][i])).toUpperCase());
      }
      System.out.println();
      count+=16;
    }
  }
/* This method take parameters as substitution charater
    and the String of length 16. It returns an integer array
    with converted ASCII values of charaters in the String.
*/
  public static int[][] getHexMatP(char s, String p) {
    int position = 0;
    int[][] x = new int[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        x[i][j] = (int) p.charAt(position);
        position++;
      }
    }
    return x;
  }
}
