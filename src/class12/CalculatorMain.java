package class12;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator myCom = new Calculator();
		
		int result1 = myCom.sum(1,2,3,4,5);
		System.out.println("다수의 숫자 덧셈 결과 :" + result1);
		
		int[] values = {1,2,3,4,5};
		int result2 = myCom.sum(values);
		System.out.println("배열값 덧셈 결과 : " + result2);
	}

}
