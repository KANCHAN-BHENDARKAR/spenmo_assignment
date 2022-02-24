package com.spenmo.pojos.response;

public class User {

    public String id;
    public String name;
    public Object profile_photo_url;
    public int mobile_country_code;
    public Object mobile_number;
    public String email;
    public int is_otp_verified;
    public String kyc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getProfile_photo_url() {
        return profile_photo_url;
    }

    public void setProfile_photo_url(Object profile_photo_url) {
        this.profile_photo_url = profile_photo_url;
    }

    public int getMobile_country_code() {
        return mobile_country_code;
    }

    public void setMobile_country_code(int mobile_country_code) {
        this.mobile_country_code = mobile_country_code;
    }

    public Object getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(Object mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIs_otp_verified() {
        return is_otp_verified;
    }

    public void setIs_otp_verified(int is_otp_verified) {
        this.is_otp_verified = is_otp_verified;
    }

    public String getKyc() {
        return kyc;
    }

    public void setKyc(String kyc) {
        this.kyc = kyc;
    }

    public String getOrganisation_id() {
        return organisation_id;
    }

    public void setOrganisation_id(String organisation_id) {
        this.organisation_id = organisation_id;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String organisation_id;
    public String id_type;
    public String zipcode;
    public String country;
    public String state;
    public String city;
    public String address_1;
    public String address_2;

}
