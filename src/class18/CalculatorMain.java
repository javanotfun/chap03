package class18;

public class CalculatorMain {

	public static void main(String[] args) {
		//Calculator calc = new Calculator();

		int radius = 10;
		double area = Calculator.area(radius);
		System.out.printf("원의 반지름이 %d 일때 원의 넓이는 %.2f 입니다.", radius, area);
		System.out.println();
		//Calculator calc2 = new Calculator();
		radius = 20;
		area = Calculator.area(radius);
		System.out.printf("원의 반지름이 %d 일때 원의 넓이는 %.2f 입니다.", radius, area);

	}

}
