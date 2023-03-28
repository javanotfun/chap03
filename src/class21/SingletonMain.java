package class21;

public class SingletonMain {

	public static void main(String[] args) {
// Singleton obj1 = Singleton.Singleton(); / 컴파일에러
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");

		}
	}

}
