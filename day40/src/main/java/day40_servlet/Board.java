package day40_servlet;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 게시판 클래스 + 게시판 서비스 클래스 + 글 작성 컨트롤러
// + 글 목록 컨트롤러

// 글을 저장하는 클래스 (Value Object)

@Getter
@Setter
@AllArgsConstructor		// 모든 필드를 초기화하는 생성자
@NoArgsConstructor		// 기본 생성자
@ToString				// 객체의 값을 문자열로 출력하는 메서드
						// 추가
public class Board {
	private Long no;
	private String title;
	private String content;
	private LocalDate writeday;
}
