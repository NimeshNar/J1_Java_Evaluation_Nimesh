package q20;

import java.lang.ArithmeticException;

public class Main {
	public static int divide(int n1,int n2) {
		return n1/n2;
	}
	public static void calFinal(int num1,int num2,String operation) {
		try {
			int result = divide(num1,num2);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		try {
			calFinal(10,0,"/");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
