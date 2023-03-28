package class07;

public class KoreanMain {

	public static void main(String[] args) {

		Korean person = new Korean("홍길동", "123456-7892837");
		Korean person2 = new Korean("김철수", "951206-4687248");
		System.out.println("국적 : " + person.nation );
		System.out.println("성명 : " + person.name );
		System.out.println("주민번호 : " + person.ssn );
		System.out.println();
		System.out.println("국적 : " + person2.nation + "\n성명 : " +person2.name + "\n주민번호 : " +person2.ssn);
	}

}
