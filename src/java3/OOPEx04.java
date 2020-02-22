package java3;

/**
 * 
 * @author 오버로딩의 한계
 * 해결방안 : 다형성 (상속)
 *
 */

// 인터페이스는 new할 수 없다.
// 인터페이스는 추상(abstract) 메서드를 가진다.
// 인터페이스의 메서드는 public abstract가 생략되어 있다.
// 인터페이스의 메서드는 몸체를 만들 수 없다.
// 인터페이스를 구현한 자식 클래스는 추상 메서드를 무조건 구현해야 한다. (강제성)
interface Unit {
	int getAttack();
	int getHp();
	void setHp(int hp);
	String getName();
}

class Zealot implements Unit{
	private String name;
	private int hp;
	private int attack;
	
	public Zealot(String name) {
		this(name, 100, 10);
	}

	public Zealot(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String getName() {
		return name;
	}
}

class Dragoon implements Unit {
	private String name;
	private int hp;
	private int attack;
	
	public Dragoon(String name) {
		this(name, 100, 20);
	}

	public Dragoon(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		
	}
	@Override
	public String getName() {
		return name;
	}
}

class Hydra implements Unit {
	private String name;
	private int hp;
	private int attack;
	
	public Hydra(String name) {
		this(name, 100, 30);
	}

	public Hydra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}	
	
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		
	}
	@Override
	public String getName() {
		return name;
	}
}

class Ultra implements Unit {
	private String name;
	private int hp;
	private int attack;
	
	public Ultra(String name) {
		this(name, 100, 40);
	}

	public Ultra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}	
	
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		
	}
	@Override
	public String getName() {
		return name;
	}
}


public class OOPEx04 {
	
	// 히드라 -> 히드라
	static void attack(Unit u1, Unit u2) {
		u2.setHp(u2.getHp() - u1.getAttack());
		
		System.out.println(u2.getName()+"의 체력은 "+u2.getHp()+"입니다.");
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라군1");
		
		// 질럿 -> 드라군
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		
		// 드라군 -> 질럿
		attack(d1, z1);
		
		Zealot z2 = new Zealot("질럿2");
		// 질럿 1 -> 질럿 2
		attack(z1, z2);
		
		Zealot z3 = new Zealot("질럿3");
		Ultra u1 = new Ultra("울트라1");
		attack(u1, z3);
	}
	
}



