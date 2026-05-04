package q7;

class InvalidOperationException extends Exception {
	public InvalidOperationException() {
		System.out.println("Invalid Operation");
	}
}

public class Main {

	public static void cal(int num1,int num2,String operation) throws InvalidOperationException {
		
		if(operation.equals("+")) {
			System.out.println(num1+num2);
		}
		else if(operation.equals("-")) {
			System.out.println(num1-num2);
		}
		else if(operation.equals("*")) {
			System.out.println(num1*num2);
		}
		else if(operation.equals("/"))
			try {
				System.out.println(num1/num2);
			}catch(ArithmeticException e){
				System.out.println(e);
			}
		else {
			throw new InvalidOperationException();
		}
	}

	public static void main(String[] args) {
		try{
			cal(10, 12, "wxyz");
		}catch(InvalidOperationException e) {
			System.out.println(e);
		}
	}
}
