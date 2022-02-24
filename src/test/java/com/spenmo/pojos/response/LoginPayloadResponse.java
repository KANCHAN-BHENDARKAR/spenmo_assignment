package com.spenmo.pojos.response;

public class LoginPayloadResponse {

    public Payload payload;
    public int status;

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }




}
