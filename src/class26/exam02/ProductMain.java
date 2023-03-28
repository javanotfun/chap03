package class26.exam02;

public class ProductMain {

	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.id = 202103001;
		pro1.name = "냉장고";
		pro1.price = 500;
		pro1.quantiry = 5;
		pro1.showCarInfo();
		System.out.println();

		Product pro2 = new Product(202103001, "냉장고", 500, 5);

		pro2.showCarInfo();
		System.out.println();

		Product pro3 = new Product(202103001, "세탹기", 250, -15);

		pro3.showCarInfo();

	}

}
