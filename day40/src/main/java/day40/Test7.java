package day40;

// 3. 메모리 영역
// stack 영역 : 변수 (기본, 참조 타입)와 메서드가 저장되는 곳
//			  (수명이 중괄호가 닫힐 때까지)
// heap 영역 : 객체가 저장되는 곳 (필요할 때 사용하고 반납)
// method 영역 : 상수들이 저장되는 곳 (수명이 프로그램이 끝날 때까지)

public class Test7 {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		
		b = new Person(); // 쓰레기 객체
		
//		참조변수 : 2개 (맨 앞의 Person)
//		객체 : 3개 (new)
		
	}
}
