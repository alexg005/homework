package curs8;

public class HomeWork {

	public static void main(String[] args) {
		
		Bicicleta b = new Bicicleta("Pegas", "0", "5 km/h");
		
		b.detaliiVehicul();
		
		Masina m = new Masina("Dacia", "3", "90 km/h");
		
		m.detaliiVehicul();
		
		verificaMotorizarea(b);
		verificaMotorizarea(m);
	}
	
	private static void verificaMotorizarea(Vehicul vehicul) {
		System.out.println(vehicul.nume());
		System.out.println(vehicul.motorizare());
	}

}
