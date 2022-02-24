package com.spenmo.pojos.response;

import com.spenmo.pojos.response.Counts;
import com.spenmo.pojos.response.UserCard;
import com.spenmo.pojos.response.UserWallet;

import java.util.ArrayList;

public class YourMembershipDetails {

    public UserWallet user_wallet;
    public ArrayList<UserCard> user_cards;
    public Counts counts;

    public UserWallet getUser_wallet() {
        return user_wallet;
    }

    public void setUser_wallet(UserWallet user_wallet) {
        this.user_wallet = user_wallet;
    }

    public ArrayList<UserCard> getUser_cards() {
        return user_cards;
    }

    public void setUser_cards(ArrayList<UserCard> user_cards) {
        this.user_cards = user_cards;
    }

    public Counts getCounts() {
        return counts;
    }

    public void setCounts(Counts counts) {
        this.counts = counts;
    }


}
