package tests.UI.PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import tests.UI.base.Variables;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;


public class ChangeLanguage {

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


    public static String changeLanguageLink = "//a[@href='/footer/local-websites/index.aspx']";
    public static String chooseLanguageLink = "//a[@href='/fr/']";



    public static void testChangeLanguage() {
        $(byXpath(changeLanguageLink)).click();
        $(byXpath(Variables.acceptCookies)).click();
        $(byXpath(chooseLanguageLink)).click();
        $(By.linkText("")).shouldNotHave(Condition.href(Variables.mainPageLink + "fr/"));

        closeWindow();
     }
 }

