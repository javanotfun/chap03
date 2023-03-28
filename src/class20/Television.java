package class20;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	//static 블럭(정적 블럭)
	static {
		info = company + "-" + model;
	}
}
