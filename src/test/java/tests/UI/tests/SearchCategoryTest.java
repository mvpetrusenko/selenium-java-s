package tests.UI.tests;

import org.junit.Test;
//import tests.UI.PO.HomePage;
//import tests.UI.PO.LanguagePage;
import tests.UI.PO.SearchCategory;

public class SearchCategoryTest {

    @Test
    public void testCategory() {
        SearchCategory.setUp();
        SearchCategory test = new SearchCategory();
        test.testSearchCategory();
    }
}




















//package tests.UI.tests;

//import org.junit.Test;
//import tests.UI.PO.HomePage;
//import tests.UI.PO.LanguagePage;
//import tests.UI.PO.SearchCategory;

//public class SearchCategoryTest {

    //public static String categoryLink = "//a[@href='/blog/']";


    //@Test
    //public void testCategory() {

        // Create an instance of each page object class
        //HomePage homePage = new HomePage();
        //LanguagePage languagePage = new LanguagePage();

        // Use the methods of each page object class to perform the test steps

        //homePage.clickChangeLanguageLink();
        //homePage.clickAcceptCookies();
        //languagePage.clickChooseLanguageLink();
        //languagePage.verifyLanguageChanged();

        //SearchCategory.setUp();
        //SearchCategory.testSearchCategory();

    //}
//}


//}




