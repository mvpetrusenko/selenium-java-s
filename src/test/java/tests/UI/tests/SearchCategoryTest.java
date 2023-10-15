package tests.UI.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.UI.pages.SearchCategory;
import org.openqa.selenium.By;
import tests.UI.pages.components.Header;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;



public class SearchCategoryTest {

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
        open(Header.mainPageLink);

    }



    @Test(groups = {"Regression"})
    public void testSearchCategory() {
        $(byXpath(SearchCategory.categoryLink)).click();
        $(By.linkText("Blog")).shouldHave(Condition.href(Header.mainPageLink + "blog/"));


        closeWindow();
    }
}


