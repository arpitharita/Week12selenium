package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseurl);

    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        //Click on login link

        WebElement clicklogin = driver.findElement(By.linkText("Log in"));
        clicklogin.click();

        //Verify the text ‘Welcome, Please SignIn!’
        WebElement verifytext = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualtest = verifytext.getText();
        String expectedtest = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedtest,actualtest);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        //* click on the ‘Login’ link
        WebElement Login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        Login.click();

        //* Enter valid username
        WebElement validusername = driver.findElement(By.xpath("//input[@class='email']"));
        validusername.sendKeys("hari23121991@gmail.com");

        //* Enter valid password
        WebElement Password = driver.findElement(By.xpath("//input[@class='password']"));
        Password.sendKeys("Hari@2317");

        //* Click on ‘LOGIN’ button
        WebElement ClickLogin = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        ClickLogin.click();

        //* Verify the ‘Log out’ text is display
        WebElement verifytext = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualtest = verifytext.getText();
        String expectedtest = "Log out";
        Assert.assertEquals(expectedtest,actualtest);

    }
    @Test
    public void verifyTheErrorMessage(){

        //* click on the ‘Login’ link
        WebElement clicklogin = driver.findElement(By.linkText("Log in"));
        clicklogin.click();

        //* Enter invalid username
        WebElement invalidusername = driver.findElement(By.xpath("//input[@class='email']"));
        invalidusername.sendKeys("hari2312@gmail.com");

        //* Enter invalid password
        WebElement invalidPassword = driver.findElement(By.xpath("//input[@class='password']"));
        invalidPassword.sendKeys("Hari@2314");

        //* Click on Login button
        WebElement ClickLogin = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        ClickLogin.click();

        //* Verify the error message ‘Login was unsuccessful.

        //Please correct the errors and try again. No customer account found’
    }
    @After
    public void closebrowser(){
        // driver.quit();
    }
}


