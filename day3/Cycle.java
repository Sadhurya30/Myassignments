package week1.day3;

public class Cycle {

	 int noOfWheels = 2;
     int pedal = 2;
     int bell = 1;
     boolean handbrake = true;
     
     public void applyBrake() {
    	 System.out.println("apply brake");
     }
     
     public void adjustMirror() {
    	 System.out.println("we can adjust the mirror");
     }
     
     public void pedalling() {
    	 System.out.println("we can pedal");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cycle ladyBird = new Cycle();
      
      ladyBird.applyBrake();
      ladyBird.adjustMirror();
      ladyBird.pedalling();
      
      System.out.println(ladyBird.noOfWheels);
      System.out.println(ladyBird.pedal);
      System.out.println(ladyBird.bell);
      System.out.println(ladyBird.handbrake);
      
      
      
      
      
       
	}

}
