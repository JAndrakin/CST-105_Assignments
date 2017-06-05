import java.util.Date;

public class Employee extends Person {
//11.2 person student employee faculty and staff classes
	
	private double salary;
	private String office;
	private Date dateHired;
	
	public Employee(String name) {
		this(name, 0,"none", new Date());
	}
	
	public Employee(String name, double salary, String office, Date date) {
		super(name);
		this.salary = salary;
		this.office = office;
		this.dateHired = date;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public Date getDateHired() {
		return dateHired;
	}
	
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
