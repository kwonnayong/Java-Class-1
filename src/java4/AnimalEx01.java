package java4;

// 인터페이스가 가진 모든 변수나 함수는 public이 내장!!
interface Animal {
	void sound();
}

class Dog implements Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
}

class Cat implements Animal{
	// 무효화시키다.
	public void sound() {
		System.out.println("야옹");
	}
}

class Bird implements Animal {
	// 무효화시키다.
	public void sound() {
		System.out.println("짹짹");
	}
}

class Tiger implements Animal {
	public void sound() {
		System.out.println("어흥");
	}
}

class Cow implements Animal {
	public void sound() {
		System.out.println("음메");
	}
}

class Pig implements Animal{

	@Override
	public void sound() {
		System.out.println("꿀꿀");
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
