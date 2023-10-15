//package tests.UI.tests;

//import com.codeborne.selenide.SelenideElement;
//import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import tests.UI.base.Variables;
//import tests.UI.pages.SearchProduct;
//import tests.UI.pages.components.Header;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

//import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.Selectors.byXpath;
//import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//public class SearchProductTest {

  //  @BeforeMethod(alwaysRun = true)
    //public void setUp() {


      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
       // ChromeDriver driver = new ChromeDriver(options);

        // Set the driver for the current thread
       // WebDriverRunner.setWebDriver(driver);

        // Maximize the window
        //driver.manage().window().maximize();

        // Open the url using Selenide method
        //open("https://open.spotify.com/");
        // Find the element using Selenide method
        //WebElement element = $(byXpath(Variables.acceptCookies));

        // Wait until the element is visible and clickable using Selenide method
        //((SelenideElement) element).shouldBe(visible, enabled);

        // Click on the element using Selenide method
        //element.click();

   // }







    // Declare a ThreadLocal variable
    //private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    //@BeforeMethod(alwaysRun = true)
    //public void setUp() {


        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //ChromeOptions options = new ChromeOptions();
        ////options.addArguments("--remote-allow-origins=*");
        //ChromeDriver driver = new ChromeDriver(options);

        // Set the driver for the current thread
        //setDriver(driver);

        // Maximize the window
        //getDriver().manage().window().maximize();

        // Navigate to the Spotify website
        //getDriver().get("https://open.spotify.com/");

        //WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));


        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Variables.acceptCookies)));


        //element.click();

    //}

    // Get the driver for the current thread
    //public WebDriver getDriver() {
        //return driver.get();
   // }

    // Set the driver for the current thread
    //public void setDriver(WebDriver driver) {
      //  this.driver.set(driver);
    //}


        //driver.manage().window().maximize();

        //driver.get("https://open.spotify.com/");

        // Create a WebDriverWait object with a timeout of 10 seconds
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the acceptCookies element is visible and clickable
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Variables.acceptCookies)));


        //WebElement element = driver.findElement(By.xpath(Variables.acceptCookies));


        //element.click();







        //$(byXpath(Variables.acceptCookies)).click(); //

        //WebDriver driver = new ChromeDriver();
        //driver.get("https://www.bbc.com/news");


        //WebDriver driver = new ChromeDriver();
       // WebDriverRunner.setWebDriver(driver);
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        //open("https://open.spotify.com/");
        //$(byXpath(Variables.acceptCookies)).click(); //







    //}

   // @Test(groups = {"Regression"})
   // public void testSearchProduct() {
     //   $(byXpath(Header.searchLink)).click();
        //$(".CCi1L2OQvgdZvxkRHeKE").shouldHave(text("Browse all"));
       // $(byXpath(SearchProduct.searchBar)).setValue("love");
       // $("section[aria-label='Songs']").shouldHave(text("love"));
       // $("section[aria-label='Songs']").shouldNotHave(text("rrrrrrrrrr"));

        //closeWindow();
   // }
//}

