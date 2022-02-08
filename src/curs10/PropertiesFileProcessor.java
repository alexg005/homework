package curs10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	public void writePropertiesFile() throws IOException {
		
		OutputStream outputStream = new FileOutputStream("test.properties");
		
		Properties prop = new Properties();
		//definim continutul fisierului
		prop.setProperty("user", "testUser");
		prop.setProperty("email", "test@testsomething.com");
		prop.setProperty("pass", "admin123");
		//salvam fisierul
		prop.store(outputStream, "am salvat test.properties");
		System.out.println(prop);
		
	}
	
	public void readProperties(String key) throws IOException {
		InputStream inputStream =  new FileInputStream("test.properties");
		Properties prop =  new Properties();
		prop.load(inputStream);
		
		String value =  prop.getProperty(key);
		System.out.println(value);
			
	}

}