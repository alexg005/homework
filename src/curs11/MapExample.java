package curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		boolean isEmpty = map.isEmpty();
		System.out.println("Map is empty ? : " + isEmpty);
		System.out.println("Size of the map is : " + map.size());

		map.put("T", "Tester");
		map.put("M", "Manager");
		map.put("D", "Developer");
		map.put("P", "ProductOwner");

		boolean checkKey = map.containsKey("X");
		System.out.println("contains key X : " + checkKey);

		boolean checkValue = map.containsValue("Developer");
		System.out.println("contains value :" + checkValue);

		System.out.println("-------------------------------------");

		for (String key : map.keySet()) {
			System.out.println(key);
		}

		System.out.println("-------------------------------------");

		for (String value : map.values()) {
			System.out.println(value);
		}

		System.out.println("-------------------------------------");

		System.out.println(map.get("M"));

		map.remove("M");

		for (String value : map.values()) {
			System.out.println(value);
		}

		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");

		for (String key : map.keySet()) {
			System.out.println(key);
		}

	}

}