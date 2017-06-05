public class Faculty extends Employee {
//11.2 person student employee faculty and staff classes
	
	public static String LECTURER = "Lecturer";
	public static String ASSISTANT_PROFESSOR = "Assistant Professor";
	public static String ASSOCIATE_PROFESSOR = "Associate Professor";
	public static String PROFESSOR = "Professor";
	
	private String officeHours;
	private String rank;
	
	public Faculty(String name) {
		this(name, "9-5PM", "Employee");
	}
	
	public Faculty(String name, String officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank() {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "Class: " + this.getClass().getName();
		
	}
	
}
