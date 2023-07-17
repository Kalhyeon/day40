package day40;

// 5. static : 정적 멤버
class 경인여대학생 {
	String gender = "여자";
	String name;
	String tel;
}

public class Test9 {
	public static void main(String[] args) {
		경인여대학생 ob1 = new 경인여대학생();
		경인여대학생 ob2 = new 경인여대학생();
		경인여대학생 ob3 = new 경인여대학생();
	}
}
