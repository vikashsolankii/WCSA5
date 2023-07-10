package readpropertydata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
	
    // read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		
		//making file ready to read
		prop.load(fis);
		//String data = prop.getProperty("Browser");
		//System.out.println(data);
		//String data = prop.getProperty("Url");
		//System.out.println(data);
		//String data = prop.getProperty("Username");
		//System.out.println(data);
		
		//reading data from config.properties
		String data = prop.getProperty("Password");
		System.out.println(data);




	}

}
