package curs8;

public class Masina extends Vehicul {

	public Masina(String brand, String nivelPoluare, String vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
	
	@Override
	public void detaliiVehicul() {
		System.out.println(String.format("Nivelul de poluare pentru masina %s este %s si viteza medie atinsa este de %s",
			  super.getBrand(), super.getNivelPoluare(), super.getVitezaMedie()));
	}
	
	@Override
	public String motorizare() {

		return "Motorizare: Benzina/Motorina";
	}
	
	@Override
	public String nume() {

		return String.format("Nume: %s", super.getBrand());
	}
}
