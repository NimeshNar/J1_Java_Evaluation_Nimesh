package q8;

class Accountant{
	public void calSal(double salary) {
		System.out.println("Salary:"+salary);
	}
	public void calSal(double salary,double bonus) {
		System.out.println("Salary with Bonus:"+(salary+bonus));
	}
	public void calSal(double salary,double bonus,double tax) {
		System.out.println("Salary with Bonus and Tax:"+(salary+bonus-tax));
	}
}

class Emp extends Accountant{
	@Override
	public void calSal(double salary) {
		System.out.println("Salary:"+salary);
	}
	@Override
	public void calSal(double salary,double bonus) {
		System.out.println("Salary with Bonus:"+(salary+bonus));
	}
	@Override
	public void calSal(double salary,double bonus,double tax) {
		System.out.println("Salary with Bonus and Tax:"+(salary+bonus-tax));
	}
}

public class Main {
	public static void main(String[] args) {
		Accountant acc = new Accountant();
		acc.calSal(120000);
		acc.calSal(120000, 6000);
		acc.calSal(120000, 6000, 400);
		Emp emp = new Emp();
		emp.calSal(20000);
		emp.calSal(20000, 600);
		emp.calSal(20000, 600, 40);
	}
}
