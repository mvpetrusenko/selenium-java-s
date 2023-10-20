package tests.UI.tests;

import org.junit.Test;
import tests.UI.PO.ChangeLanguage;

public class ChangeLanguageTest {


    @Test
   // @Test (groups = {"Regression"})

    public void testLanguage() {
        ChangeLanguage.setUp();
        ChangeLanguage test = new ChangeLanguage();
        test.testChangeLanguage();
    }
}

