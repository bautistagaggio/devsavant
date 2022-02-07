package devsavantautomationtest;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
// import org.junit.Test;
// import org.json.simple.JSONObject;
// import org.json.simple.parser.JSONParser;
// import org.json.simple.parser.ParseException;

public class Worldtimeapi 
{
    private static HttpURLConnection connection;
    private String baseUrl;

    @Test
    public void testGeneralEndpoint() {
        
        try {
        URL url = new URL ("http://worldtimeapi.org/api/timezo"); 
        connection = (HttpURLConnection) url.openConnection();

        utils.establishConnection(connection);

        int status = connection.getResponseCode();
        String content = connection.getResponseMessage();
        
        utils.AssertEqual(404, status, "Not Found", content);
        System.out.println(status);
        System.out.println(content);

        } catch(MalformedURLException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();   

        } finally{
            connection.disconnect();
        }

    }    

    
           
}



//     public static void masin(String[] args) {
        
//         HttpClient client = HttpClient.newHttpClient();
//         HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://worldtimeapi.org/api/timezone")).build();
//         client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                     .thenApply(t -> t.body())
//                     .thenAccept(System.out::println)
//                     .join();   
        


//     }


