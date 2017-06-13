import java.util.Calendar;

public class DisplayCalendars {
// 13.4 display calendars
	
	private static MyCalendar calendar;
	/** Main method */
	public static void main(String[] args) {
		
		if (args.length > 2 || args.length == 0) {
			System.out.println("Invalid arguments");
			System.out.println("Usage: java exercise13.04 5 2016");
		}
		
		int year;
		if (args.length == 1) {
			year = Calendar.getInstance().get(Calendar.YEAR);
		} else {
			year = new Integer(args[1]);
		}
		int month = Integer.parseInt(args[0]) - 1;
		calendar = new MyCalendar(year, month, 1);
		calendar.set(Calendar.DATE, 1);
		
		printMonth();
	}
	
	/** Print the calendar for a month in a year */
	public static void printMonth() {
		// Print the headings of the calendar
		printMonthTitle();
		
		//Print the body of hte calendar
		printMonthBody();
	}
	
	/** Print the month title*/
	public static void printMonthTitle() {
		System.out.println("         " + calendar.getMonthName()
		+ " " + calendar.get(Calendar.YEAR));
		System.out.println("----------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
	
	/** print month body */
	public static void printMonthBody() {
		// Get start day of the week for the first date in the month
		int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		
		// Get number of days in the month
		int numberOfDaysInMonth = calendar.daysInMOnth();
		
		//Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("   ");
		
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		
		System.out.println();
	}
	 

}
