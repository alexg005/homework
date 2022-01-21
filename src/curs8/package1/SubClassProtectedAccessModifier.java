package curs8.package1;

public class SubClassProtectedAccessModifier  extends ProtectedAccessModifer{
	
	//Subclass in acelasi pachet : yes
	
	
	public static void main(String[] args) {
		
		SubClassProtectedAccessModifier obj =  new SubClassProtectedAccessModifier();
		System.out.println(obj.unu);
		obj.printMesaj();
		
	}
	
	

}