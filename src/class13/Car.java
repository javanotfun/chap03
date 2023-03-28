package class13;

public class Car {
	// 필드 선언
	int gas;

	// 주유 메소드(리턴값이 없는 메소드로 매개값을 받아서 gas 필드에 저장)
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false; // false를 리턴하고 메소드 종료
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴하고 메소드 종료
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
				return; //메소드 종료
			}
		}

	}
}
