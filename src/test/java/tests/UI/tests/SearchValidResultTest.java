package tests.UI.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.UI.pages.SearchCategory;
import org.openqa.selenium.By;
import tests.UI.pages.SearchResult;
import tests.UI.pages.components.Header;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;



public class SearchValidResultTest {

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
        $(byXpath(SearchResult.searchBox)).setValue("love").sendKeys( Keys.ENTER);
        //$("//*[@id='___gcse_2']").shouldHave(text("love"));
        //$("//*[@id='___gcse_2']").shouldNotHave(text("rrrrrrrrrr"));

        //$(By.linkText("Blog")).shouldHave(Condition.href(Header.mainPageLink + "blog/"));
        //   $(byXpath(Header.searchLink)).click();
        //$(".CCi1L2OQvgdZvxkRHeKE").shouldHave(text("Browse all"));


        // $(byXpath(SearchProduct.searchBar)).setValue("love");
        // $("section[aria-label='Songs']").shouldHave(text("love"));
        // $("section[aria-label='Songs']").shouldNotHave(text("rrrrrrrrrr"));

        //closeWindow();
    }
}
