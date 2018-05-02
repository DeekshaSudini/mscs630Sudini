/**
   * file: GCD1.java
   * author: Deeksha Sudini
   * course: mscs630
   * assignment: lab 2
   * due date: Feb 7, 2018
   * version: 9.0.4
   * 
   * This file contains the implementation of Euclid Algorithm  
   */
import java.util.*;
import java.io.*;
/*The class GCD1 implements the functionality of Euclidean Algorithm 
*/
class GCD1{
  public static void main(String[] args) throws FileNotFoundException{
    System.out.println("Please enter two number to perform GCD: ");
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()){
      long m = sc.nextLong();
      long n = sc.nextLong();
      long result = euclidAlg(m,n);
      System.out.print(result);
      System.out.println();
    }
  }
  /*The function euclidAlg takes two integers a and b and perform gcd of the inputed numbers
  */
  public static long euclidAlg(long a, long b){
    if (b>a){
      long temp = b;
      b = a;
      a = temp;
    }
    while (b != 0){
      long temp2 = b;
      b = a % b;
      a = temp2;
    }
    return a;
  }
}
