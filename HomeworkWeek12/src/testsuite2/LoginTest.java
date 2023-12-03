package testsuite2;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseurl = "http://the-internet.herokuapp.com/login";
    @Before
    public void setup(){
        openBrowser(baseurl);

    }
    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials() throws InterruptedException {

        //* Enter “tomsmith” username
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");

        //* Enter “SuperSecretPassword!” password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
        Thread.sleep(500);

        //* Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        Thread.sleep(3000);

        //* Verify the text “Secure Area”
        String actualtext = driver.findElement(By.xpath("//div[@class='example']")).getText();
        String expectedtext ="Secure Area\n" +
                "Welcome to the Secure Area. When you are done click logout below.\n" +
                "Logout";
        Assert.assertEquals(expectedtext,actualtext);
        Thread.sleep(5000);

    }
    @Test
    public void verifyTheUsernameErrorMessage() throws InterruptedException {

        //* Enter “tomsmith1” username
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith1");

        //* Enter “SuperSecretPassword!” password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");

        //* Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        Thread.sleep(3000);

        //* Verify the error message “Your username
        String actualtest  = driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        Thread.sleep(3000);
        String expectedtest = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(expectedtest,actualtest);
    }
    @Test
    public void verifyThePasswordErrorMessage() throws InterruptedException {
        //* Enter “tomsmith” username
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");

        //* Enter “SuperSecretPassword” password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword");

        //* Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        Thread.sleep(3000);

        //* Verify the error message “Your password is invalid!”
        String actualtest  = driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        Thread.sleep(3000);
        String expectedtest = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(expectedtest,actualtest);
    }
    @After
    public void closebrowser(){
       // driver.quit();
    }
}
