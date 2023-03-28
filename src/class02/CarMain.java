package class02;

public class CarMain {

	public static void main(String[] args) {

		Car myCar = new Car(); //new 연산자 객체생성할때 사용
		
		myCar.color = "빨간색";
				
		System.out.println("자동차의 색상은 : " + myCar.color + "입니다."); //도트 연산자
	}

}
