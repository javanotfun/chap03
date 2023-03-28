package class26.exam02;

public class Product {
	public int id;
	public String name;
	public int price;
	public int quantiry;
	public int amount;

	public Product() {
	}

	public Product(int id, String name, int price, int quantiry) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantiry = quantiry;
	}

	public int getAmount() {
		return this.price * this.quantiry;
	}

	public void showCarInfo() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quantiry);
		System.out.println(this.getAmount());

	}
}
