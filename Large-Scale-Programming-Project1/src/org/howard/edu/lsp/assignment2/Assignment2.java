package org.howard.edu.lsp.assignment2;

import java.util.stream.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 * This class is a simple text processor. 
 * Java program that processes input lines until the user enters a terminating newline character. 
 * @author benjin8or
 *
 */

public class Assignment2 {
	/**
	 * This method takes in user input to determine sum and product of the input.
	 * The program ends when the User types "Goodbye".
	 * @param args are stored as strings in an array
	 */
	public static void main(String[]args)
	{
		int control=0;
		while (control==0) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("String?");
		String[] tokens= scanner.nextLine().split(" ");
		if (tokens[0].equals("Goodbye")){
			control=1;
			break;
		}	
		int s=0;
		int m=1;
		System.out.println("Tokens:");
		for (String element: tokens) {
			int i = Integer.parseInt(element);
			s=s+i;
			m=m*i;
            System.out.println(element);
        }
		System.out.println("Sum: "+s);
		System.out.println("Product: "+m);
		}	
}
}