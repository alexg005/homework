package curs8;

public class Bicicleta extends Vehicul {

	public Bicicleta(String brand, String nivelPoluare, String vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
	
	@Override
	public void detaliiVehicul() {
		System.out.println(String.format("Nivelul de poluare pentru bicicleta %s este %s si viteza medie atinsa este de %s",
			  super.getBrand(), super.getNivelPoluare(), super.getVitezaMedie()));
	}
	
	@Override
	public String motorizare() {

		return super.motorizare();
	}
	
	@Override
	public String nume() {
		
		return super.nume();
	}
}
