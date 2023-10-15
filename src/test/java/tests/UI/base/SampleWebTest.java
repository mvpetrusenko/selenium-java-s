package tests.UI.base;

//!!!! Before executing this test move it to the UI.tests folder +
// comment above package and uncomment below package
//package tests.UI.tests;


import com.codeborne.selenide.WebDriverRunner;
import org.example.SampleTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import tests.UI.base.Variables;

public class SampleWebTest {


    @Test (groups = {"Regression"})
    public static void testSampleUI() {
        //WebDriver driver = new ChromeDriver();

        //WebDriverRunner.setWebDriver(driver);
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        //open("https://open.spotify.com/");
        //$(byXpath(Variables.acceptCookies)).click();






        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");



        //WebDriver driver = new ChromeDriver();
        //WebDriverRunner.setWebDriver(driver);
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        //open("https://open.spotify.com/");
        //$(byXpath(Variables.acceptCookies)).click(); //







        //this third attempt to run web browser and open website OK!!!

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/news");

        //closeWindow();


    }

}


