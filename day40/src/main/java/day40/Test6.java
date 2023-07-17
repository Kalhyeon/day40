package day40;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 클래스의 종류
// 1. 값을 저장하는 클래스 : Value Object(VO) @Entity
// 2. 값을 계산하는 클래스 : Service		    @Service
// 3. 사용자의 입력을 받아 작업을 지휘하는 클래스 :  Controller
//									    @Controller

// 어노테이션
@Getter
@Setter
@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자를 자동으로 생성
@NoArgsConstructor // 생성자 없음을 알림
@ToString // 객체의 값을 출력하는 메서드
class Member {
	private String username;
	private String password;
}

public class Test6 {
	public static void main(String[] args) {
//		객체를 만드는 메서드 : 생성자
//		클래스에 생성자가 없으면 자바가 생성자를 추가 => 기본 생성자
//										   (매개변수 없음)
//		그러나 생성자를 만들면 기본 생성자를 추가하지 않는다.
		
		Member member = new Member("홍길동", "1234");
		System.out.println(member);
		
	}
	
}
