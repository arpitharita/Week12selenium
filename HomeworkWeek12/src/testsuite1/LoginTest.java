package testsuite1;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() throws InterruptedException {

        //* Enter “Admin” username
        Thread.sleep(3000);
         driver.findElement(By.name("username")).sendKeys("Admin");

        //* Enter “admin123“ password
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

        //* Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        //* Verify the ‘Dashboard’ text is display
        String actualtext = driver.findElement(By.linkText("Dashboard")).getText();
        String expectedtext = "Dashboard";
        Assert.assertEquals(actualtext,expectedtext);
    }
    @After
    public void Closebrowser(){
       // driver.quit();
    }
}
