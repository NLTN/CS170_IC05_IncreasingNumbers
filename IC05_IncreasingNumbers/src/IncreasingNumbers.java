/*
    Nguyen, Nguyen
    CS A170
    02/14/2018

    IC05_IncreasingNumbers
 */

import java.util.Scanner;

public class IncreasingNumbers {
	public static void main(String[] args) {
		// Variables
		int x, y, z;
		int temp; // This is a temporary variable, and it is used for swapping
		Scanner consoleScanner = new Scanner(System.in);

		// Get the input from user
		System.out.print("Please enter a non-negative number: ");
		x = consoleScanner.nextInt();

		System.out.print("Please enter a non-negative number: ");
		y = consoleScanner.nextInt();

		System.out.print("Please enter a non-negative number: ");
		z = consoleScanner.nextInt();

		// Close the scanner.
		consoleScanner.close();

		// Check for if there is any negative number.
		if (x < 0 || y < 0 || z < 0) {
			// Show the warning.
			System.out.println("Please enter non-negative numbers only.");
		} else {
			// Compare x & z. if x > z, then swap them.
			if (x > z) {
				temp = x;
				x = z;
				z = temp;
			}

			// Compare x & y. if x > y, then swap them.
			if (x > y) {
				temp = x;
				x = y;
				y = temp;
			}
			
			// Compare y & z. if y > z, then swap them.
			if (y > z) {
				temp = y;
				y = z;
				z = temp;
			}

			// Display the result
			System.out.println("\nThe numbers you entered in increasing order are:");
			System.out.println(x + "\n" + y + "\n" + z);
		}
	}
}