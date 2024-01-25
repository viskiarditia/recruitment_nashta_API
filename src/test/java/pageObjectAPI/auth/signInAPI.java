package pageObjectAPI.auth;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static step_definitions.utills.constant.BEARER_TOKEN;
import static step_definitions.utills.constant.URL;

public class signInAPI {
    public static final String SIGN_IN = URL + "auth/signin";
    public static final String FORGOT_PASSWORD = URL + "auth/send-email-forgot";

    @Step("Login with valid data")
    public void setPostLoginUtama(File json) {
        SerenityRest.given()
//                .headers("Authorization", "Bearer " + BEARER_TOKEN)
                .contentType(ContentType.JSON)
                .body(json);
    }
}
