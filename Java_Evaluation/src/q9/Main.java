package q9;

class Emp {
	String name;
	int id;
	double salary;
	String address;

	public Emp(String name, int id, double salary, String address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name:" + name);
		System.out.println("Id:" + id);
		System.out.println("Salary:" + salary);
		System.out.println("Address:" + address);
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp("Nimesh", 10, 200000, "Mumbai");
		emp.displayInfo();
		System.out.println(emp);
	}
}
