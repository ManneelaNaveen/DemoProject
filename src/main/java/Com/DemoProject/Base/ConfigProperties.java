package Com.DemoProject.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

	private static Properties prop;

	static {
		try {

			// load the properties files

			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/test/resources/Config.properties");
			prop.load(fis);

			// Close the file input stream to avoid resource leaks

			fis.close(); 
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load configuration file.");
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}

