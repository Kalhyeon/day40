package day40;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 클래스 만들기
// 1. 필드를 선정
// 2. 초기화 - 인스턴스 초기화, 생성자
// 3. 게터, 세터 메소드
// 		필드값을 마음대로 못바꾸게 필드를 private으로 지정(정보은닉)
// 		메소드는 객체의 사용 방법 - public
// 		private, public을 지정하지 않으면? 같은 패키지인 경우 접근 가능

// 어노테이션 사용하기
// 1. 위치는 클래스 또는 필드 : 클래스에 지정하면 클래스에 적용, 필드에 지정하면 필드에 적용
// 2. 반드시 붙여서 사용한다

@AllArgsConstructor
@Getter
// Board라는 클래스에 생성자는 5개 있고 Getter 하나 Setter 4개 있다
class Board {
	private Long 글번호;
	@Setter private String 제목;
	@Setter private String 내용;
	@Setter private String 글쓴이;
	@Setter private Long 조회수;
}

public class Test5 {
	public static void main(String[] args) {
		Board board = new Board(1L, "제목", "내용", "spring", 0L);
		board.set제목("제목을 바꿨어요");
		System.out.println(board.get제목());
	}
}