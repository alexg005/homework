package curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExempluArrayList2 {
	
	
	public static void main(String[] args) {
		
		//obiect[] array = new Obiect[3]
		//obiect[] array =  {"unu"....}
		
		
		List<String> arrayList = new ArrayList<>(Arrays.asList("zero", "unu", "doi", "trei", "patru", "cinci"));
			
		arrayList.add("sase");	
		
		for(String nr : arrayList) {
			System.out.println(nr);	
		}
		
		System.out.println("-------------------------------------");
		
		//removed range
		arrayList.subList(1, 4).clear();
		
		for(String nr : arrayList) {
			System.out.println(nr);	
		}
		
		System.out.println("-------------------------------------");
		
		//contains element	
		String element = "doi";
		if(arrayList.contains(element)) {
			System.out.println(element + " se afla in lista!");
		}else {
			System.out.println(element + " nu se afla in lista!");
		}
		System.out.println("-------------------------------------");

		//update
		arrayList.set(0, "opt");
		//System.out.println(arrayList.get(0));
		
		for(String nr : arrayList) {
			System.out.println(nr);	
		}
		
		System.out.println("-------------------------------------");

		Iterator<String> iterator = arrayList.iterator();
	//	System.out.println(iterator.next());
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
	}
	
	

}