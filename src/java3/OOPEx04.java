package java3;

/**
 * 
 * @author �����ε��� �Ѱ�
 * �ذ��� : ������ (���)
 *
 */

class Zealot{
	String name = "����";
	int hp = 100;
	int attack = 10;
}

class Dragoon {
	String name = "���";
	int hp = 100;
	int attack = 20;
}

class Hydra {
	String name = "�����";
	int hp = 100;
	int attack = 30;
}

public class OOPEx04 {
	
	// ������ ����� ����
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	// ����� ������ ����
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	// ������ ������ ����
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	// ����� -> ����
	static void attack(Hydra u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	// ����� -> ���
	static void attack(Hydra u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	// ���� -> �����
	static void attack(Zealot u1, Hydra u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	// ��� -> �����
	static void attack(Dragoon u1, Hydra u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	// ����� -> �����
	static void attack(Hydra u1, Hydra u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Dragoon d1 = new Dragoon();
		
		// ���� -> ���
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		
		// ��� -> ����
		attack(d1, z1);
		
		Zealot z2 = new Zealot();
		// ���� 1 -> ���� 2
		attack(z1, z2);
	}
	
}



