package curs8;

public class Vehicul {

	private String brand;
	public String getBrand() {
		return brand;
	}

	public String getNivelPoluare() {
		return nivelPoluare;
	}

	public String getVitezaMedie() {
		return vitezaMedie;
	}

	private String nivelPoluare;
	private String vitezaMedie;

	public String nume() {
		return "";
	}

	public String motorizare() {
		return "";
	}

	public void detaliiVehicul() {
		System.out.println(String.format("Nivelul de poluare pentru masina %s este %s si viteza medie atinsa este de %s",
						brand, nivelPoluare, vitezaMedie));
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setNivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}
	
	public void setVitezaMedie(String vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
}
