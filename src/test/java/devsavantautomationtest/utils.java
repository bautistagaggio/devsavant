package devsavantautomationtest;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import junit.framework.Assert;

public class utils {

    // SERVICES //
    public static void establishConnection(HttpURLConnection connection) throws ProtocolException 
    {
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
    }

    public static void AssertEqual (Integer expectedCode, Integer actualCode, String expectedContent, String actualContent)
    {
        try {
            Assert.assertEquals(expectedCode, actualCode);
            Assert.assertEquals(expectedContent, actualContent);    
        } catch (AssertionError e) {
            System.out.println("Test failed");
            throw e;
        }
        System.out.println("Test passed");
    }

    // UI RELATED //
    public static void do_click(WebDriver driver, String locator)
    {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
       
    }

    public static void do_sendKeys(WebDriver driver, String locator, String keys)
    {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        WebElement element = driver.findElement(By.xpath(locator));
        element.clear();
        element.sendKeys(keys);
        element.submit();
       
    }

    public static void takeScreenshot(WebDriver driver) throws IOException, InterruptedException
    {
        Thread.sleep(4000);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots/devsavant.png"));

        System.out.print("Screenshot taken");
    }
    
}
