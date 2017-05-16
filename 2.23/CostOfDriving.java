import java.util.Scanner;

public class CostOfDriving {
// 2.23 Cost of driving
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double distance;
		double milesPerGallon;
		double pricePerGallon;

		System.out.println("Distance in miles: ");
		distance = input.nextDouble();
		
		System.out.println("Miles Per Gallon: ");
		milesPerGallon = input.nextDouble();
		
		System.out.println("Price Per Gallon: ");
		pricePerGallon = input.nextDouble();
		
		input.close();
		
		double total = distance / milesPerGallon * pricePerGallon; 
		System.out.printf("The cost of driving is:" + total);
		
	}

}
