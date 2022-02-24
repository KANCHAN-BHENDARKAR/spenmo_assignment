package com.spenmo.pojos.response;

import java.util.ArrayList;
import java.util.Date;

public class Payload {

    public String access_token;
    public String org_id;
    public String user_id;
    public Date request_at;
    public String expires_at;
    public String status_message;
    public Team team;
    public String reference_number;
    public int amount;
    public String currency_code;
    public boolean is_scheduled;

    public ArrayList<Transaction> transactions;
    public int count;
    public XeroCounts xero_counts;

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public XeroCounts getXero_counts() {
        return xero_counts;
    }

    public void setXero_counts(XeroCounts xero_counts) {
        this.xero_counts = xero_counts;
    }

    public String getReference_number() {
        return reference_number;
    }

    public void setReference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public boolean isIs_scheduled() {
        return is_scheduled;
    }

    public void setIs_scheduled(boolean is_scheduled) {
        this.is_scheduled = is_scheduled;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getRequest_at() {
        return request_at;
    }

    public void setRequest_at(Date request_at) {
        this.request_at = request_at;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}
