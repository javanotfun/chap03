package class26.exam04;

public class StudentMain {

	public static void main(String[] args) {
		Student[] stu = new Student[5];
		stu[0] = new Student("김홍철", 23, "남", "010-2340-1233", 85);
		stu[1] = new Student("정순미", 24, "여", "010-9857-7532", 70);
		stu[2] = new Student("이만섭", 22, "남", "010-6548-4687", 96);
		stu[3] = new Student("최주호", 20, "남", "010-2528-9368", 85);
		stu[4] = new Student("고미림", 26, "여", "010-1068-2549", 77);

		System.out.println("===============================================");

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].name + stu[i].age + stu[i].gender + stu[i].phone + stu[i].score);
		}
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < stu.length; i++) {
			sum = sum + stu[i].score;
			avg = (sum * 1.0) / stu.length;
		}
		System.out.println("총인원 :" + stu.length);
		System.out.printf("평균점수  : %.2f \n", avg);

		int max = 0;
		String maxName = "";
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].score > max) {
				max = stu[i].score;
				maxName = stu[i].name;

			}
			
			
			System.out.println("최고점수 " + max + " 최고학생 " + maxName);
			System.out.println();
			
			for (Student std : stu) {
				System.out.println(std.showStudentInfo());
			}

		}

	}

}
