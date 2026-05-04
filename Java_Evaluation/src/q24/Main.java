package q24;

class Emp {
	public void calSal(double salary) {
		System.out.println("Salary:" + salary);
	}

	public void calSal(double salary, double bonus) {
		System.out.println("Salary with Bonus:" + (salary + bonus));
	}

	public void calSal(double salary, double bonus, double tax) {
		System.out.println("Salary with Bonus and Tax:" + (salary + bonus - tax));
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.calSal(120000);
		emp.calSal(120000, 6000);
		emp.calSal(120000, 6000, 40);
	}
}
