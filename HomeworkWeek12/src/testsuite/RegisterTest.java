package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Month;

public class RegisterTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){

        //* click on the ‘Register’ link
        WebElement ClickRegister = driver.findElement(By.xpath("//a[@class='ico-register']"));
        ClickRegister.click();

        //* Verify the text ‘Register’
        WebElement verifytext = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualtest = verifytext.getText();
        String expectedtest = "Register";
        Assert.assertEquals(expectedtest,actualtest);

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){

        //* click on the ‘Register’ link
        WebElement ClickRegister = driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a"));
        ClickRegister.click();

        //* Select gender radio button
        WebElement ClickOnFemale = driver.findElement(By.xpath("//div[@id='gender']/span[1]"));
        ClickOnFemale.click();

        WebElement ClickOnMale = driver.findElement(By.xpath("//div[@id='gender']/span[2]"));
        ClickOnMale.click();

        //* Enter First name
       WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
       FirstName.sendKeys("hari");

        //* Enter Last name
        WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        LastName.sendKeys("patel");

        //* Select Day Month and Year
        WebElement SelectDay = driver.findElement(By.xpath("//div[@class='inputs date-of-birth']/div /select[1]"));
        SelectDay.sendKeys("11");

        WebElement SelectMonth = driver.findElement(By.xpath("//div[@class='inputs date-of-birth']/div /select[2]"));
        SelectMonth.sendKeys("12");

        WebElement SelectYear = driver.findElement(By.xpath("//div[@class='inputs date-of-birth']/div /select[3]"));
        SelectYear.sendKeys("1991");

        //* Enter Email address
        WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
        Email.sendKeys("hari23121991@gmail.com");

        //* Enter Password
        WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
        Password.sendKeys("Hari@2317");

        //* Enter Confirm password
        WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        ConfirmPassword.sendKeys("Hari@2317");

        //* Click on REGISTER button
        WebElement Register = driver.findElement(By.xpath("//button[@name='register-button']"));
        Register.click();

        //* Verify the text 'Your registration completed’
        WebElement verifytext = driver.findElement(By.xpath("//div[@class='result']"));
        String actualtest = verifytext.getText();
        String expectedtest = "Your registration completed";
        Assert.assertEquals(expectedtest,actualtest);


    }
    @After
    public void closebrowser(){
       //  driver.quit();
    }
}
