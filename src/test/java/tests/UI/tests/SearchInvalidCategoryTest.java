package tests.UI.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.UI.pages.SearchCategory;
import org.openqa.selenium.By;
import tests.UI.pages.components.Header;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;



public class SearchInvalidCategoryTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        // Set the driver for the current thread
        WebDriverRunner.setWebDriver(driver);

        // Maximize the window
        driver.manage().window().maximize();


        // Open the url using Selenide method
        open("https://www.cambridgeenglish.org/");

    }



    @Test(groups = {"Regression"})
    public void testSearchInvalidCategory() {
        $(byXpath(SearchCategory.invalidCategoryLink)).click();
        $(By.linkText("")).shouldNotHave(Condition.href(Header.mainPageLink + "blog/"));


        closeWindow();
    }
}