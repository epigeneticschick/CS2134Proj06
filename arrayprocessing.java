/* Arrayprocessing.java is a driver for methods printArray and readArray.
 * Student Name: Lorrayya Williams
 * Date: March 08, 2019 for CS 214 at Calvin College
 * Precondition: theArray, is an array of double values.
 * Output: the average of the numbers in theArray.
 ***************************************************************/
 import java.io.*;
 import java.util.Scanner;

public class arrayprocessing
{
  public static void main(String[] args)
    {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Hello! This programs allows you to create, add values to, and print an array.");
  System.out.println("How many values would you like to be in the array?");
  int value = keyboard.nextInt(); //inputs the size of array
  Double [] values = new Double[value]; //creates the array

  System.out.println("What values would you like in the array?");
    readArray(values);
    printArray(values);

}


/* Input: Accepts an Array
* Precondition: The array contains values.
* Output: Prints the values of the Arrayprocessing
******************************************************/
  public static void printArray(Double [] anArray){
    System.out.println("The values of the array are going to be printed below.");
    for(int i=0; i < anArray.length; i++){
      System.out.println(anArray[i] + "\n");
    }
  }


/* Input: An Array and the values within the array.
* Precondition: The inputed values are numerical
* Output: A modified array.
********************************************************/
  public static void readArray(Double [] anArray){
      Scanner keyboard = new Scanner(System.in);
      for(int i =0; i < anArray.length; i++){
      System.out.println("Please add a value to the array: ");
      anArray[i] = keyboard.nextDouble();
      }
  }
}
