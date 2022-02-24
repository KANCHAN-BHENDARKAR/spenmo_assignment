package com.spenmo.tests;

import com.google.gson.Gson;
import com.spenmo.pojos.response.BalancePayloadResponse;
import com.spenmo.pojos.others.FieldValues;
import com.spenmo.pojos.response.LoginPayloadResponse;
import com.spenmo.pojos.response.Transaction;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.spenmo.commonUtils.CurrencyName.SGD;
import static com.spenmo.commonUtils.ReadWriteUtility.*;
import static com.spenmo.commonUtils.TestAPIFieldName.*;
import static com.spenmo.commonUtils.URIManagement.*;

public class MoneyTransfer {
    Gson gson = new Gson();
    private final String contentTypeFormData = "application/x-www-form-urlencoded";
    private final String contentTypeJson = "application/json";
    String access_token;
    String wallet_amount;
    String available_balance;
    String available_balance1;
    String org_id;
    String reference_number;
    String user_id;
    double amount;
    String team_id = "f341412a-86e6-11eb-b045-0242ac110003";
    String GET_BALANCE_URI = baseURI + context + "org/%s/team/%s";

    public void login(String email, String password) {
        RestAssured.baseURI = baseURI + context + loginURI;

        Response res = RestAssured.given().contentType(contentTypeFormData)
                .param(EMAIL_ID.getFieldName(), email)
                .param(PASSWORD.getFieldName(), password)
                .param(DEVICE.getFieldName(), PORTAL.getFieldName())
                .when().post()
                .then().extract().response();

        Assert.assertEquals(HttpStatus.SC_OK, res.statusCode());

        LoginPayloadResponse loginPayloadResponse = gson.fromJson(res.getBody().prettyPrint(), LoginPayloadResponse.class);

        access_token = loginPayloadResponse.getPayload().getAccess_token();
        org_id = loginPayloadResponse.getPayload().getOrg_id();
        user_id = loginPayloadResponse.getPayload().getUser_id();

        if (getValueFromConfigPropertiesFile("org_id") == null) {
            insertValueIntoPropertiesFile("org_id", org_id);
        }

        insertValueIntoPropertiesFile(email, access_token);
        insertValueIntoPropertiesFile("user_id" + "_" + email, user_id);
    }

    @Test(priority = 0)
    public void TestGetBalanceOfASender() {
        System.out.println("------- TestGetBalance  Started-----------");

        String email = getValueFromUserPropertiesFile("USER_1_EMAIL_ID");
        if (getValueFromConfigPropertiesFile(email) != null) {
            access_token = getValueFromConfigPropertiesFile(email);
        } else {
            login(email, getValueFromUserPropertiesFile("USER_1_PASSWORD"));
        }

        org_id = getValueFromConfigPropertiesFile("org_id");

        RestAssured.baseURI = String.format(GET_BALANCE_URI, org_id, team_id);

        Map<String, Object> requestHeaders = new HashMap();
        requestHeaders.put(AUTHORIZATION.getFieldName(), "Bearer " + access_token);
        requestHeaders.put(ACCEPT.getFieldName(), ContentType.JSON);
        requestHeaders.put(AUTHORITY.getFieldName(), "api.spenmo-staging.com");
        requestHeaders.put(ORIGIN.getFieldName(), "https://dashboard.spenmo-staging.com");
        requestHeaders.put(REFERER.getFieldName(), "https://dashboard.spenmo-staging.com/");

        Response res = RestAssured.given().contentType(contentTypeJson)
                .headers(requestHeaders).when().log().all().get().then().extract().response();

        Assert.assertEquals(res.statusCode(), HttpStatus.SC_OK);

        BalancePayloadResponse balancePayloadResponse = gson.fromJson(res.getBody().prettyPrint(), BalancePayloadResponse.class);

        Assert.assertEquals(balancePayloadResponse.getStatus(), 200);

        wallet_amount = balancePayloadResponse.getPayload().getTeam().getWallet_amount();

        System.out.println("wallet amount is : " + wallet_amount);
        System.out.println("------- TestGetBalance  Ended-----------");

    }

