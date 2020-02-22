package java4;

// �������̽��� ���� ��� ������ �Լ��� public�� ����!!
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
	// ��ȿȭ��Ű��.
	public void sound() {
		System.out.println("�߿�");
	}
}

class Bird implements Animal {
	// ��ȿȭ��Ű��.
	public void sound() {
		System.out.println("±±");
	}
}

class Tiger implements Animal {
	public void sound() {
		System.out.println("����");
	}
}

class Cow implements Animal {
	public void sound() {
		System.out.println("����");
	}
}

class Pig implements Animal{

	@Override
	public void sound() {
		System.out.println("�ܲ�");
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
