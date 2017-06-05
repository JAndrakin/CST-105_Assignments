import java.util.Scanner;

public class Geometrycircledistance {
// 4.2 Great circle distance
	private static final double AVERAGE_EARTH_RADIUS = 6371.01;
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point 1 latitude in degrees: ");
		double x1 = input.nextDouble();
		System.out.println("Enter point 2 longitude in degrees: ");
		double y1 = input.nextDouble();
		
		System.out.println("Enter point 1 latitude in degrees: ");
		double x2 = input.nextDouble();
		System.out.println("Enter point 2 longitude in degrees: ");
		double y2 = input.nextDouble();
		input.close();
		
		// solving for the distance between the two points
		// Formula: d = radius * arccos(sin(x1) * sin (x2) + cos(x1) * cos(x2) * cos(y1-y2))
		
		double radius = AVERAGE_EARTH_RADIUS;
		
		double distance = radius *
				Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
							Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
							Math.cos(Math.toRadians(y1 - y2 )));
		System.out.printf("The distance between the two points is %f km", distance);
		
	}
}
