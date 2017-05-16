import java.util.Scanner;

public class CalculateInterest {
//2.20 Calculate interest
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance: ");
		double balance = input.nextDouble();
		System.out.println("Enter interest rate (e.g., 3 for 3%): ");
		double annualInterestRate = input.nextDouble();
		
		double interest = balance * (annualInterestRate / 1200);
		
		System.out.println("Interest =" + interest);
	}

}
