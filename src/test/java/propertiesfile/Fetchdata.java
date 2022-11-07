package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetchdata {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
	
		Properties p = new Properties();
		
		p.load(fis);//uses hashtable to store the data
		
		String username=p.getProperty("username");
		
		System.out.println(username);
		
		String password=p.getProperty("password");
		
		System.out.println(password);
	
		String browser = p.getProperty("browser");
		
		System.out.println(browser);
	}

}
