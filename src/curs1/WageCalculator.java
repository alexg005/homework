package curs1;

public class WageCalculator {

	int nrOreLucrate = 40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester tester1 = new Tester();
		tester1.setNume("Oana");
		tester1.setRatePerHour(40);
		tester1.setAge(25);
		
		Tester tester2 = new Tester();
		tester2.setNume("Maria");
		tester2.setRatePerHour(25);
		tester2.setAge(30);
		
		WageCalculator calc = new WageCalculator();
		
		System.out.println(tester1.getNume() + " -> salariu: " + calc.calculateSalary(tester1.getRatePerHour()) 
		+  "\n" + tester2.getNume());
		System.out.println(tester1.getNume() + " are: " + tester1.getAge());
		System.out.println(tester2.getNume() + " are: " + tester2.getAge());
	}
	
	public int calculateSalary(int rateHourly) {
		int salary = nrOreLucrate * rateHourly;
		return salary;
	}
}
