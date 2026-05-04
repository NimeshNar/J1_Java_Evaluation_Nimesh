package q12;

class Manager {
	String t1 = "Java";
	String t2 = "DBMS";

	public Manager() {
		System.out.println("Parent Class");
	}

	public void displayTask() {
		System.out.println("Parent Class Method");
	}
}

class Emp extends Manager {
	public Emp() {
		super();
		System.out.println("Child Class");
		System.out.println(super.t1);
		System.out.println(super.t2);
	}

	public void display() {
		super.displayTask();
		System.out.println("Child Class Method");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.display();
	}
}
