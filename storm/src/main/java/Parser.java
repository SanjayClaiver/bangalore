import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Parser {
	
	public static final String JSON_FILE = "F://test//abc.txt";


	public static void main(String[] args) throws Exception  {

		JsonParser jsonParser = new JsonParser();
		JsonObject address = jsonParser.parse(JSON_FILE)
		    .getAsJsonObject().get("Response")
		    .getAsJsonObject().getAsJsonArray("View").get(0)
		    .getAsJsonObject().getAsJsonArray("Result").get(0)
		    .getAsJsonObject().get("Location")
		    .getAsJsonObject().getAsJsonObject("Address");
		String postalCode = address.get("PostalCode").getAsString();

      System.out.println(postalCode);

		
	}

}
