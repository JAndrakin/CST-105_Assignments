import java.util.Scanner;

public class Financialapplication {
// 2.5 financial application calculate tips
	
	public static void main(String[] args) {
		//new scanner object
		Scanner input = new Scanner (System.in);
		//inputs for total and gratuity
		
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		
		System.out.println("Enter the gratuity rate: ");
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);
		
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is :" + gratuity + "total is:" + total);
	}

}
