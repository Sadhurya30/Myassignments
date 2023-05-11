package week1.day4;

public class Calculator1 {

	public int addTwoNumber(int a, int b) {
		int c = a +b;
		return c;
	}
	
	public void subtractTwoNumber(int total, int b) {
		int c = total - b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator1 calc = new Calculator1();
    
    int total = calc.addTwoNumber(100,100);
    System.out.println(total);
    
    calc.subtractTwoNumber(total, 20);
    
	}

}
