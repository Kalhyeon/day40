package day40;

// static : 객체들이 공유하는 값

class Deposit {
	static Double rate;
	String accountNumber;
	String accountHolder;
	Long balance;
}

public class Test10 {
//	객체가 가지는 값은 객체마다 달라야한다.
//	금리와 같이 모든 객체들이 항상 같은 값을 가져야 한다면
//	1. 모든 객체들의 금리가 같도록 항상 신경쓰자?
//	2. 객체들이 금리를 저장하지 않는다, 금리를 외부에 따로 저장하여 공유하자?
	
//	'static 은 객체 소속이 아니다.'
	public static void main(String[] args) {
		Deposit account1 = new Deposit();
		Deposit account2 = new Deposit();
		
		System.out.println(account1.rate);
		System.out.println(account2.rate);
		
		account1.rate = 4.2;
		System.out.println(account2.rate);
//		4.2가 출력됨
		
//		정적인 필드는 객체의 이름이 아닌 클래스의 이름으로 접근하자.
		System.out.println(Deposit.rate);
	}
}
