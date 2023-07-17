package day40_servlet;

import java.time.LocalDate;
import java.util.ArrayList;

// 컨트롤러 : 사용자와 입/출력하는 클래스
// VO : 데이터를 저장하는 클래스
// 서비스 : VO 를 처리하는 클래스

// Board 로 CRUD 작업을 하는 클래스

public class BoardService {
//	글들을 저장하는 객체
//	<> 연산자를 적용하지 않은 ArrayList 는
//	모든 것을 다 저장할 수 있다 => 쓰레기통
//	<> 연산자로 어떤 객체를 저장할지 정해준다.
	static ArrayList<Board> list = new ArrayList<Board>();
	static Long no = 1L;
	
//	글을 저장하는 메서드
//	사용자가 입력한 제목과 내용을 서블릿으로부터 전달받아 저장하는 메서드
	public static void create(String title, String content) {
		Board board = new Board(no++, title, content, LocalDate.now());
		list.add(board);
	}
	
//	글의 목록을 출력하는 메서드
	public static ArrayList<Board> list() {
		return list;
	}
}
