package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseurl);

    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //* click on the ‘Computers’ Tab
        WebElement ClickComputer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a"));
        ClickComputer.click();

        //* Verify the text ‘Computers’
        WebElement Verifytext = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Computers";
        Assert.assertEquals(actualtext,expectedtext);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        //* click on the ‘Electronics’ Tab
        WebElement ClickElectronics = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a"));
        ClickElectronics.click();

        //* Verify the text ‘Electronics’
        WebElement Verifytext = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Electronics";
        Assert.assertEquals(actualtext,expectedtext);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        //* click on the ‘Apparel’ Tab
        WebElement ClickApparel = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a"));
        ClickApparel.click();

        //* Verify the text ‘Apparel’
        WebElement Verifytext = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Apparel";
        Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //* click on the ‘Digital downloads’ Tab
        WebElement ClickDigitaldownload = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a"));
        ClickDigitaldownload.click();

        //* Verify the text ‘Digital downloads’
        WebElement Verifytext = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Digital downloads";
        Assert.assertEquals(actualtext,expectedtext);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        //* click on the ‘Books’ Tab
        WebElement ClickBook = driver.findElement(By.linkText("Books"));
        ClickBook.click();

        //* Verify the text ‘Books’
        WebElement Verifytext = driver.findElement(By.linkText("Books"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Books";
        Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //* click on the ‘Jewelry’ Tab
        WebElement ClickJewelry = driver.findElement(By.linkText("Jewelry"));
        ClickJewelry.click();

        //* Verify the text ‘Jewelry’
        WebElement Verifytext = driver.findElement(By.linkText("Jewelry"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Jewelry";
        Assert.assertEquals(actualtext,expectedtext);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //* click on the ‘Gift Cards’ Tab
        WebElement ClickGiftcard = driver.findElement(By.linkText("Gift Cards"));
        ClickGiftcard.click();

        //* Verify the text ‘Gift Cards’
        WebElement Verifytext = driver.findElement(By.linkText("Gift Cards"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Gift Cards";
        Assert.assertEquals(actualtext,expectedtext);
    }

    @After
    public void closebrowser(){
        // driver.quit();
    }
}
