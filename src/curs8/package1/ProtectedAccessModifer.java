package curs8.package1;

public class ProtectedAccessModifer {
	
	/**
	 * 
	 * Scopul este in acealsi packet si subclase din pachete diferite
	 * Clasele nu pot fi declarate ca protected
	 * 
	 * Same class: yes
	 * Subclass in acelasi pachet : yes
	 * Alte clase in acelasi pachet : yes
	 * 
	 * Sublcass in alt pachet : yes
	 * Alta class in alt pachet : no
	 * 
	 * 
	 */
	

	protected String unu = "unu";
	
	protected void printMesaj() {
		System.out.println("protected access");
	}
	
	
	public static void main(String[] args) {
		
		ProtectedAccessModifer obj =  new ProtectedAccessModifer();
		System.out.println(obj.unu);
		obj.printMesaj();
		
		
	}
	
	
	
}