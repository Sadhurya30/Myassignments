package week1.day1;

public class Car {

	public void applyBreak() {
		System.out.println("apply break");
	}
	
	public void applyGear() {
		System.out.println("apply gear");
	}
	
	public void switchOnAc() {
		System.out.println("we can witch on Ac");
	}
	
	public void applyAccelerate() {
		System.out.println("we can accelerate");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car swift = new Car();
        swift.applyBreak();
        swift.applyGear();
        swift.applyAccelerate();
        swift.switchOnAc();
	}

}
