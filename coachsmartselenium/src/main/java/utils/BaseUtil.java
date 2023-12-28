package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseUtil {
	
	//read data from config file
	
	public static String getConfigValue(String key) throws IOException {
		
		Properties property = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config.properties");
		property.load(file);
		
		return property.getProperty(key);
		
	}

}
