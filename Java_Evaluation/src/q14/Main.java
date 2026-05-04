package q14;

class Emp {
	private String name;
	private double salary;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.setId(45);
		emp.setName("Rohit");
		emp.setSalary(2000000);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}
