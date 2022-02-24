package com.spenmo.commonUtils;

public enum CurrencyName {

    SGD("SGD"),
    USD("USD"),
    INR("INR");


    private String currencyName;

    CurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
