/*
 * file: DriverAES.java
 * author: Deeksha Sudini
 * course: mscs630
 * assignment: Lab 4
 * due date: Wednesday, April 4, 2018
 * version: 9.0.4
 *
 * This file contains the declaration of the
 * DriverAES class.
 */

/*
 * DriverAES
 *
 * This class tests the implementation of AES round keys generation in the AESCipher class
 */
import java.util.Scanner;

public class DriverAES {
  /*
   * This function takes an input 128-bit key as a Hexadecimal value and calls the aesRoundKeys function
   * from the AESCipher class.
   *
   * Parameters:
   *   key is a Hexadecimal key
   *   roundKeysHex holds all the keys returned from the aesRoundKeys function including the original key
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String key = scan.nextLine();
    scan.close();
    String[] roundKeysHex = AESCipher.aesRoundKeys(key);
    for (String l: roundKeysHex){
      System.out.println(l);
    }
  }
}
