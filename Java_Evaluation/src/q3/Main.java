package q3;

class Bank{
	public double getRateOfInterest() {
		return 0.5;
	}
}

class SBI extends Bank{
	@Override
	public double getRateOfInterest() {
		return 0.1;
	}
}

class ICICI extends Bank{
	@Override
	public double getRateOfInterest() {
		return 0.2;
	}
}

class Axis extends Bank{
	@Override
	public double getRateOfInterest() {
		return 0.3;
	}
}

public class Main {
	public static void main(String[] args) {
		Bank bank;
		bank = new Bank();
		System.out.println(bank.getRateOfInterest());
		bank = new SBI();
		System.out.println(bank.getRateOfInterest());
		bank = new ICICI();
		System.out.println(bank.getRateOfInterest());
		bank = new Axis();
		System.out.println(bank.getRateOfInterest());
	}
}
