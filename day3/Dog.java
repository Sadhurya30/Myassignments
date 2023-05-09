package week1.day3;

public class Dog {
	
	String dogBreed = "Labrador";
	String colour = "Black";
	int noOfLegs = 4;
	
	public void barking() {
		System.out.println("dogs will bark");
	}

	public void running() {
		System.out.println("dogs can run");
	}
	
	public void walking() {
		System.out.println("dogs can walk");
	}
	
	public static void drinking() {
		System.out.println("dogs will drink water");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog labrador = new Dog();
    drinking();
    labrador.barking();
    labrador.running();
    labrador.walking();
    
    System.out.println(labrador.dogBreed);
    System.out.println(labrador.colour);
    System.out.println(labrador.noOfLegs);
	}

}
