package week1.day3;

public class Laptop {
	
	String brandName = "Asus VivoBook";
	int operatingSystemInBit = 64;
	int ramSizeInGB = 8;
	
	public void gaming() {
		System.out.println("We can play games");
	}

	public void forOnlineClasses() {
		System.out.println("wecan use laptop for online classes");
	}
	
	public void watchingMovies() {
		System.out.println("we can watch movies");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Laptop asusVivoBook = new Laptop();
	asusVivoBook.gaming();
	asusVivoBook.forOnlineClasses();
	asusVivoBook.watchingMovies();
	
	System.out.println(asusVivoBook.brandName);
	System.out.println(asusVivoBook.operatingSystemInBit);
	System.out.println(asusVivoBook.ramSizeInGB);
	
	}

}
