package day40;

// 객체의 초기화 : 1. 인스턴스 초기화
class Person {
//     클래스를 작성할 때 필드의 값을 직접 지정한다
//     => 모든 객체가 같은 값을 가진다
	String name = "홍길동";
	Long nai = 20L;
}

public class Test2 {
	public static void main(String[] args) {
//		Product는 필드만 있다 => 객체를 생성하면 값이 모두 null
//                        => 필요X
		Product p = new Product();
		System.out.println(p.name);
		
		Person s1 = new Person();
		Person s2 = new Person();
		System.out.println(s1.name);
		System.out.println(s2.name);
	}
}