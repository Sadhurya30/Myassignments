package week1.day2;

public class Mobile {
 
	String mobileBrandName = "Iqoo";
	char mobileLogo = 'I';
	short noOfMobilePiece = 1;
	int modelNumber = 2011;
	long mobileImeiNumber = 123456789102345L;
    float mobilePrice = 19000.500f;
    boolean isDamaged = false;
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile iqoo = new Mobile();
		System.out.println(iqoo.mobileBrandName);
		System.out.println(iqoo.mobileLogo);
		System.out.println(iqoo.noOfMobilePiece);
		System.out.println(iqoo.modelNumber);
		System.out.println(iqoo.mobileImeiNumber);
		System.out.println(iqoo.mobilePrice);
		System.out.println(iqoo.isDamaged);

	}

}
