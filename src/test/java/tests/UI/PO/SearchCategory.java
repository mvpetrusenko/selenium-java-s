package tests.UI.PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import tests.UI.base.Variables;
//import tests.UI.tests.SearchCategoryTest;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;



public class SearchCategory {

    @BeforeMethod(alwaysRun = true)
    public static void setUp() {


        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        // Set the driver for the current thread
        WebDriverRunner.setWebDriver(driver);

        // Maximize the window
        driver.manage().window().maximize();


        // Open the url using Selenide method
        open(Variables.mainPageLink);

    }



    public static String categoryLink = "//a[@href='/blog/']";




    //@Test(groups = {"Regression"})
    public void testSearchCategory() {
        $(byXpath(categoryLink)).click();
        $(By.linkText("Blog")).shouldHave(Condition.href(Variables.mainPageLink + "blog/"));


        closeWindow();
    }
}