    @Test(priority = 1)
    public void TestBalanceOfAReceiver() {

        System.out.println("------- TestBalanceOfAReceiver  Started-----------");

        String email = getValueFromUserPropertiesFile("USER_2_EMAIL_ID");
        if (getValueFromConfigPropertiesFile(email) != null) {
            access_token = getValueFromConfigPropertiesFile(email);
        } else {
            login(email, getValueFromUserPropertiesFile("USER_2_PASSWORD"));
        }

        org_id = getValueFromConfigPropertiesFile("org_id");
        RestAssured.baseURI = String.format(GET_BALANCE_URI, org_id, team_id);

        Map<String, Object> requestHeaders = new HashMap();
        requestHeaders.put(AUTHORIZATION.getFieldName(), "Bearer " + access_token);
        requestHeaders.put(ACCEPT.getFieldName(), ContentType.JSON);
        requestHeaders.put(AUTHORITY.getFieldName(), "api.spenmo-staging.com");
        requestHeaders.put(ORIGIN.getFieldName(), "https://dashboard.spenmo-staging.com");
        requestHeaders.put(REFERER.getFieldName(), "https://dashboard.spenmo-staging.com/");

        Response res = RestAssured.given().contentType(contentTypeJson)
                .headers(requestHeaders).when().log().all().get().then().extract().response();

        Assert.assertEquals(res.statusCode(), HttpStatus.SC_OK);

        BalancePayloadResponse balancePayloadResponse = gson.fromJson(res.getBody().prettyPrint(), BalancePayloadResponse.class);

        Assert.assertEquals(balancePayloadResponse.getStatus(), 200);

        available_balance = balancePayloadResponse.getPayload().getTeam().getYour_membership_details().getUser_wallet().getAvailable_balance();

        System.out.println("available balance is : " + available_balance);

        System.out.println("------- TestBalanceOfAReceiver  Ended-----------");
    }

    @Test(priority = 2)
    public void TestSendMoney() {

        System.out.println("------- TestSendsFunds  Started-----------");

        String email = getValueFromUserPropertiesFile("USER_1_EMAIL_ID");
        if (getValueFromConfigPropertiesFile(email) != null) {
            access_token = getValueFromConfigPropertiesFile(email);
        } else {
            login(email, getValueFromUserPropertiesFile("USER_1_PASSWORD"));
        }

        Map<String, Object> requestHeaders = new HashMap();
        requestHeaders.put(AUTHORIZATION.getFieldName(), "Bearer " + access_token);
        requestHeaders.put(ACCEPT.getFieldName(), ContentType.JSON);

        Map<String, Object> amountMap = new HashMap();
        amountMap.put(TO_AMOUNT.getFieldName(), 1);
        amountMap.put(FROM_AMOUNT.getFieldName(), 1);
        amountMap.put(TO_CURRENCY.getFieldName(), SGD.getCurrencyName());
        amountMap.put(FROM_CURRENCY.getFieldName(), SGD.getCurrencyName());
        amountMap.put(FEE.getFieldName(), 0);

        Map<String, Object> senderMap = new HashMap();
        senderMap.put(TEAM_ID.getFieldName(), team_id);
        senderMap.put(TYPE.getFieldName(), TEAM.getFieldName());

        user_id = getValueFromConfigPropertiesFile("user_id" + "_" + getValueFromUserPropertiesFile("USER_2_EMAIL_ID"));
        Map<String, Object> receiverMap = new HashMap();
        receiverMap.put(TEAM_ID.getFieldName(), team_id);
        receiverMap.put(USER_ID.getFieldName(), user_id);
        receiverMap.put(TYPE.getFieldName(), USER.getFieldName());

        RestAssured.baseURI = baseURI + context + sendFundURI;

        org_id = getValueFromConfigPropertiesFile("org_id");

        Response res = RestAssured.given().contentType(contentTypeFormData)
                .param(AMOUNT.getFieldName(), gson.toJson(amountMap))
                .param(SENDER.getFieldName(), gson.toJson(senderMap))
                .param(RECEIVER.getFieldName(), gson.toJson(receiverMap))
                .param(ORGANISATION_ID.getFieldName(), org_id)
                .headers(requestHeaders)
                .when().log().all().post()
                .then().extract().response();

        Assert.assertEquals(res.statusCode(), HttpStatus.SC_OK);

        BalancePayloadResponse balancePayloadResponse = gson.fromJson(res.getBody().prettyPrint(), BalancePayloadResponse.class);

        Assert.assertEquals(balancePayloadResponse.getStatus(), 200);

        reference_number = balancePayloadResponse.getPayload().getReference_number();
        System.out.println("reference number is  : " + reference_number);

        amount = balancePayloadResponse.getPayload().getAmount();

        System.out.println("------- TestSendsFunds  Ended -----------");
    }

