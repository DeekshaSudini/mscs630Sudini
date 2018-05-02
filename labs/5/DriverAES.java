/*
 * file: DriverAES.java
 * author: Deeksha Sudini
 * course: MSCS630
 * assignment: Lab 5
 * due date: Wednesday, April 18, 2018
 * version: 9.0.4
 *
 * This file contains the declaration of the
 * DriverAES class.
 */

import java.util.Scanner;

/*
 * DriverAES
 *
 * This class DriverAES works on the implementation of AES algorithm in the AESCipher class
 */
public class DriverAES {

  /* This function takes the input as 128-bit key which is a Hexadecimal string of length 32 and the plain text
   * and calls the AES function from the AESCipher class and prints the Encrypted message
   *
   *   key: It holds the 128-bit Hexadecimal key
   *   plainText:It holds the 128-bit Plain text
   *   cipherText:It Holds the Encrypted message returned by the AES method
   *
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String key = input.nextLine();
    String plainText = input.nextLine();
    input.close();

    String cipherText = AESCipher.AES(plainText, key);

    System.out.println(cipherText);

  }
}
