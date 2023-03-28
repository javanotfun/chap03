package class26.exam05;

public class Calcu04 {
	public int[] tenPlus(int[] arr) {
		arr[0] = arr[0] + 10;
		arr[1] = arr[1] + 10;
		arr[2] = arr[2] + 10;
		arr[3] = arr[3] + 10;
		arr[4] = arr[4] + 10;
		return arr;
	}

	// [오버로딩 메소드] 파라미터에 전달된 double 배열의 요소에 +10해서 반환
	public double[] tenPlus(double[] arr) {
		arr[0] = arr[0] + 10;
		arr[1] = arr[1] + 10;
		arr[2] = arr[2] + 10;
		arr[3] = arr[3] + 10;
		arr[4] = arr[4] + 10;
		return arr;
	}
}
