package class26.exam05;

public class Calcu02Main {

	public static void main(String[] args) {
		
		//계산기 객체 생성
		Calcu02 ca = new Calcu02();
		//오버로딩 메소드 호출
		int sum1 = ca.add(3,4);
		long sum2 = ca.add(3,4l);
		long sum3 = ca.add(3l,4);
		long sum4 = ca.add(3l,4l);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		
		int[] arr = {100,200,300};
		int sum5 = ca.add(arr);
		
		System.out.println(sum5);
	}

}
