package week1.day4;

public class Student {
	
	public void regNumber(int a) {
		System.out.println(a);
	}

	public void mobileNumber(long a) {
		System.out.println(a);
	}
	public void name( String s) {
		System.out.println(s);
	}
	
	public void dateOfBirth (String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student indhu = new Student();
	
	indhu.regNumber(789654);
	indhu.mobileNumber(9876543210L);
	indhu.name("Indhu");
	indhu.dateOfBirth("20/07/2001");
	
	

	}

}
