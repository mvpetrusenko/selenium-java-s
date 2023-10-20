package tests.restAPI;


public class Base extends WikimediaAPITest {

    public void main(String[] args) {

        WikimediaAPITest rs = new WikimediaAPITest();
        getArticlesUSA();
        getPageViewEinstein();
        getPageViewEinsteinNegative();

    }
}

