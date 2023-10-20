package tests.UI.tests;

import org.junit.Test;
import tests.UI.PO.SearchCategory;
import tests.UI.PO.SearchInvalidCategory;


public class SearchInvalidCategoryTest {


    @Test
    //@Test(groups = {"Regression"})
    public void testInvalidCategory() {
        SearchCategory.setUp();
        SearchInvalidCategory test = new SearchInvalidCategory();
        test.testSearchInvalidCategory();

    }
}

