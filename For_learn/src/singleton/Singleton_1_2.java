package singleton;

public class Singleton_1_2 {

	public static void main(String[] args) {
		// Singleton_1 Ŭ������ ��������
		// Singleton_1 single = new Singleton_1();	private ���� �����Ǿ ȣ�� �Ұ���
		Singleton_1 single1 = Singleton_1.getInstance();
		// �����ڴ� �ѹ��� ȣ���
		Singleton_1 single2 = Singleton_1.getInstance();
		
		System.out.println("single1 : " + single1);
		System.out.println("single2 : " + single2);
	}

}
