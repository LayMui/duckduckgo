package demo.stepdefinitions;

import demo.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import java.net.URL;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ReplaceLogoStepDefinitions {

    @Steps
    HomePage homePage;

    @Before()
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After()
    public void drawTheCurtain() {
        OnStage.drawTheCurtain();
    }

    @Given("(?:.*) is at the duckduckgo website$")
    public void jamesIsAtTheDuckduckgoWebsite() {
        theActorCalled("james").attemptsTo(Open.browserOn().the(homePage));
    }
    @When("^he see the duckduckgo logo$")
    public void heSeeTheDuckduckgoLogo() {
        URL serenityBDDUrl = getClass().getResource("/serenityBDD.png");
        byte[] logo;
//        WebDriver driver = homePage.getDriver();
//        try( InputStream inputStream = serenityBDDUrl.openStream()) {
//            logo = inputStream.readAllBytes();
//            org.openqa.selenium.remote.http.Route route =
//                    org.openqa.selenium.remote.http.Route.matching(req -> req.getUri().contains("logo") &&
//                            req.getUri().endsWith(".svg")).to( () -> req -> new HttpResponse().
//                            addHeader("Content-Type", "image/svg+xml+png").
//                            setContent(Contents.bytes(logo)));
//
//              //  try (NetworkInterceptor interceptor = new NetworkInterceptor(driver, route)) {
//                    driver.get("https://duckduckgo.com");
//              //  }
//
//            } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
    @Then("^he is able to get it replaced with serenityBDD logo$")
    public void heIsAbleToGetItReplacedWithSerenityBDDLogo() {

    }

}
