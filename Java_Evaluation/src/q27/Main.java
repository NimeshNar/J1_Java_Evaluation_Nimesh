package q27;

class Emp {
	String name;
	int id;

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object Deleted");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp("Nimesh", 10);
		emp=null;
		System.gc();
	}
}
