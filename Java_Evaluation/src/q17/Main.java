package q17;

public class Main {
	public String a = "Public";
	protected String b = "Protected";
	String c = "Default";
	private String d = "Private";
	
	public static void main(String[] args) {
		Main main=new Main();
		System.out.println(main.a);
		System.out.println(main.b);
		System.out.println(main.c);
		System.out.println(main.d);
	}
}
