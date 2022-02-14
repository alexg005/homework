package curs11;

import java.util.ArrayList;
import java.util.List;

public class ExempluArrayList {
	
	
	public static void main(String[] args) {
		
		//Obiect arr[] = new Obiect[6]
		
		List<String> list =  new ArrayList<>();
		System.out.println(list.size());

		//add element to array list
		list.add("oana");
		list.add("ion");
		list.add("gabriel");
		list.add("maria");
		
		System.out.println("Print array list size :");
		System.out.println(list.size());
		
		list.add("carmen");
		
		for(String nume : list) {
			//System.out.println((index++) + " : " + nume);
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");

		list.add(4, "John");
		
		for(String nume : list) {
			//System.out.println((index++) + " : " + nume);
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		
		//get elements by index
		System.out.println("get element at index : " + list.get(2));
		
		
		//display all element
		int index = 0;
		for(String nume : list) {
			System.out.println((index++) + " : " + nume);
			//System.out.println(list.indexOf(nume));
			
		}

				
		System.out.println("--------------------------------------------");
	
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		
	//	System.out.println("index 5" + list.get(5));
		
		list.add(5, "tara");
		
		
		for(String nume : list) {
			//System.out.println((index++) + " : " + nume);
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		
		list.add("mara");
		
		for(String nume : list) {
			//System.out.println((index++) + " : " + nume);
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		
		System.out.println("--------------------------------------------");

		//remove
		list.remove("mara");
		list.remove(0);
		
		for(String nume : list) {
			//System.out.println((index++) + " : " + nume);
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		System.out.println("--------------------------------------------");

		//remove all element
		list.clear();
		
		for(String nume : list) {
			//System.out.println((index++) + " : " + nume);
			System.out.println(list.indexOf(nume) + " : " + nume);
			
		}
		
		
	}
	

}