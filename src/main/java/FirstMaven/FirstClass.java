package FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FirstClass {

    protected static WebDriver driver;

    public String generateEmail(String startValue) {
        String email = startValue.concat(new Date().toString());
        // your code
        return email;
    }

    public static String randomDate() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
        return format.format(new Date());
    }



   @BeforeMethod
    public void test5() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");

        //Open the Browser
        driver = new ChromeDriver();
        //Maximise the Browser window screen
        driver.manage().window().fullscreen();
        //Set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {


        //Open the website
        driver.get("https://demo.nopcommerce.com/");
        //Click on Register Button
        driver.findElement(By.linkText("Register")).click();
        //Enter First Name
        driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("Vaibhav");
        //Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        //Enter Email
        driver.findElement(By.name("Email")).sendKeys("Vaibhav.Shah" + randomDate() + "@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("abcd123");
        //Enter Confirm Password
        driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("abcd123");
        //Click on Register
        driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
        String Expectedmsg = "Thank you";
        String Actualresult = driver.findElement(By.xpath(("//div[@class='result']"))).getText();
        Assert.assertEquals(Actualresult, Expectedmsg);
    }


     //@AfterMethod
    public void test7() {
        driver.quit();
    }

    @Test
    public void userShouldBeAbleToReferAProductToFriend() {
        //Open the website
        driver.get("https://demo.nopcommerce.com/");
        //Click on Register Button
        driver.findElement(By.linkText("Register")).click();
        //Enter First Name
        driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("Vaibhav");
        //Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        //Enter Email
        driver.findElement(By.name("Email")).sendKeys("Vaibhav.Shah" + randomDate() + "@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("abcd123");
        //Enter Confirm Password
        driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("abcd123");
        //Click on Register
        driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
        //click on continue button
        driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();
        //click on macbook page
        driver.findElement(By.xpath("//h2//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        //click on enter friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //enter friend email
        driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("kunlaraval73@gmail.com");
        //enter your email
        driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).click();
        //enter persnol massage
        driver.findElement(By.xpath("//textarea[@placeholder='Enter personal message (optional).']")).sendKeys("please check this out");
        //click on send email
        driver.findElement(By.xpath("//input[@value=\"Send email\"]")).click();
        String Expectedmsg = "Your message has been sent.";
        String Actualresult = driver.findElement(By.xpath(("//div[@class=\"result\"]"))).getText();
        Assert.assertEquals(Actualresult, Expectedmsg);
    }

     @Test
    public void userShouldBeAbleToNavigateCameraAndPhotoPage() {
        //Open the website
        driver.get("https://demo.nopcommerce.com/");
        //Click on Register Button
        driver.findElement(By.linkText("Register")).click();
        //Enter First Name
        driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("Vaibhav");
        //Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        //Enter Email
        driver.findElement(By.name("Email")).sendKeys("Vaibhav.Shah" + randomDate() + "@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("abcd123");
        //Enter Confirm Password
        driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("abcd123");
        //Click on Register
        driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
        //click on continue button
        driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();
        //click on electronics
        driver.findElement(By.xpath("//h2/a[@title=\"Show products in category Electronics\"]")).click();
        //click on camera and photo button
        driver.findElement(By.xpath("//h2/a[@title=\"Show products in category Camera & photo\"]")).click();


    }


@Test
public void userShouldBeAbleAddProductFromBookCategory(){
    //Open the website
    driver.get("https://demo.nopcommerce.com/");
    //Click on Register Button
    driver.findElement(By.linkText("Register")).click();
    //Enter First Name
    driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("Vaibhav");
    //Enter Last Name
    driver.findElement(By.id("LastName")).sendKeys("Shah");
    //Enter Email
    driver.findElement(By.name("Email")).sendKeys("Vaibhav.Shah" + randomDate() + "@gmail.com");
    //Enter Password
    driver.findElement(By.id("Password")).sendKeys("abcd123");
    //Enter Confirm Password
    driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("abcd123");
    //Click on Register
    driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
    //click on continue button
    driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();
    //click on books category
    driver.findElement(By.linkText("Books")).click();
    //add first book in cart
    driver.findElement(By.xpath("//input[contains(@onclick,\"37/1\")]")).click();
    //click on books category
    driver.findElement(By.linkText("Books")).click();
    //add second book in cart
    driver.findElement(By.xpath("//input[contains(@onclick,\"38/1\")]")).click();
    //books see in the cart
    driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();


}

}



