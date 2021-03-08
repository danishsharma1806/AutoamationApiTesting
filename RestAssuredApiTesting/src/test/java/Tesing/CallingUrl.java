package Tesing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CallingUrl 
{
	public static String url() throws IOException
	{
		Properties property=new Properties();
		FileInputStream fs=new FileInputStream(".src/test/resources/Links.properties");
		property.load(fs);
		String baseurl=property.getProperty("url");
		return baseurl;
	}
}