package singleton;

public class Singleton_1_2 {

	public static void main(String[] args) {
		// Singleton_1 클래스를 가져오기
		// Singleton_1 single = new Singleton_1();	private 으로 생성되어서 호출 불가능
		Singleton_1 single1 = Singleton_1.getInstance();
		// 생성자는 한번만 호출됨
		Singleton_1 single2 = Singleton_1.getInstance();
		
		System.out.println("single1 : " + single1);
		System.out.println("single2 : " + single2);
	}

}
