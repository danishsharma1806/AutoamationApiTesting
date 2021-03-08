package PostBody;

public class StoreBodyPost 
{
	public static String body()
	{
		return "{\r\n" + 
				"    \"id\": 1,\r\n" + 
				"    \"petId\": 0,\r\n" + 
				"    \"quantity\": 0,\r\n" + 
				"    \"shipDate\": \"2021-03-08T06:19:01.174+0000\",\r\n" + 
				"    \"status\": \"placed\",\r\n" + 
				"    \"complete\": true\r\n" + 
				"}";
	}
}