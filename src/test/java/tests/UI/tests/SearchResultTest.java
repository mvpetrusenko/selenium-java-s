package tests.UI.tests;

import org.junit.Test;
import tests.UI.PO.SearchCategory;
import tests.UI.PO.SearchResult;

public class SearchResultTest {

    @Test
    //@Test(groups = {"Regression"})
    public void testResult() {
        SearchCategory.setUp();
        SearchResult test = new SearchResult();
        test.testSearchResult();
    }
}

