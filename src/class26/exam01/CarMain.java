package class26.exam01;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.maker = "현대차";
		myCar.model = "그랜져";
		myCar.cc = 2000;
		myCar.color = "white";
		myCar.price = 999;
		myCar.maxSpeed = 250;
		myCar.speed = 120;

		System.out.println(myCar.maker);
		System.out.println(myCar.model);
		System.out.println(myCar.cc);
		System.out.println(myCar.color);
		System.out.println(myCar.price);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);

		Car myCar2 = new Car("기아차", "k9", 3000, "black", 955, 300, 150);

		System.out.println();
		System.out.println(myCar2.maker);
		System.out.println(myCar2.model);
		System.out.println(myCar2.cc);
		System.out.println(myCar2.color);
		System.out.println(myCar2.price);
		System.out.println(myCar2.maxSpeed);
		System.out.println(myCar2.speed);
		System.out.println();

		myCar.showCarInfo();
		System.out.println();
		myCar2.showCarInfo();

	}

}
