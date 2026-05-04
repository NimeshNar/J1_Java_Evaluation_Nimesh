package q22;

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

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp("Nimesh", 10, 1000000, "Mumbai");
		System.out.println(emp);
	}
}
