package curs10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesCheck {

	public boolean readFile(String leguma) throws IOException {
		InputStream inputStream =  new FileInputStream("calorii.txt");
		Properties prop =  new Properties();
		prop.load(inputStream);
		
		boolean found = prop.containsKey(leguma);
		if(found) {
			System.out.println(prop.getProperty(leguma));
			return true;
		} else {
			System.out.println("Nu vindem aceasta leguma!");
			return false;
		}
		

	}
	
}
