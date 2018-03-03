 /**
   * file: Extgcd.java
   * author: Deeksha Sudini
   * course: mscs630
   * assignment: lab 2
   * due date: Feb 7, 2018
   * version: 9.0.4
   * 
   * This file contains the implementation of Extended Euclid Algorithm  
   */
import java.util.*;
import java.io.*;
/*This class implements the Extended Euclidean Algorithm 
 */
public class Extgcd{
 /*The function euclidAlgExt computes greatest common divisor 
 *of integers a and b and also computes the coeffients x and y.
 */
  public static long[] euclidAlgExt(long a, long b){
    if (b>a){
      long temp = b;
      b = a;
      a = temp;
    }
    long x1 = 0, x2 = 1, y1 = 1, y2 = 0, temp, temp_1;
    long[] var = new long[3];
    while (b != 0){
      temp_1 = b;
      long div = a / b;
      long rem = a % b;
      a = b;
      b = rem;
      temp = x1;
      x1 = x2 - div * x1;
      x2 = temp;
      temp = y1;
      y1 = y2 - div * y1;
      y2 = temp;
    } 
    var[0]=a;
    var[1]=x2;
    var[2]=y2;
    return var;
  }
  public static void main (String[] args) throws FileNotFoundException{
    System.out.println();
    System.out.println("Please Enter two numbers to perform GCD   and show x and y where, gcd(a,b) = ax + by : ");
    Scanner sc = new Scanner(new File("input.txt"));
    while (sc.hasNext()){
      long m = sc.nextLong();
      long n = sc.nextLong();
      long result[] = euclidAlgExt(m,n);
      for(int i=0; i<3; i++)
      System.out.print(result[i] + " ");
      System.out.println();
    }
    System.out.println();
  }
}
