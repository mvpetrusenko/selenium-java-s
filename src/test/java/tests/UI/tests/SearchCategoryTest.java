package tests.UI.tests;

import org.junit.Test;
import tests.UI.PO.SearchCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchCategoryTest {

    private static final Logger logger = LoggerFactory.getLogger(SearchCategoryTest.class);

    @Test
    //@Test(groups = {"Regression"})
    public void testCategory() {
        SearchCategory.setUp();
        SearchCategory test = new SearchCategory();
        test.testSearchCategory();

        logger.info("Blog category has been found");

    }
}

