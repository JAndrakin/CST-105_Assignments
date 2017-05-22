import java.util.Scanner;

public class FinancialApplicationComputeFutureInvestment {
// 6.7 Compute future investment
	//Main method
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		final int NUMBER_OF_YEARS = 30; // number of years to display
		
		//Prompt user to enter the investment amount and interest rate
		System.out.print("\nEnter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		
		// Get monthly interest rate
		double montlyInterestRate = annualInterestRate / 1200;
		
		//Print a table that displays future value for the years from 1 to 30
		System.out.println("Years   Future Value"); // Table header
		for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n",
					futureInvestmentValue(amount, montlyInterestRate, years));
		}
	}
	
	//Method futureInvestmentValue computes future investment value
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
