package ObjectAccess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ObjectReader {

	//public static void main(String[] args) {
	public static Properties getProperties() throws IOException	
	{
		Properties prop = new Properties();
		try
		{
			FileInputStream fs =new FileInputStream("E:\\Java And Selenium Setup\\Code\\HybridFramework\\src\\object.properties");
				
			prop.load(fs);
				
			//System.out.println(prop.getProperty("url"));
		//	System.out.println(prop.stringPropertyNames());
			
		}
		catch (Exception e) {
						
		}
		return prop;
	}

}
