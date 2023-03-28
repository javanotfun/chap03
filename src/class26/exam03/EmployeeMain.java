package class26.exam03;

public class EmployeeMain {

	public static void main(String[] args) {
		// 1. 빈객체 생성
		Employee em = new Employee();
		// 1.1 빈객체의 필드에 값저장
		em.empNo = 2005031002;
		em.eName = "배준섭";
		em.position = "과장";
		em.salary = 500;

		System.out.println(em.empNo);
		System.out.println(em.eName);
		System.out.println(em.position);
		System.out.println(em.salary);
		System.out.println();

		Employee em2 = new Employee(2021010003, "김홍철", "사원", -250); // 오버로딩 생성자 활용객체 파라미터에넣음
		System.out.println(em2.empNo);
		System.out.println(em2.eName);
		System.out.println(em2.position);
		System.out.println(em2.salary);
		System.out.println();

		// 3.객체 배열
		System.out.println("객체 배열을 통한 사원 정보 조회");

		Employee[] emps = new Employee[3];
		emps[0] = new Employee(202301001, "김수희", "대리", 310);
		emps[1] = new Employee(202301001, "백미선", "사원", 280);
		emps[2] = new Employee(202301001, "최무림", "과장", 400);

		System.out.println(emps[0].empNo + " " + emps[0].eName + " " + emps[0].position + " " + emps[0].salary);
		System.out.println(emps[1].empNo + " " + emps[1].eName + " " + emps[1].position + " " + emps[1].salary);
		System.out.println(emps[2].empNo + " " + emps[2].eName + " " + emps[2].position + " " + emps[2].salary);
		System.out.println();

		// for

		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].empNo + " " + emps[i].eName + " " + emps[i].position + " " + emps[i].salary);

		}
		System.out.println();

		// 향상된 for 문
		for (Employee i : emps) {
			System.out.println(i.empNo + " " + i.eName + " " + i.position + " " + i.salary);
		}
		System.out.println();
		// 전 사원들의 급여 총액
		int sum = 0;
		for (Employee i : emps) {
			sum = sum + i.salary;
		}
		System.out.println("전사원의 급여 " + sum);

	}
}
