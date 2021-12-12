package homeWorkAbs;



public class Mobile {
	String brand;
	int price;
	
	
	Mobile(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	String getDetails() {
		return "brand: " + this.brand + ", price: " + this.price;
	}
}

