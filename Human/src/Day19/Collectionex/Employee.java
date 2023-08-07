package Day19.Collectionex;

public class Employee {
	private int ssn;
	private String name;
	private MyDate birteDate;
	private double salary;
	public Employee(String name, MyDate birteDate, double salary) {
		super();
		this.name = name;
		this.birteDate = birteDate;
		this.salary = salary;
	}
	public Employee(int ssn, String name, MyDate birteDate, double salary) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.birteDate = birteDate;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirteDate() {
		return birteDate;
	}
	public void setBirteDate(MyDate birteDate) {
		this.birteDate = birteDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return name+ birteDate + salary;
	}
	

}
 