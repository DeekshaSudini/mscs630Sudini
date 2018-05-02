
/*
 * file: ModDet.java
 * author: Deeksha Sudini
 * course: MSCS630
 * assignment: Lab 3
 * due date: Wednesday, February 27, 2018
 * version: 9.0.4
 *
 * This file contains the declaration of the
 * ModDet class.
 */

/*This is a sample program to calculate the determinant of the given matrix
The complexity of the code is O(n^3)*/
import java.util.*;
import java.util.Scanner;
import java.io.*;
/*This class performs the determinant of a matrix and performes modulo function on the determinant*/
public class ModDet{
  /*This method accepts two parameters m as modulo and an array A[][] that returns an integer 
  which is the modulus of determinant of matrix A[][] and m */
  public int determinant(int m, int A[][]){
    int N = A.length;
    int det=0;
    if(N == 1){
      det = A[0][0];
    }
    else if (N == 2){
      det = A[0][0]*A[1][1] - A[1][0]*A[0][1];
    }
    /*To calculate determinant if the square matrix size is greater than 2*/
    else{
      det=0;
      for(int j1=0;j1<N;j1++){
        int[][] temp = new int[N-1][];
        for(int k=0;k<(N-1);k++){
          temp[k] = new int[N-1];
        }
        for(int i=1;i<N;i++){
          int j2=0;
          for(int j=0;j<N;j++){
            if(j == j1)
            continue;
            temp[i-1][j2] = A[i][j];
            j2++;
          }
        }
        int x = m;
        det += Math.pow(-1.0,1.0+j1+1.0)* A[0][j1]* determinant(x,temp);           
      }
    }
    /*This returns the mod value of determinant and m*/
    return (((det % m) + m) % m);
  }
  /*This main class accepts valid mod value, size of the matrix and 
  elements of the matrix as an input and activates determinant function*/
  public static void main(String args[]) throws FileNotFoundException{
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()){
      System.out.println("Enter the mod value");
      int x = sc.nextInt();
      System.out.println("Enter the order of the square matrix");
      int n = sc.nextInt();
      System.out.println("Enter the elements of the square matrix");
      int[][] mat = new int[n][n];
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          mat[i][j] = sc.nextInt();
        }
      }
      ModDet I = new ModDet();
      int result = I.determinant(x,mat);
      System.out.println("The modulo determinant of the Matrix is : " + result);
    }
  }
}
