package day40;

import lombok.Getter;
import lombok.Setter;

// Test001 부가설명
// 클래스를 구성하는 멤버 : 필드, 생성자, getter/setter
@Getter
@Setter
class Human {
	private String irum;
	private Long 키;
	private Long 체중;
}

public class Test4 {
	public static void main(String[] args) {
		Human h1 = new Human();
//		객체는 소프트웨어 부품 => 구입했을 때 적절한 초기화 필요 => 인스턴스 초기화, 생성자
		
//		h1.키 = 185L; 오류뜸
//		h1.체중 = 68L;
		
//		지나가던 사람이 보니 기분나빠
//		h1.키 = 165L;
//		h1.체중 = 88L;
		
//		값을 바꾸려면 정해진 방법에 따라 바꿔라 -> 정보은닉(getter, setter)
		h1.setIrum("홍길동");
		h1.set키(185L);
		h1.set체중(70L);
	}
}