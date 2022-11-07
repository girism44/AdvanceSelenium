package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writedata {

	public static void main(String[] args) throws IOException {
		
		//convert the physical file into java readable file
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
	//create an object for properties file
		Properties p = new Properties();
		//load the properties file
		p.load(fis);
		//To  write the data
		p.put("url", "https://www.facebook.com");
		//save the data in properties file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commonData.properties");
		
		p.store(fos, "file updated successfully");
	
	}
}
