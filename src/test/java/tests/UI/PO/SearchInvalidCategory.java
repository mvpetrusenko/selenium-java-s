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




import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.Utils;
import tests.UI.base.Variables;
import org.openqa.selenium.By;
import org.testng.*;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.ITestResult.FAILURE;

import org.apache.commons.io.FileUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.ITestResult.FAILURE;

public class SearchInvalidCategory {

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

    public static String invalidCategoryLink = "//a[@href='/news/']";
    // public static String invalidCategoryLink = "//a[@href='/newww/']";


    public void testSearchInvalidCategory() {
        $(byXpath(invalidCategoryLink)).click();
        $(By.linkText("")).shouldNotHave(Condition.href(Variables.mainPageLink + "blog/"));

        closeWindow();
    }
}

