package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest
{
    //public String baseUrl;
    public WebDriver driver;


    public void openBrowser(String baseUrl)
    {
        driver = new ChromeDriver(); // set up the browser
        driver.get(baseUrl); // set up the URL
        driver.manage().window().maximize(); // maximising the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // giving the implicit wait

    }

    public void closeBrowser()
    {
        driver.close(); // closing the browser
    }


}
