package com.spenmo.pojos.response;

import java.util.ArrayList;

public class Receipts {


    public int count;
    public ArrayList<String> urls;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }
}
