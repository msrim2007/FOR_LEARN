/*
 * �̱���(Singleton) ����
 * ��ü�� �ν��Ͻ��� ���� 1���� �����Ǵ� ����
 * ������ ȣ���� �ݺ������� �߻��ϴ��� ���� ������ �ν��Ͻ��� ��ȯ
 * �޸� ���� ������ �� �ִ�. ��, DIP(���� ���� ��Ģ), OCP(����-��� ��Ģ)�� �����ϰ� �� �� �ִ�.
 */
package singleton;

public class Singleton_1 {
	
	// Ŭ���� ������ new ������ ���� ��ü�� ����
	// => �ܺο��� ����ڰ� new Ű���带 ������� �ʾƵ� ��
	private static Singleton_1 instance = new Singleton_1();
	
	// ������
	private Singleton_1() {
		// �����ڴ� �ܺο��� ȣ������ ���ϵ��� private���� ����
		System.out.println("Singleton constructor");
	}
	
	// ��ü�� ������ �ν��Ͻ��� ��ȯ���ִ� public �Լ� 
	// => �ܺο��� ȣ�� ����
	public static Singleton_1 getInstance() {
		return instance;
	}
	
	// ���� Ŭ���� main
	public static void main(String[] args) {
		// new Ű���尡 �ƴ� public �Լ��� ȣ��
		Singleton_1 single1 = Singleton_1.getInstance();
		Singleton_1 single2 = Singleton_1.getInstance();	// �ش� ��ü�� �ҷ��� ���� ������ ȣ�� X
		
		// getInstance�� ��ü ���� �� ���� ��ä ��ȯ
		System.out.println("single1 : " + single1);
		System.out.println("single2 : " + single2);
	}
}