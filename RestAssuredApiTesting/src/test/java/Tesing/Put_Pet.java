package Tesing;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import PostBody.UserBodyPut;
import io.restassured.RestAssured;

public class Put_Pet 
{
	public static void main(String[] args) throws IOException 
	{
		Properties property=new Properties();
		FileInputStream fs=new FileInputStream("F:\\OCA\\RestAssuredApiTesting\\src\\test\\resources\\Links.properties");
		property.load(fs);
		String baseUrl=property.getProperty("url");
		RestAssured.baseURI= baseUrl;
		String reponse= given().log().all().
			header("Content-Type","application/json").
			body(UserBodyPut.putBody()).
		when().
			put("user/Manish").
		then().
			assertThat().log().all().statusCode(200).extract().response().toString();
		System.out.println(reponse);
		
		System.out.println( "------------------------------------------------------------------------");
		
		String storeResponse1=given().log().all().
			when().
				get("user/querty").
			then().
				assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(storeResponse1);
	}
}