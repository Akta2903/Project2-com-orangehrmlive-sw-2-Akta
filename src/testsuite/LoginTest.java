package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest
{
    public String baseUrl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setBaseUrl()
    {
        openBrowser(baseUrl); // setting up the url
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        // finding  the username and password elements and entering the respective values
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        //verifying user is logged in successfully or not by verifying the text displayed on the page
        String expectedMessage = "Dashboard";
        WebElement actualMessage  = driver.findElement(By.xpath("//h6[contains(@class,'oxd-text')]"));
        String actualMessageText= actualMessage.getText();

        Assert.assertEquals("User is not logged in successful",expectedMessage,actualMessageText);

    }

    @After
    public void tearDown()
    {
        closeBrowser(); // closing the browser
    }
}
