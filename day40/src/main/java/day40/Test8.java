package day40;

// 접근 제한 : public, protected, (default), private
// public : 공개

// private : 비공개
class Person2 {
	private String name;
	
//	접근 제한자를 지정하지 않는다 => default => 같은 패키지만 접근 가능
//						 => 중요한가? => 아니오 => 쓰지 않는다.
	Long age;
	
//	외부에 비공개, 자식은 접근이 가능
	protected Long money;
	
	public void introduce() {
		System.out.println("안녕하세요 저는 " + name + "입니다.");
	}
}

public class Test8 {

}
