package class06;

public class Car {
	// 필드 (멤버변수)
	String model;
	String color;
	int speed;
	boolean start;

	// 기본 생성자 : 필드값 초기화
	public Car() {
	}

	// 오버로딩 생성자 #1
	public Car(String mo) {
		model = mo;
	}

	// 오버로딩 생성자 #2
	public Car(String model, String color) {
	this.model = model;
	this.color = color;
	}

	// 오버로딩 생성자 #3
	public Car(String mo, String co, int sp) {
		model = mo;
		color = co;
		speed = sp;
	}

	// 오버로딩 생성자 #3
	public Car(String mo, String co, int sp, boolean st) {
		model = mo;
		color = co;
		speed = sp;
		start = st;
	}
}
