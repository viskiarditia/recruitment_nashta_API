package pageObjectAPI.jobOrder;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static step_definitions.utills.constant.URL;

public class jobOrderAPI {

    public static final String JOB_ORDER_REQUEST = URL + "job-order/v1?id=30a8d978-4835-4e75-bb93-42043bff9ef4";

    public static final String JOB_ORDER_APPROVAL = URL + "v1/approval?process_status=approved&sort_by_created_at=true&page=1&page_size=10";
    public static final String JOB_ORDER_REJECTED = URL + "v1/approval?process_status=rejected&sort_by_created_at=true&page=1&page_size=10";
    public static final String JOB_ORDER_REVISED = URL + "v1/approval?process_status=revised&sort_by_created_at=true&page=1&page_size=10";
    public static final String JOB_ORDER_IN_PROGRESS = URL + "v1/approval?process_status=in%20progress&sort_by_created_at=true&page=1&page_size=10";
    public static final String JOB_ORDER_REQUEST_IN_HISTORY_APPROVAL = URL + "v1/approval-history?process_status=approved&sort_by_created_at=true&page=1&page_size=10";
    public static final String JOB_ORDER_REQUEST_IN_HISTORY_REJECTED = URL + "v1/approval-history?process_status=rejected&sort_by_created_at=true&page=1&page_size=10";
    public static final String JOB_ORDER_REQUEST_IN_HISTORY_REVISED = URL + "v1/approval-history?process_status=revised&sort_by_created_at=true&page=1&page_size=10";
    public static final String Cancel_Job_Order_Request =URL + "v1/cancel-job-order?id=12";
    public static final String Get_One_Job_Order_Request = URL + "v1/get-one?id=12";
    public static final String List_Job_Posting = URL + "v1/list-job-posting?sort_by_created_at=true&page=1&page_size=10";
    public static final String List_Request_Approved = URL + "v1/request?process_status=approved&page=1&page_size=10";
    public static final String List_Request_Rejected = URL + "v1/request?process_status=rejected&page=1&page_size=10";
    public static final String List_Request_Revised = URL + "v1/request?process_status=revised&page=1&page_size=10";
    public static final String List_Request_InProgress = URL + "v1/request?process_status=in%20progress&page=1&page_size=10";
    public static final String List_Request_Draft = URL + "v1/request?process_status=draft&page=1&page_size=10";


    @Step("Valid Data JSON Job Order Request")
    public void setJobOrderRequest(File json) {
        SerenityRest.given()
//                .headers("Authorization", "Bearer " + BEARER_TOKEN)
                .contentType(ContentType.JSON)
                .body(json);
    }
}
