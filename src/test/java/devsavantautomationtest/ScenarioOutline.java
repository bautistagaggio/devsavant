package devsavantautomationtest;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ScenarioOutline {
    
    private static HttpURLConnection connection;
    @Test
    public void testInvalidRegion() {
        
        try {
        URL url = new URL ("https://worldtimeapi.org/api/timezone/Ameri/Bogota "); 
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
    
    @Test
    public void testInvalidCity() 
    {
        
        try {
        URL url = new URL ("https://worldtimeapi.org/api/timezone/America/Bogot"); 
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
