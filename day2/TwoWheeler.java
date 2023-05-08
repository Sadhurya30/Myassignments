package week1.day2;

public class TwoWheeler {

	int noOfWheels = 2;
    short noOfMirrors = 2;
    long chassisNumber = 98765432101234567L;
    boolean isPunctured = false;
    String bikeName = "Apache";
    double runningKM = 100.56698;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      
      TwoWheeler apache = new TwoWheeler();
      System.out.println(apache.noOfWheels);
      System.out.println(apache.noOfMirrors);
      System.out.println(apache.chassisNumber);
      System.out.println(apache.bikeName);
      System.out.println(apache.runningKM);
      
	}

}
