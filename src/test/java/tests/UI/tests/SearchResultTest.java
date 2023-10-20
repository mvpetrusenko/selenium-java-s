package tests.UI.tests;

import org.junit.Test;
//import tests.UI.PO.HomePage;
//import tests.UI.PO.LanguagePage;
import tests.UI.PO.SearchCategory;
import tests.UI.PO.SearchResult;

public class SearchResultTest {

    @Test
    public void testResult() {
        SearchCategory.setUp();
        SearchResult test = new SearchResult();
        test.testSearchResult();
    }
}







//package tests.UI.tests;

//public class SearchResultTest {

    //public static String searchBox = "//input[@title='search']";

//}
