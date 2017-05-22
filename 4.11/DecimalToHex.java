import java.util.Scanner;

public class DecimalToHex {
// 4.11 Decimal to hex

	public static void main(String[] args) {
		System.out.print("Enter a decimal value (0 to 15): ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		
		if (i < 0 || i > 15) {
			System.out.println(i + " is an invalid input");
			System.exit(0);
		}
		System.out.println("The hex value is "
				+ Integer.toHexString(i).toUpperCase());
	}
}
