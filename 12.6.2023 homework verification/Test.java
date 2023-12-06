package pack;

// Tristan Beason 5443

interface Dog {
void bark();
void run();
void sit();
}

class Dalmatian implements Dog {
	public void bark() {
		System.out.println("Dalmatian dog is barking.");
	}
	public void run() {
		System.out.println("Dalmatian dog is running.");
	}
	public void sit() {
		System.out.println("Dalmatian dog is sitting.");
	}
}

class GermanShepherd implements Dog {

	public void bark() {
		System.out.println("German Shepherd is barking.");
	}
	public void run() {
		System.out.println("German Shepherd is running.");
	}
	public void sit() {
		System.out.println("German Shepherd is sitting.");
	}
	
	public void guard() {
		System.out.println("German Shepherd is guarding.");
	}
}

public class Test {
    public static void main(String[] args) {
	Dog dal = new Dalmatian();
dal.bark();
dal.run();
dal.sit();
System.out.println();

	Dog gs = new GermanShepherd();
	gs.bark();
	gs.run();
	gs.sit();
	((GermanShepherd) gs).guard();
System.out.println();

}
}
