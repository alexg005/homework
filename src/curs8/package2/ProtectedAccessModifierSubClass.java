package curs8.package2;

import curs8.package1.ProtectedAccessModifer;

public class ProtectedAccessModifierSubClass extends ProtectedAccessModifer {
	
	public static void main(String[] args) {
		
		ProtectedAccessModifierSubClass obj = new ProtectedAccessModifierSubClass();
		System.out.println(obj.unu);
		obj.printMesaj();
		
		
	}
	

}