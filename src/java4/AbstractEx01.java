package java4;

// �߻�Ŭ������ ��ü�� �ִ� �޼����, ���� �޼��带 ���� �� �ִ�.
// �߻�Ŭ������ new �� �� ����.
interface Į {
	public abstract void ų();
	public abstract void �丮();
	public abstract void ����();
	public abstract void ����();
}

abstract class �丮����� implements Į{
	@Override
	public void ų() {}
	@Override
	public void ����() {}
	@Override
	public void ����() {}

}


class ������ extends �丮�����{
	@Override
	public void �丮() {
		System.out.println("�丮��");	
	}
	
	@Override
	public void ����() {
		System.out.println("������");
	}
}


public class AbstractEx01 {
	public static void main(String[] args) {
		Į b = new ������();
		b.�丮();
	}
}
