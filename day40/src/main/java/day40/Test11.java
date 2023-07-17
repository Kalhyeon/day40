package day40;

class Marine {
//	값이 하나만 존재, 객체 소속이 아닌 클래스 소속
	static Long hp = 40L;
	String name;
}

public class Test11 {
	public static void main(String[] args) {
//		마린이 10마리
//		이름은 모두 다르지만 체력은 모두 40이다.
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
//		static 필드에 객체로 접근할 수는 있으나, 권장되지 않는다.
		System.out.println(m1.hp);
		System.out.println(m2.hp);
		
//		클래스의 이름으로 접근하자.
		System.out.println(Marine.hp);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.floor(3.14));
	}
}
