package day40;

// 클래스
// 1. 객체지향(object oriented) : 소프트웨어 부품 -> 재사용 -> 생산성
//	 	소프트웨어 부품 -> 껴다 뺐다 할 수 있어야 한다 -> 조립
// 2. 멤버 - 필드, 메소드, 생성자 
// 3. 메모리 영역
// 4. 접근제한
// 5. 정적 멤버
// 6. final
// 7. 싱글톤

public class Product {
//		데이터 모델링
//		쇼핑몰의 상품 : 상품번호, 상품명, 가격, 제조사, 상품소개, 재고, 판매수량, 판매금액,
//		 			배송비, 도착예정일 .....
		Long no;
		String name;
		Long price;
		String vendor;
		String info;
		Long countOfSales;
		Long totalSalesAmount;
		Long DeliveryPeriod;
//		LocalDate 도착예정일; 				계산필드
//		매일 product의 정보를 바꿔야함 /과거의 주문내역을 확인하지못함
}