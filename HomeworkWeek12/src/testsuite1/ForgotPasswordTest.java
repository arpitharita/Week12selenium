package testsuite1;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {

        //click on the ‘Forgot your password’ link
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        Thread.sleep(3000);
        String actualtext = driver.findElement(By.xpath("//button[@type='submit']")).getText();
        String expectedtext= "Reset Password";
        Assert.assertEquals(actualtext, expectedtext);

        //* Verify the text ‘Reset Password’
    }
    @After
    public void Closebrowser(){
        // driver.quit();
    }
}
