package class12;

public class Calculator {
//가변길이 매개변수를 갖는 메소드 선언
	int sum(int ...values) {
		//가변길이 매게변수를 갖는 메소드 선언
		int sum = 0;
		
		for (int i = 0; i < values.length; i++) {
			sum +=values[i];
			
		}
		
		return sum;
	}
}
