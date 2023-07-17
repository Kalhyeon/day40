package day40;

public class Test12 {
	public static void main(String[] args) {
//		메모장을 3개 실행한다고 하자.
//		1. 저장된 메모장 프로그램을 읽어온다.
//		2. 읽어온 메모장을 3번 실행한다.
		
//		마린을 3개 생성한다면
//		1. 번역하여 저장된 Marine 클래스를 읽어온다
//		   (인스턴스 초기화).
//		2. 읽어온 Marine 객체를 3개 생성한다(생성자).
		
//		static 은 객체보다 먼저 존재한다.
		System.out.println(Marine.hp);
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
	}
}
