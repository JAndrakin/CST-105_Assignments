import java.util.Scanner;

public class NflPlayers{

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Year (2000-2016): " );
		String year = input.next();
		input.close();
		
		if (yearNumber(year) == 0) {
			System.out.println("Year 2000-2016");
			System.out.println("Invalid year input.");
			System.exit(0);
	}
	
		System.out.println(year + " Passing touchdowns");
	}
		
	
		 int getNumberOfPasses(int year) {
			
				switch (yearNumber(null)) {
					
					case 1: return 28;
					case 2: return 36;
					case 3: return 33;
					case 4: return 25;
					case 5: return 34;
					case 6: return 39;
					case 7: return 36;
					case 8: return 28;
					case 9: return 0;
					case 10: return 50;
					case 11: return 24;
					case 12: return 26;
					case 13: return 28;
					case 14: return 23;
					case 15: return 28;
					case 16: return 18;
					case 17: return 0;
						default: return 0;
						
				}
	}
		
		public static int yearNumber(String year) {
			
			int yearNumber;
			
			switch (year){
			case"2016":
				yearNumber = 1;
				break;
			
			case"2015":
				yearNumber = 2;
				break;
			
			case"2014":
				yearNumber = 3;
				break;
			
			case"2013":
				yearNumber = 4;
				break;
			
			case"2012":
				yearNumber = 5;
				break;
			
			case"2011":
				yearNumber = 6;
				break;
			
			case"2010":
				yearNumber = 7;
				break;
			
			case"2009":
				yearNumber = 8;
				break;
			
			case"2008":
				yearNumber = 9;
				break;
			
			case"2007":
				yearNumber = 10;
				break;
			
			case"2006":
				yearNumber = 11;
				break;
			
			case"2005":
				yearNumber = 12;
				break;
			
			case"2004":
				yearNumber = 13;
				break;
			
			case"2003":
				yearNumber = 14;
				break;
			
			case"2002":
				yearNumber = 15;
				break;
			
			case"2001":
				yearNumber = 16;
				break;
			
			case"2000":
				yearNumber = 17;
				break;
			
			default:
				yearNumber = 0;
				break;
			
			}
			
			return yearNumber;
		}
		
		
}
