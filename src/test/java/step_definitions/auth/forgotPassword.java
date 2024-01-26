package step_definitions.auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import pageObjectAPI.auth.signInAPI;
import step_definitions.utills.constant;

import java.io.File;

public class forgotPassword {
    @Steps
    signInAPI signInAPI;

    @Given("a registered user who forgot the password")
    public void aRegisteredUserWhoForgotThePassword() {
        File forgotPassword = new File(constant.JSON_REQ_BODY+"auth/forgotPassword.json");
        signInAPI.setForgotPassword(forgotPassword);

    }

    @When("Send request post to recover the password")
    public void sendRequestPostToRecoverThePassword() {
        SerenityRest.when().post(pageObjectAPI.auth.signInAPI.FORGOT_PASSWORD_BERHASIL);
    }

    @Given("an unregistered user who forgot the password")
    public void anUnregisteredUserWhoForgotThePassword() {
        File unregisteredForgotPassword = new File(constant.JSON_REQ_BODY+"auth/forgotPasswordUnregistered.json");
        signInAPI.setForgotPassword(unregisteredForgotPassword);
    }

    @When("Send request post an unregistered user the password")
    public void sendRequestPostAnUnregisteredUserThePassword() {
        SerenityRest.when().post(pageObjectAPI.auth.signInAPI.FORGOT_PASSWORD_DEV);
    }

}
