package curs10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@SuppressWarnings("deprecation")
public class JsonProcessor {

	@SuppressWarnings({ "unchecked" })
	public void writeJsonFile() {

		JSONObject obj = new JSONObject();
		obj.put("name", "testUser");

		JSONArray list = new JSONArray();
		list.add("Obiect 1");
		list.add("Obiect 2");
		list.add("Obiect 3");
		list.add("Obiect 4");

		obj.put("listaObiecte", list);

		try (FileWriter file = new FileWriter("test.json")) {
			file.write(obj.toJSONString());

		} catch (IOException e) {
			System.out.println("AN error occured");
			e.printStackTrace();
		}
		System.out.println(obj);
	}

	@SuppressWarnings({ "unchecked" })
	public void readJsonFile() throws ParseException {
		JSONParser parser = new JSONParser();

		try {

			Reader reader = new FileReader("test.json");
			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			// System.out.println(jsonObject);

			String key = (String) jsonObject.get("name");
			System.out.println(key);

			JSONArray obj = (JSONArray) jsonObject.get("listaObiecte");
			Iterator<String> it = obj.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}