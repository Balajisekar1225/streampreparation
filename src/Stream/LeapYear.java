package Stream;
import java.util.Scanner;
public class LeapYear {

	    public static void main(String[] args) {
	        // Create a Scanner object to take user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a year
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();
	        
	        // Close the scanner
	        scanner.close();
	        
	        // Initialize a boolean flag to check if it's a leap year
	        boolean isLeapYear = false;
	        
	        // Use a for loop to check if it's a leap year
	        for (int i = 4; i <= year; i += 4) {
	            if (year == i) {
	                isLeapYear = true;
	                break;
	            }
	        }
	        
	        // Check if it's a leap year and print the result
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	}



