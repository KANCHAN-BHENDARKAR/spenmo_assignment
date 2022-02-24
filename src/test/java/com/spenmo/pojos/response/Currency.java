package com.spenmo.pojos.response;

public class Currency {


    public int id;
    public String currency_code;
    public String currency_description;
    public Object created_at;
    public String updated_at;
    public Object deleted_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getCurrency_description() {
        return currency_description;
    }

    public void setCurrency_description(String currency_description) {
        this.currency_description = currency_description;
    }

    public Object getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Object created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Object getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Object deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getIso_currency_code() {
        return iso_currency_code;
    }

    public void setIso_currency_code(String iso_currency_code) {
        this.iso_currency_code = iso_currency_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String iso_currency_code;
    public String country;

}
