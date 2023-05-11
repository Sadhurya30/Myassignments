package week1.day4;

public class Calculator {

	public void addTwoNumber(int a, int b) {
		
		int c= a+b;
		System.out.println(c);
	}
	
	public void subTwoNumber(int a,int b) {
		int c = a-b;
		System.out.println(c);
	}
	
	public void mulitplyTwoNumber(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	
	public void divideTwoNumber(int a,int b) {
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Calculator calc = new Calculator();
		 calc.addTwoNumber(25, 25);
		 calc.subTwoNumber(15, 2);
		 calc.mulitplyTwoNumber(12, 12);
		 calc.divideTwoNumber(10, 2);
	}

}
