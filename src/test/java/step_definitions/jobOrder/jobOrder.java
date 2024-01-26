package step_definitions.jobOrder;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import pageObjectAPI.jobOrder.jobOrderAPI;
import step_definitions.utills.constant;

import java.io.File;

public class jobOrder {
    jobOrderAPI jobOrderAPI;

    @Given("Valid Data JSON Job Order Request")
    public void validDataJSONJobOrderRequest() {
        File addData = new File(constant.JSON_REQ_BODY+"jobOrder/addDataJobRequest.json");
        jobOrderAPI.setJobOrderRequest(addData);
    }

    @When("Send request post Job Order Request")
    public void sendRequestPostJobOrderRequest() {
        SerenityRest.when().post(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REQUEST);
    }

    @When("Send request method to POST path to Param Company Organization")
    public void sendRequestMethodToPOSTPathToParamCompanyOrganization() {
        SerenityRest.when().post(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REQUEST);
    }

    @And("Validate json schema response Param Company Organization")
    public void validateJsonSchemaResponseParamCompanyOrganization() {
        File JsonValidate1 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate1));
    }

    @When("Send request method to DELETE path to Request Page")
    public void sendRequestMethodToDELETEPathToRequestPage() {
        SerenityRest.when().delete(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REQUEST);
    }

    @And("Validate json schema response Request Page")
    public void validateJsonSchemaResponseRequestPage() {
        File JsonValidate2 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate2));
    }

    @When("Send request method to GET path to Job Order Request Approval")
    public void sendRequestMethodToGETPathToJobOrderRequestApproval() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_APPROVAL);
    }

    @And("Validate json schema response Job Order Request Approval")
    public void validateJsonSchemaResponseJobOrderRequestApproval() {
        File JsonValidate3 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate3));
    }

    @When("Send request method to GET path to Job Order Request Rejected")
    public void sendRequestMethodToGETPathToJobOrderRequestRejected() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REJECTED);
    }

    @And("Validate json schema response Job Order Request Rejected")
    public void validateJsonSchemaResponseJobOrderRequestRejected() {
        File JsonValidate4 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate4));
    }

    @When("Send request method to GET path to Job Order Request Revised")
    public void sendRequestMethodToGETPathToJobOrderRequestRevised() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REVISED);
    }

    @And("Validate json schema response Job Order Request Revised")
    public void validateJsonSchemaResponseJobOrderRequestRevised() {
        File JsonValidate5 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate5));
    }

    @When("Send request method to GET path to Job Order Request In Progress")
    public void sendRequestMethodToGETPathToJobOrderRequestInProgress() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_IN_PROGRESS);
    }

    @And("Validate json schema response Job Order Request In Progress")
    public void validateJsonSchemaResponseJobOrderRequestInProgress() {
        File JsonValidate6 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate6));
    }

    @When("Send request method to GET path to Job Order Request In History Approval")
    public void sendRequestMethodToGETPathToJobOrderRequestInHistoryApproval() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REQUEST_IN_HISTORY_APPROVAL);
    }

    @And("Validate json schema response Job Order Request In History Approval")
    public void validateJsonSchemaResponseJobOrderRequestInHistoryApproval() {
        File JsonValidate7 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate7));
    }

    @When("Send request method to GET path to Job Order Request In History Rejected")
    public void sendRequestMethodToGETPathToJobOrderRequestInHistoryRejected() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REQUEST_IN_HISTORY_REJECTED);
    }

    @And("Validate json schema response Job Order Request In History Rejected")
    public void validateJsonSchemaResponseJobOrderRequestInHistoryRejected() {
        File JsonValidate8 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate8));
    }

    @When("Send request method to GET path to Job Order Request In History Revised")
    public void sendRequestMethodToGETPathToJobOrderRequestInHistoryRevised() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.JOB_ORDER_REQUEST_IN_HISTORY_REVISED);
    }

    @And("Validate json schema response Job Order Request In History Revised")
    public void validateJsonSchemaResponseJobOrderRequestInHistoryRevised() {
        File JsonValidate9 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate9));
    }

    @When("Send request method to POST path to Cancel Job Order Request")
    public void sendRequestMethodToPOSTPathToCancelJobOrderRequest() {
        SerenityRest.when().post(pageObjectAPI.jobOrder.jobOrderAPI.Cancel_Job_Order_Request);
    }

    @And("Validate json schema response Cancel Job Order Request")
    public void validateJsonSchemaResponseCancelJobOrderRequest() {
        File JsonValidate10 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate10));
    }

    @When("Send request method to GET path to Get One Job Order Request")
    public void sendRequestMethodToGETPathToGetOneJobOrderRequest() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.Get_One_Job_Order_Request);
    }

    @And("Validate json schema response Get One Job Order Request")
    public void validateJsonSchemaResponseGetOneJobOrderRequest() {
        File JsonValidate11 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate11));
    }

    @When("Send request method to GET path to List Job Posting")
    public void sendRequestMethodToGETPathToListJobPosting() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.List_Job_Posting);
    }

    @And("Validate json schema response  List Job Posting")
    public void validateJsonSchemaResponseListJobPosting() {
        File JsonValidate12 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate12));
    }

    @When("Send request method to GET path to List Request Approved")
    public void sendRequestMethodToGETPathToListRequestApproved() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.List_Request_Approved);
    }

    @And("Validate json schema response List Request Approved")
    public void validateJsonSchemaResponseListRequestApproved() {
        File JsonValidate13 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate13));
    }

    @When("Send request method to GET path to List Request Rejected")
    public void sendRequestMethodToGETPathToListRequestRejected() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.List_Request_Rejected);
    }

    @And("Validate json schema response List Request Rejected")
    public void validateJsonSchemaResponseListRequestRejected() {
        File JsonValidate14 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate14));
    }

    @When("Send request method to GET path to List Request Revised")
    public void sendRequestMethodToGETPathToListRequestRevised() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.List_Request_Revised);
    }

    @And("Validate json schema response List Request Revised")
    public void validateJsonSchemaResponseListRequestRevised() {
        File JsonValidate15 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate15));
    }

    @When("Send request method to GET path to List Request InProgress")
    public void sendRequestMethodToGETPathToListRequestInProgress() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.List_Request_InProgress);
    }

    @And("Validate json schema response List Request InProgress")
    public void validateJsonSchemaResponseListRequestInProgress() {
        File JsonValidate16 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate16));
    }

    @When("Send request method to GET path to List Request Draft")
    public void sendRequestMethodToGETPathToListRequestDraft() {
        SerenityRest.when().get(pageObjectAPI.jobOrder.jobOrderAPI.List_Request_Draft);
    }

    @And("Validate json schema response List Request Draft")
    public void validateJsonSchemaResponseListRequestDraft() {
        File JsonValidate17 = new File(constant.JSON_SCHEMA_VALIDATOR+"jobOrderValidator/addDataValidator.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonValidate17));
    }
}
