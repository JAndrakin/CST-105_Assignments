import java.util.Scanner;
// 2.4 convert pounds into kilograms
public class ConvertPoundsIntoKilograms {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds:");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
				
	System.out.println(pounds + " pounds is " + kilograms + " killograms");
}
}