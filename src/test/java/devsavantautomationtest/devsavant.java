package devsavantautomationtest;
import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class devsavant 
{

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/devsavantautomationtest/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://google.com";
        
        
    }

    @Test
    public void testDevSavantPage() throws IOException, InterruptedException 
    {
        setUp();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        utils.do_sendKeys(driver, "//input[@class='gLFyf gsfi']", "devsavant");
        utils.do_click(driver, "(//h3[@class='LC20lb MBeuO DKV0Md'])[1]");
        utils.takeScreenshot(driver);

        tearDown();
    }

    @After
    public void tearDown() 
    {
        driver.quit();

    }
  
}