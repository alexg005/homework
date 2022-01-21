package curs8.package1;

class DefaultAccessModifier {
	
	/**
	 * daca nu mentionam niciun acces modifer se considera default
	 * 
	 * Scopul lui este limitat la packetul in care se afla
	 * 
	 * Same class : yes
	 * Subclass in acleasi pachet: yes 
	 * Alta clasa in acelasi pachet : yes
	 * 
	 * Sublacasa in alt pachet : nu
	 * Alta clasa in alt pachet : nu
	 * 
	 * 
	 */
	
	
	String mesaj;
	
	
	void printMesaj() {
		
		System.out.println("Default modifier");
	}
	
	
	public static void main(String[] args) {
		
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.printMesaj();
		
	}

}