    @Test(priority = 3)
    public void TestGetAllTheTransactions() {
        System.out.println("------- TestGetAllTheTransactions  Started-----------");

        String email = getValueFromUserPropertiesFile("USER_1_EMAIL_ID");
        if (getValueFromConfigPropertiesFile(email) != null) {
            access_token = getValueFromConfigPropertiesFile(email);
        } else {
            login(email, getValueFromUserPropertiesFile("USER_1_PASSWORD"));
        }

        Map<String, Object> requestHeaders = new HashMap();
        requestHeaders.put(AUTHORIZATION.getFieldName(), "Bearer " + access_token);
        requestHeaders.put(ACCEPT.getFieldName(), ContentType.JSON);

        RestAssured.baseURI = baseURI + context + transactionsURI;

        org_id = getValueFromConfigPropertiesFile("org_id");
        Map<String, String> map = new HashMap<String, String>();
        map.put(ORGANISATION_ID.getFieldName(), org_id);
        Response res = RestAssured.given().contentType(contentTypeFormData)
                .param(FIELDS.getFieldName(), gson.toJson(getFieldValues()))
                .param(FILTERS.getFieldName(), gson.toJson(map))
                .param(ORGANISATION_ID.getFieldName(), org_id)
                .param(LIMIT.getFieldName(), 200)
                .param("pg", 0)
                .headers(requestHeaders)
                .when().log().all().post().then().extract().response();

        Assert.assertEquals(HttpStatus.SC_OK, res.statusCode());

        BalancePayloadResponse balancePayloadResponse = gson.fromJson(res.getBody().prettyPrint(), BalancePayloadResponse.class);

        Assert.assertEquals(balancePayloadResponse.getStatus(), 200);

        ArrayList<Transaction> list = balancePayloadResponse.getPayload().getTransactions();

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println("Reference Number Matched in the Response Payload");
            if (reference_number.equals(list.get(i).getTransaction_number())) {
                Assert.assertEquals(list.get(i).getPast_balance(), wallet_amount);
                Assert.assertEquals(list.get(i + 1).getPast_balance(), available_balance);
                Assert.assertEquals(list.get(i).getRunning_balance().getOrg_new_balance(),
                        list.get(i).getRunning_balance().getOrg_previous_balance());
                Assert.assertEquals(list.get(i + 1).getRunning_balance().getOrg_new_balance(),
                        list.get(i + 1).getRunning_balance().getOrg_previous_balance());
                break;
            }
        }
        System.out.println("------- TestGetAllTheTransactions  Ended-----------");
    }

    @Test(priority = 4)
    public void TestFundReceivedAndUpdatedBalance() {

        System.out.println("------- TestFundReceivedAndUpdatedBalance  Started-----------");

        String email = getValueFromUserPropertiesFile("USER_2_EMAIL_ID");
        if (getValueFromConfigPropertiesFile(email) != null) {
            access_token = getValueFromConfigPropertiesFile(email);
        } else {
            login(email, getValueFromUserPropertiesFile("USER_2_PASSWORD"));
        }

        org_id = getValueFromConfigPropertiesFile("org_id");
        RestAssured.baseURI = String.format(GET_BALANCE_URI, org_id, team_id);

        Map<String, Object> requestHeaders = new HashMap();
        requestHeaders.put(AUTHORIZATION.getFieldName(), "Bearer " + access_token);
        requestHeaders.put(ACCEPT.getFieldName(), ContentType.JSON);
        requestHeaders.put(AUTHORITY.getFieldName(), "api.spenmo-staging.com");
        requestHeaders.put(ORIGIN.getFieldName(), "https://dashboard.spenmo-staging.com");
        requestHeaders.put(REFERER.getFieldName(), "https://dashboard.spenmo-staging.com/");

        Response res = RestAssured.given().contentType(contentTypeJson)
                .headers(requestHeaders).when().log().all().get().then().extract().response();

        Assert.assertEquals(HttpStatus.SC_OK, res.statusCode());

        BalancePayloadResponse balancePayloadResponse = gson.fromJson(res.getBody().prettyPrint(), BalancePayloadResponse.class);

        Assert.assertEquals(balancePayloadResponse.getStatus(), 200);

        available_balance1 = balancePayloadResponse.getPayload().getTeam().getYour_membership_details().getUser_wallet().getAvailable_balance();
        System.out.println("available balance is  : " + available_balance1);

        Assert.assertEquals((Double.parseDouble(available_balance1)), (amount + Double.parseDouble(available_balance)));

        System.out.println("------- TestFundReceivedAndUpdatedBalance Ended-----------");

    }

    private Object getFieldValues() {
        FieldValues fieldValues = new FieldValues();
        fieldValues.setTransaction_number("true");
        fieldValues.setAmount("true");
        fieldValues.setPast_balance("true");
        fieldValues.setAvailable_balance("true");
        fieldValues.setUser_id("true");
        fieldValues.setOrganisation_id("true");
        fieldValues.setCreated_at("true");
        fieldValues.setType("true");
        fieldValues.setDescription("true");
        fieldValues.setVendor_transaction_id("true");
        fieldValues.setMerchant("true");
        fieldValues.setCard_type("true");
        fieldValues.setCard_last_four("true");
        fieldValues.setForeign_currency_amount("true");
        fieldValues.setForeign_currency_code("true");
        fieldValues.setVendor_fee_amount("true");
        fieldValues.setSubwallet_id("true");
        fieldValues.setTeam_id("true");
        fieldValues.setReceipts("true");
        fieldValues.setCategory("true");
        fieldValues.setRunning_balance("true");
        return fieldValues;
    }

}
