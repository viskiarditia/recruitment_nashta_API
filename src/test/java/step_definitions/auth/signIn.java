package step_definitions.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import pageObjectAPI.auth.signInAPI;
import step_definitions.utills.constant;

import java.io.File;

public class signIn {
    @Steps
    signInAPI signInAPI;

    @Given("Login with valid data json")
    public void loginWithValidDataJson() {
        File login = new File(constant.JSON_REQ_BODY+"auth/credentials.json");
        signInAPI.setPostLoginUtama(login);
    }

    @When("Send request post Login")
    public void SendrequestpostLogin() {
        SerenityRest.when().post(pageObjectAPI.auth.signInAPI.SIGN_IN);
    }


    @And("the response should match the JSON schema")
    public void theResponseShouldMatchTheJSONSchema() {
        File JsonValidate = new File(constant.JSON_SCHEMA_VALIDATOR+"signInValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate));
    }

    @Given("an invalid user without a email")
    public void anInvalidUserWithoutAemail() {
    File loginInvalid1 = new File(constant.JSON_REQ_BODY+"auth/credentialsWithoutEmail.json");
        signInAPI.setPostLoginUtama(loginInvalid1);
    }

    @Given("an invalid user without a password")
    public void anInvalidUserWithoutAPassword() {
        File loginInvalid2 = new File(constant.JSON_REQ_BODY+"auth/credentialsWithoutPassword.json");
        signInAPI.setPostLoginUtama(loginInvalid2);
    }

    @Given("an invalid unregistered user")
    public void anInvalidUnregisteredUser() {
        File loginInvalid2 = new File(constant.JSON_REQ_BODY+"auth/credentialsUnregistered.json");
        signInAPI.setPostLoginUtama(loginInvalid2);
    }



}
