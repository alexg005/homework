package curs3;

public class Car {
static String brand;
static String type;
public static String getType() {
	return type;
}

public static void setType(String type) {
	Car.type = type;
}

static String engine;

	public Car(String brand, String engine) {
		this.brand = brand;
		this.engine = engine;
		this.type = "SUV";
	}
	
	static String carDetails() {
		String details = "All " + brand + " cars are " + engine + " and are of type " + type;
		return details;
	}
}
