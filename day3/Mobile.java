package week1.day3;

public class Mobile {
	
	int modelNumber = 2011;
	long imeiNumber = 12345678911234567L;
	int storageSizeInGB = 128;
	char mobileLogo = 'I';
	String brandName = "Iqoo";
	long mobileNumber = 72008688851l;
	
	public void texting() {
		System.out.println("texting");
	}
	
	public void fileTransferring() {
		System.out.println("we can send images, videos");
	}
	
	public void locationSharing() {
		System.out.println("we can share location");
	}

	public void gaming() {
		System.out.println("we can play games");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mobile apple = new Mobile();
	apple.texting();
	apple.fileTransferring();
	apple.locationSharing();
	apple.gaming();
	
	System.out.println(apple.modelNumber);
	System.out.println(apple.imeiNumber);
	System.out.println(apple.storageSizeInGB);
	System.out.println(apple.mobileLogo);
	System.out.println(apple.brandName);
	System.out.println(apple.mobileNumber);
		

	}

}
