package UtilityPacjages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtility {
	
	
	
	public String systemLogin( String Key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Commondata.Properties.txt");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(Key);
		return data;
		

	}

}
