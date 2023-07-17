package day40;

// 학익고등학교 학사관리 시스템을 개발하자...
// !!! 객체 초기화 (순서)
// 1. 인스턴스 초기화
// 2. 나중에 생각 ...
// 3. 생성자 - 객체의 초기화를 담당하는 메소드
class 재학생 {
	String 학교이름 = "학익고등학교";
	String 반;
	String 이름;
	
//	1. 생성자는 클래스와 이름이 같다
//	2. 생성자는 리턴의 개념이 없다
	재학생(String ban, String name){
		반 = ban;
		이름 = name;
	}
}

public class Test3 {
	public static void main(String[] args) {
		재학생 ob = new 재학생("호랑이반", "홍길동");
		System.out.println(ob.학교이름);
		System.out.println(ob.반);
		System.out.println(ob.이름);
	}

}