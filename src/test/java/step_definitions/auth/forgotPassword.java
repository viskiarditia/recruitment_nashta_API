package step_definitions.auth;

import io.cucumber.java.en.Given;

import static step_definitions.utills.constant.URL;

public class forgotPassword {
    public static final String FORGOT_PASSWORD = URL + "auth/send-email-forgot";
    @Given("a registered user who forgot the password")
    public void aRegisteredUserWhoForgotThePassword() {

    }
}
