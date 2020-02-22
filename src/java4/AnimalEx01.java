package java4;

interface Animal {
	
	public abstract void sound();
	
}

class Dog implements Animal{
	
	// ¹«È¿È­½ÃÅ°´Ù.
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}

class Cat implements Animal{
	// ¹«È¿È­½ÃÅ°´Ù.
	public void sound() {
		System.out.println("¾ß¿Ë");
	}
}

class Bird implements Animal {
	// ¹«È¿È­½ÃÅ°´Ù.
	public void sound() {
		System.out.println("Â±Â±");
	}
}

class Tiger implements Animal {
	public void sound() {
		System.out.println("¾îÈï");
	}
}

class Cow implements Animal {
	public void sound() {
		System.out.println("À½¸Þ");
	}
}

class Pig implements Animal{

	@Override
	public void sound() {
		System.out.println("²Ü²Ü");
	}
	
}

public class AnimalEx01 {
	
	// Animal b = new Bird();
	static void play(Animal b) {
		b.sound();
	}
	
	public static void main(String[] args) {
		Bird b1 = new Bird();
		play(b1);
		
		Cat c1 = new Cat();
		play(c1);
		
		play(new Dog());
		
		play(new Tiger());
		
		play(new Cow());
		
		play(new Pig());
	}
}
