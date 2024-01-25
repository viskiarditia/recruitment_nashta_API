package step_definitions.utills;

import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

public class responseStatusCode {
    @Then("the response status code should be {int} Created")
    public void theResponseStatusCodeShouldBeCreated(int status0) {
        SerenityRest.then().statusCode(status0);
    }

    @Then("the response status code should be {int} OK")
    public void theResponseStatusCodeShouldBeOK(int status) {
        SerenityRest.then().statusCode(status);
    }

    @Then("the response status code should be {int} Bad Request")
    public void theResponseStatusCodeShouldBeBadRequest(int status2) {
        SerenityRest.then().statusCode(status2);
    }

    @Then("the response status code should be {int} Unauthorized")
    public void theResponseStatusCodeShouldBeUnauthorized(int status3) {
        SerenityRest.then().statusCode(status3);
    }

    @Then("the response status code should be {int} Not Found")
    public void theResponseStatusCodeShouldBeNotFound(int status4) {
        SerenityRest.then().statusCode(status4);
    }


}
