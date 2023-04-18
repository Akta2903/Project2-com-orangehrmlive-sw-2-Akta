package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest
{
    public String baseUrl="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setBaseUrl()
    {
        openBrowser(baseUrl); // setting up the url
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {
        //finding the elements and verifying them
        driver.findElement(By.xpath("//p[@class ='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        String expectedMessage="Reset Password";
        WebElement actualMessage= driver.findElement(By.xpath("//h6[contains(@class,'oxd-text oxd')]"));
        String actualMessageText = actualMessage.getText();

        Assert.assertEquals("User is not navigated to Reset Password Page",expectedMessage,actualMessageText);
    }
    @After
    public void tearDown()
    {
        closeBrowser(); // closing the browser
    }
}
