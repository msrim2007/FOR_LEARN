/*
 * 싱글톤(Singleton) 패턴
 * 객체의 인스턴스가 오직 1개만 생성되는 패턴
 * 생성자 호출이 반복적으로 발생하더라도 최초 생성된 인스턴스를 반환
 * 메모리 낭비를 방지할 수 있다. 단, DIP(의존 역전 법칙), OCP(개방-폐쇄 법칙)을 위배하게 될 수 있다.
 */
package singleton;

public class Singleton_1 {
	
	// 클래스 내에서 new 구문을 통해 객체를 생성
	// => 외부에서 사용자가 new 키워드를 사용하지 않아도 됨
	private static Singleton_1 instance = new Singleton_1();
	
	// 생성자
	private Singleton_1() {
		// 생성자는 외부에서 호출하지 못하도록 private으로 지정
		System.out.println("Singleton constructor");
	}
	
	// 객체로 정의한 인스턴스를 반환해주는 public 함수 
	// => 외부에서 호출 가능
	public static Singleton_1 getInstance() {
		return instance;
	}
	
	// 내부 클래스 main
	public static void main(String[] args) {
		// new 키워드가 아닌 public 함수로 호출
		Singleton_1 single1 = Singleton_1.getInstance();
		Singleton_1 single2 = Singleton_1.getInstance();	// 해당 객체를 불러올 때는 생성자 호출 X
		
		// getInstance로 객체 생성 시 같은 객채 반환
		System.out.println("single1 : " + single1);
		System.out.println("single2 : " + single2);
	}
}