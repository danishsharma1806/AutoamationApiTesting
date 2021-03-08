package Tesing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class demo 
{
	public static void main(String sd[]) throws IOException
	{
		Properties property=new Properties();
		FileInputStream fs=new FileInputStream("F:\\OCA\\RestAssuredApiTesting\\src\\test\\resources\\Links.properties");
		property.load(fs);
		System.out.println(property.getProperty("url"));
	}
}