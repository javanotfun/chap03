package class26.exam05;

public class Calcu03 {
	// 정수 평균을 구하는 메소드

	// 덧셈(정수) 메소드
	public int sum(int x, int y) {
		return x + y;
	}

	// 덧셈(실수) 메소드
	public double sum(double x, double y) {
		return x + y;

	}

	public double avg(int x, int y) {
		int sum = 0;
		double avg = 0.0;
		sum = sum(x,y);
		avg = (double) sum / 2;
		return avg;
	}

	// 실수 평균 구하는 메소드
	public double avg(double x, double y) {
		double sum = 0.0;
		double avg = 0.0;
		sum = sum(x,y);
		avg = (double) sum / 2;
		return avg;
	}

	// 정수 평균을 구하기 위해서 외부에서 호출되는 메소드
	public void execute(int x, int y) {
		double avg = 0.0;
		avg = avg(x, y);
		System.out.println(x + "+" + y + "평균은" + avg);
	}

	// 실수 평균을 구하기 위해서 외부에서 호출되는 메소드
	public void execute(double x, double y) {
		double avg = 0.0;
		avg = avg(x, y);
		System.out.println(x + "+" + y + "평균은" + avg);
	}
}
