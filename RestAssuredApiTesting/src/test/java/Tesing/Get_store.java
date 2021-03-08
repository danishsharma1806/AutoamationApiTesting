package Tesing;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;

public class Get_store 
{
	public static void main(String[] args) throws IOException 
	{
		Properties property=new Properties();
		FileInputStream fs=new FileInputStream("F:\\OCA\\RestAssuredApiTesting\\src\\test\\resources\\Links.properties");
		property.load(fs);
		String baseUrl=property.getProperty("url");
		RestAssured.baseURI= baseUrl;
		String storeResponse=given().log().all().
			when().
				get("store/inventory").
			then().
				assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(storeResponse);
		
	}
}