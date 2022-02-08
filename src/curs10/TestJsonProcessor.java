package curs10;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws ParseException {

		JsonProcessor jsonPorcessor = new JsonProcessor();
		
	//	jsonPorcessor.writeJsonFile();
		
		jsonPorcessor.readJsonFile();
		
	}

}