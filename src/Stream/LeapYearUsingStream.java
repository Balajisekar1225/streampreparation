package Stream;
import java.util.Scanner;
import java.util.stream.IntStream;
public class LeapYearUsingStream {
	 public static void main(String[] args) {
	        // Create a Scanner object to take user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a year
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Close the scanner
	        scanner.close();

	        // Use a stream to check if it's a leap year
	        boolean isLeapYear = IntStream.rangeClosed(0, year).anyMatch(y -> (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));

	        // Check if it's a leap year and print the result
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	}



