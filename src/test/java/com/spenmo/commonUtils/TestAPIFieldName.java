package com.spenmo.commonUtils;

public enum TestAPIFieldName {

    FIELDS("fields"),
    FILTERS("filters"),
    ORGANISATION_ID("organisation_id"),
    LIMIT("limit"),
    AUTHORIZATION("authorization"),
    TRANSACTION_NUMBER("transaction_number"),
    AMOUNT("amount"),
    PAST_BALANCE("past_balance"),
    AVAILABLE_BALANCE("available_balance"),
    CREATED_AT("created_at"),
    DESCRIPTION("description"),
    MERCHANT("merchant"),
    CARD_TYPE("card_type"),
    CARD_LAST_FOUR("card_last_four"),
    FOREIGN_CURRENCY_AMOUNT("foreign_currency_amount"),
    FOREIGN_CURRENCY_CODE("foreign_currency_code"),
    VENDOR_FEE_AMOUNT("vendor_fee_amount"),
    SUBWALLET_ID("subwallet_id"),
    TEAM_ID("team_id"),
    RECEIPTS("receipts"),
    CATEGORY("category"),
    RUNNING_BALANCE("running_balance"),
    AUTHORITY("authority"),
    ACCEPT("accept"),
    ORIGIN("origin"),
    REFERER("referer"),
    SENDER("sender"),
    RECEIVER("receiver"),
    EMAIL_ID("email"),
    PASSWORD("password"),
    DEVICE("device"),
    PORTAL("portal"),
    TO_AMOUNT("to_amount"),
    FROM_AMOUNT("from_amount"),
    TO_CURRENCY("to_currency"),
    FROM_CURRENCY("from_currency"),
    FEE("fee"),
    TYPE("type"),
    TEAM("team"),
    USER("user"),
    USER_ID("user_id");


    private String fieldName;

    TestAPIFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
