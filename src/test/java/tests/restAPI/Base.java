package tests.restAPI;


public class Base extends WikimediaAPITest {
//public class Base extends RestAssuredAPITest {
    public void main(String[] args) {

        WikimediaAPITest rs = new WikimediaAPITest();
        getArticlesUSA();
        getPageViewEinstein();
        getPageViewEinsteinNegative();

    }
}
