package tests.UI.tests;

import org.junit.Test;
//import tests.UI.PO.HomePage;
//import tests.UI.PO.LanguagePage;
import tests.UI.PO.SearchCategory;
import tests.UI.PO.SearchInvalidCategory;


public class SearchInvalidCategoryTest {

    @Test
    public void testInvalidCategory() {
        SearchCategory.setUp();
        SearchInvalidCategory test = new SearchInvalidCategory();
        test.testSearchInvalidCategory();

    }
}


