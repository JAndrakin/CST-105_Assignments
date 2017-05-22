import java.util.Scanner;

public class Palindrome {
// 3.12 Palindrome number
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer:");
		int number = input.nextInt();
		
		// Extracting digits
		int first = number / 100;
		int last = number % 10;
		if (last == first) {
			System.out.print(number + " is a palindrome");
		} else {
			System.out.print(number + " is not a palindrome");
		}
	}

	
}
