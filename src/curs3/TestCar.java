package curs3;

public class TestCar {

	public static void main(String[] args) {
		
		Car car1 = new Car("Kia", "3.3L");
		System.out.println(car1.carDetails());
		
		Car  car2 = new Car("VW", "1.9L (TDI, ALH!)");
		car2.setType("sedan");
		System.out.println(car2.carDetails());
		System.out.println(car1.carDetails());
	}

}
