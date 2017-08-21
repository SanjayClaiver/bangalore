import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ParseJSON {
	
	public static final String JSON_FILE = "F://test//abc.txt";


	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new FileReader(JSON_FILE));

        Gson gson = new GsonBuilder().create();
        
        Pojo pojo = gson.fromJson(br,Pojo.class);
        
       String s=   pojo.Response.MetaInfo.Timestamp;
     
        System.out.println(s);
        
        br.close();

		

		
	} 

	
}
