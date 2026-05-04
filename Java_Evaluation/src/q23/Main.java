package q23;

class Address {
	String add1;
	String add2;

	public Address(String add1, String add2) {
		super();
		this.add1 = add1;
		this.add2 = add2;
	}

	@Override
	public String toString() {
		return "Address [add1=" + add1 + ", add2=" + add2 + "]";
	}
}

class Hobbies {
	String h1;
	String h2;

	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}

	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
}

class Emp {
	String name;
	int id;
	Address address;
	Hobbies hobbies;

	public Emp(String name, int id, Address address, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Address address = new Address("Mumbai", "Thane");
		Hobbies hobbies = new Hobbies("Reading", "Writing");
		Emp emp = new Emp("Nimesh", 10, address, hobbies);
		System.out.println(emp.address.add2);
		System.out.println(emp.hobbies.h1);
		System.out.println(emp);
	}
}
