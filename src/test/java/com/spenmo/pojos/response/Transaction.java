package com.spenmo.pojos.response;

import com.spenmo.pojos.response.Category;
import com.spenmo.pojos.response.Organisation;
import com.spenmo.pojos.response.Receipts;
import com.spenmo.pojos.response.RunningBalance;

import java.util.ArrayList;

public class Transaction {

    public String transaction_number;
    public String amount;
    public String past_balance;
    public String available_balance;
    public String user_id;
    public String organisation_id;
    public String created_at;
    public String type;
    public String description;
    public String vendor_transaction_id;
    public String merchant;
    public Object card_type;
    public Object card_last_four;
    public Object foreign_currency_amount;
    public Object foreign_currency_code;
    public String vendor_fee_amount;
    public String subwallet_id;
    public String team_id;
    public RunningBalance running_balance;
    public String user_name;
    public String currency_code;
    public int xero_sync_status;
    public String xero_sync_status_message;
    public ArrayList<Object> xero_syncs;
    public Organisation organisation;



    public Receipts receipts;
    public Category category;

    public String getTransaction_number() {
        return transaction_number;
    }

    public void setTransaction_number(String transaction_number) {
        this.transaction_number = transaction_number;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPast_balance() {
        return past_balance;
    }

    public void setPast_balance(String past_balance) {
        this.past_balance = past_balance;
    }

    public String getAvailable_balance() {
        return available_balance;
    }

    public void setAvailable_balance(String available_balance) {
        this.available_balance = available_balance;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOrganisation_id() {
        return organisation_id;
    }

    public void setOrganisation_id(String organisation_id) {
        this.organisation_id = organisation_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor_transaction_id() {
        return vendor_transaction_id;
    }

    public void setVendor_transaction_id(String vendor_transaction_id) {
        this.vendor_transaction_id = vendor_transaction_id;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public Object getCard_type() {
        return card_type;
    }

    public void setCard_type(Object card_type) {
        this.card_type = card_type;
    }

    public Object getCard_last_four() {
        return card_last_four;
    }

    public void setCard_last_four(Object card_last_four) {
        this.card_last_four = card_last_four;
    }

    public Object getForeign_currency_amount() {
        return foreign_currency_amount;
    }

    public void setForeign_currency_amount(Object foreign_currency_amount) {
        this.foreign_currency_amount = foreign_currency_amount;
    }

    public Object getForeign_currency_code() {
        return foreign_currency_code;
    }

    public void setForeign_currency_code(Object foreign_currency_code) {
        this.foreign_currency_code = foreign_currency_code;
    }

    public String getVendor_fee_amount() {
        return vendor_fee_amount;
    }

    public void setVendor_fee_amount(String vendor_fee_amount) {
        this.vendor_fee_amount = vendor_fee_amount;
    }

    public String getSubwallet_id() {
        return subwallet_id;
    }

    public void setSubwallet_id(String subwallet_id) {
        this.subwallet_id = subwallet_id;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public RunningBalance getRunning_balance() {
        return running_balance;
    }

    public void setRunning_balance(RunningBalance running_balance) {
        this.running_balance = running_balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public int getXero_sync_status() {
        return xero_sync_status;
    }

    public void setXero_sync_status(int xero_sync_status) {
        this.xero_sync_status = xero_sync_status;
    }

    public String getXero_sync_status_message() {
        return xero_sync_status_message;
    }

    public void setXero_sync_status_message(String xero_sync_status_message) {
        this.xero_sync_status_message = xero_sync_status_message;
    }

    public ArrayList<Object> getXero_syncs() {
        return xero_syncs;
    }

    public void setXero_syncs(ArrayList<Object> xero_syncs) {
        this.xero_syncs = xero_syncs;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }


}
