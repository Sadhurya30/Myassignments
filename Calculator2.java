package week1.day4;

public class Calculator2 {
   
	public int additionTwoNumber(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public int subtractionTwoNumber(int e, int f) {
		int g = e - f;
		return g;
	}
	
	public double multipleTwoNumber(double i, double j) {
		double k = i*j;
		return k;
	}
	
	public float divideTwoNumber(float x, float y) {
		float z = x/y;
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 calc = new Calculator2();
		
		int a = calc.additionTwoNumber(10,25);
		System.out.println(a);
		
		int b = calc.subtractionTwoNumber(15, 5);
		System.out.println(b);
		
		double c = calc.multipleTwoNumber(66.3, 24.5);
		System.out.println(c);
		
		float d = calc.divideTwoNumber(250.2F, 5F);
		System.out.println(d);

	}

}
