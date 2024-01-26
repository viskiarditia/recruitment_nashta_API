package pageObjectAPI.auth;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static step_definitions.utills.constant.*;

public class signInAPI {
    public static final String SIGN_IN = URL + "auth/signin";
    public static final String FORGOT_PASSWORD_DEV = URL_FORGOT + "auth/send-email-forgot";
    public static final String FORGOT_PASSWORD_BERHASIL = "http://10.10.3.250:32265/forgot-password";


    @Step("Login with valid data")
    public void setPostLoginUtama(File json) {
        SerenityRest.given()
//                .headers("Authorization", "Bearer " + BEARER_TOKEN)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("a registered user who forgot the password")
    public void setForgotPassword(File json) {
        SerenityRest.given()
//                .headers("Authorization", "Bearer " + BEARER_TOKEN)
                .contentType(ContentType.JSON)
                .body(json);
    }
}
