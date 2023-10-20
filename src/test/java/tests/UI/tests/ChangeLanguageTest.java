package tests.UI.tests;

import org.junit.Test;
import tests.UI.PO.ChangeLanguage;
//import tests.UI.PO.HomePage;
//import tests.UI.PO.LanguagePage;
import tests.UI.PO.SearchCategory;

public class ChangeLanguageTest {

    @Test
    public void testLanguage() {
        ChangeLanguage.setUp();
        ChangeLanguage test = new ChangeLanguage();
        test.testChangeLanguage();
    }
}






















//package tests.UI.tests;

//import org.junit.Test;
//import tests.UI.PO.BasePage;
//import tests.UI.PO.HomePage;
//import tests.UI.PO.LanguagePage;

//public class ChangeLanguageTest {

    //@Test(groups = {"Regression"})
   // @Test
    //public void testLanguage() {

        // Create an instance of each page object class
        //HomePage homePage = new HomePage();
        //LanguagePage languagePage = new LanguagePage();

        // Use the methods of each page object class to perform the test steps

        //homePage.clickChangeLanguageLink();
        //homePage.clickAcceptCookies();
        //languagePage.clickChooseLanguageLink();
        //languagePage.verifyLanguageChanged();

    //}
//}















//package tests.UI.tests;

//import org.junit.Test;

//import tests.UI.PO.ChangeLanguage;


//public class ChangeLanguageTest extends ChangeLanguage {

    //@Test(groups = {"Regression"})
    //@Test
    //public void testLanguage() {

     //   ChangeLanguage.switchLanguage();

    //}
//}


