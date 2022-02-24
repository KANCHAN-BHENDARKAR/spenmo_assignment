package com.spenmo.pojos.response;

public class UserCard {

    public String id;
    public String cardholder_name;
    public String card_billing_address;
    public String card_last_four;
    public String card_validity_from;
    public String card_validity_to;
    public int is_single_use;
    public String is_physical;
    public int card_transaction_limit;
    public int card_monthly_limit;
    public int default_currency_id;
    public Object card_description;
    public Object card_tag;
    public int is_active;
    public Object approved_by;
    public String wallet_id;
    public String organisation_id;
    public Object deleted_at;
    public String created_at;
    public String updated_at;
    public String proxy_number;
    public String mm_id;
    public int card_expiry_month;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardholder_name() {
        return cardholder_name;
    }

    public void setCardholder_name(String cardholder_name) {
        this.cardholder_name = cardholder_name;
    }

    public String getCard_billing_address() {
        return card_billing_address;
    }

    public void setCard_billing_address(String card_billing_address) {
        this.card_billing_address = card_billing_address;
    }

    public String getCard_last_four() {
        return card_last_four;
    }

    public void setCard_last_four(String card_last_four) {
        this.card_last_four = card_last_four;
    }

    public String getCard_validity_from() {
        return card_validity_from;
    }

    public void setCard_validity_from(String card_validity_from) {
        this.card_validity_from = card_validity_from;
    }

    public String getCard_validity_to() {
        return card_validity_to;
    }

    public void setCard_validity_to(String card_validity_to) {
        this.card_validity_to = card_validity_to;
    }

    public int getIs_single_use() {
        return is_single_use;
    }

    public void setIs_single_use(int is_single_use) {
        this.is_single_use = is_single_use;
    }

    public String getIs_physical() {
        return is_physical;
    }

    public void setIs_physical(String is_physical) {
        this.is_physical = is_physical;
    }

    public int getCard_transaction_limit() {
        return card_transaction_limit;
    }

    public void setCard_transaction_limit(int card_transaction_limit) {
        this.card_transaction_limit = card_transaction_limit;
    }

    public int getCard_monthly_limit() {
        return card_monthly_limit;
    }

    public void setCard_monthly_limit(int card_monthly_limit) {
        this.card_monthly_limit = card_monthly_limit;
    }

    public int getDefault_currency_id() {
        return default_currency_id;
    }

    public void setDefault_currency_id(int default_currency_id) {
        this.default_currency_id = default_currency_id;
    }

    public Object getCard_description() {
        return card_description;
    }

    public void setCard_description(Object card_description) {
        this.card_description = card_description;
    }

    public Object getCard_tag() {
        return card_tag;
    }

    public void setCard_tag(Object card_tag) {
        this.card_tag = card_tag;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public Object getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(Object approved_by) {
        this.approved_by = approved_by;
    }

    public String getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(String wallet_id) {
        this.wallet_id = wallet_id;
    }

    public String getOrganisation_id() {
        return organisation_id;
    }

    public void setOrganisation_id(String organisation_id) {
        this.organisation_id = organisation_id;
    }

    public Object getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Object deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getProxy_number() {
        return proxy_number;
    }

    public void setProxy_number(String proxy_number) {
        this.proxy_number = proxy_number;
    }

    public String getMm_id() {
        return mm_id;
    }

    public void setMm_id(String mm_id) {
        this.mm_id = mm_id;
    }

    public int getCard_expiry_month() {
        return card_expiry_month;
    }

    public void setCard_expiry_month(int card_expiry_month) {
        this.card_expiry_month = card_expiry_month;
    }

    public int getCard_expiry_year() {
        return card_expiry_year;
    }

    public void setCard_expiry_year(int card_expiry_year) {
        this.card_expiry_year = card_expiry_year;
    }

    public int getCard_status_id() {
        return card_status_id;
    }

    public void setCard_status_id(int card_status_id) {
        this.card_status_id = card_status_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public String getLast_transaction() {
        return last_transaction;
    }

    public void setLast_transaction(String last_transaction) {
        this.last_transaction = last_transaction;
    }

    public boolean isHas_set_pin() {
        return has_set_pin;
    }

    public void setHas_set_pin(boolean has_set_pin) {
        this.has_set_pin = has_set_pin;
    }

    public Object getAdditional() {
        return additional;
    }

    public void setAdditional(Object additional) {
        this.additional = additional;
    }

    public Object getExpense_category_id() {
        return expense_category_id;
    }

    public void setExpense_category_id(Object expense_category_id) {
        this.expense_category_id = expense_category_id;
    }

    public int card_expiry_year;
    public int card_status_id;
    public String color;
    public String name;
    public String color_name;
    public String last_transaction;
    public boolean has_set_pin;
    public Object additional;
    public Object expense_category_id;

}
