package tests.restAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

public class WikimediaAPITest {

    //https://wikitech.wikimedia.org/wiki/Analytics/AQS/Pageviews
    //Get the top 1000 most viewed articles visited via the mobile app from the United States on February 28th, 2021

    @Test (groups = {"SmokeTest"})
    public void getArticlesUSA() {

        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://wikimedia.org/api/rest_v1")
                .accept(ContentType.JSON)
                .when()
                .get("/metrics/pageviews/top-per-country/US/mobile-app/2021/02/28")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200);

    }


    //Get a pageview count timeseries of en.wikipedia's article Albert Einstein for the month of October 2015

    @Test (groups = {"SmokeTest"})
    public void getPageViewEinstein() {

        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://wikimedia.org/api/rest_v1")
                .accept(ContentType.JSON)
                .when()
                .get("/metrics/pageviews/per-article/en.wikipedia/all-access/all-agents/Albert_Einstein/daily/2015100100/2015103100")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200);

    }

    @Test (groups = {"SmokeTest"})
    public void getPageViewEinsteinNegative() {

        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://wikimedia.org/api/rest_v1")
                .accept(ContentType.JSON)
                .when()
                .get("/metrics/pageviews/per-article/en.wikipedia/all-access/all-agents/Albert_Einstein/daily/000000")
                .then()
                .log()
                .all()
                .assertThat().statusCode(404);

    }

}
