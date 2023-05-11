package week1.day4;

public class Car {

	public  void openingTheDoor() {
		System.out.println("everybody can open the door");
	}
	
	private void steering() {
		System.out.println("only the driver can do steering");
	}
	
	protected void switchOnAc() {
		System.out.println("anyone in the car can switch on the AC");
	}
	
	void switchonMusic() {
		System.out.println("switch on the music");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car suzuki = new Car();
		suzuki.openingTheDoor();
		suzuki.steering();
		suzuki.switchOnAc();
		suzuki.switchonMusic();
	}

}
