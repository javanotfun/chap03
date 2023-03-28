package class26.exam05;

public class Calcu01Main {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		double x1 = 10.5;
		double y1 = 20.0;

		// 계산기 객체 생성
		Calcu01 ca = new Calcu01();
		// 정수 합산
		int intSum = ca.sum(x, y);
		// 실수 합산
		double doubleSum = ca.sum(x1, y1);

		System.out.println(intSum);
		System.out.println(doubleSum);
	}

}
