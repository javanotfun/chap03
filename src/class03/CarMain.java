package class03;

public class CarMain {
	/*
	 * 실행클래스 객체 생성과 필드
	 */

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car(); // 기본 생성자 호출 new Car(); = 생성자 함수 새로생성

		// 필드의 초기값읽기 초기에는 자동으로 기본값 들어감 0, Null 등
		System.out.println("모델명(String) : " + myCar.model); // . 은 도트연산자 접근할때 사용
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("출발여부(boolean) : " + myCar.start);
		System.out.println();

		// myCar 객체의 필드에 값저장 속성 myCar == 참조변수
		myCar.model = "제네시스";
		myCar.color = "다크블루";
		myCar.speed = 60;
		myCar.start = true;
		myCar.maxSpeed = 300;

		// myCar 객체의 저장한 필드값 조회하기
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("출발여부(boolean) : " + myCar.start);
		System.out.println("최대속도(int) : " + myCar.maxSpeed);

	}

}
