import java.util.Scanner;

public class PrintCharactersInAStringReverse {
// 18.9 Print String in Reverse

	public static void main(String[] args) {
		
		System.out.print("Enter a string: ");
		String value = new Scanner(System.in).nextLine();
		reverseDisplay(value);
	
	}
	
	private static void reverseDisplay(String value) {
		if (value.length() == 0)
			return;
		System.out.print(value.substring(value.length() - 1));
		reverseDisplay(value.substring(0,  value.length()-1));
	}
}
