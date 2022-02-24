package com.spenmo.pojos.response;

import java.util.ArrayList;

public class Team {

    public double expenses_this_month;
    public String refunds_this_month;
    public String reversals_this_month;
    public int lifetime_card_expense;

    public String id;
    public String team_name;
    public String organisation_id;
    public String created_by;
    public String modified_by;
    public String created_at;

    public String updated_at;
    public Object deleted_at;
    public String team_type;
    public String subwallet_id;
    public Subwallet subwallet;
    public int lifetime_refunds;
    public int lifetime_reversals;
    public int lifetime_cash_expense;

    public String name;
    public String wallet_id;
    public String wallet_amount;
    public int total_members;
    public ArrayList<TeamMember> team_members;
    public String currency_code;
    public double alotted_amount;
    public String company_role;
    public String your_membership;
    public String your_role;
    public YourMembershipDetails your_membership_details;
    public SpendingLimits spending_limits;

    public SpendingLimits getSpending_limits() {
        return spending_limits;
    }

    public void setSpending_limits(SpendingLimits spending_limits) {
        this.spending_limits = spending_limits;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getOrganisation_id() {
        return organisation_id;
    }

    public void setOrganisation_id(String organisation_id) {
        this.organisation_id = organisation_id;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
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

    public Object getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Object deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getSubwallet_id() {
        return subwallet_id;
    }

    public void setSubwallet_id(String subwallet_id) {
        this.subwallet_id = subwallet_id;
    }

    public Subwallet getSubwallet() {
        return subwallet;
    }

    public void setSubwallet(Subwallet subwallet) {
        this.subwallet = subwallet;
    }

    public String getYour_membership() {
        return your_membership;
    }


    public double getExpenses_this_month() {
        return expenses_this_month;
    }

    public void setExpenses_this_month(double expenses_this_month) {
        this.expenses_this_month = expenses_this_month;
    }

    public String getRefunds_this_month() {
        return refunds_this_month;
    }

    public void setRefunds_this_month(String refunds_this_month) {
        this.refunds_this_month = refunds_this_month;
    }

    public String getReversals_this_month() {
        return reversals_this_month;
    }

    public void setReversals_this_month(String reversals_this_month) {
        this.reversals_this_month = reversals_this_month;
    }

    public int getLifetime_card_expense() {
        return lifetime_card_expense;
    }

    public void setLifetime_card_expense(int lifetime_card_expense) {
        this.lifetime_card_expense = lifetime_card_expense;
    }

    public int getLifetime_refunds() {
        return lifetime_refunds;
    }

    public void setLifetime_refunds(int lifetime_refunds) {
        this.lifetime_refunds = lifetime_refunds;
    }

    public int getLifetime_reversals() {
        return lifetime_reversals;
    }

    public void setLifetime_reversals(int lifetime_reversals) {
        this.lifetime_reversals = lifetime_reversals;
    }

    public int getLifetime_cash_expense() {
        return lifetime_cash_expense;
    }

    public void setLifetime_cash_expense(int lifetime_cash_expense) {
        this.lifetime_cash_expense = lifetime_cash_expense;
    }

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

    public String getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(String wallet_id) {
        this.wallet_id = wallet_id;
    }

    public String getTeam_type() {
        return team_type;
    }

    public void setTeam_type(String team_type) {
        this.team_type = team_type;
    }

    public String getWallet_amount() {
        return wallet_amount;
    }

    public void setWallet_amount(String wallet_amount) {
        this.wallet_amount = wallet_amount;
    }

    public int getTotal_members() {
        return total_members;
    }

    public void setTotal_members(int total_members) {
        this.total_members = total_members;
    }

    public ArrayList<TeamMember> getTeam_members() {
        return team_members;
    }

    public void setTeam_members(ArrayList<TeamMember> team_members) {
        this.team_members = team_members;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public double getAlotted_amount() {
        return alotted_amount;
    }

    public void setAlotted_amount(double alotted_amount) {
        this.alotted_amount = alotted_amount;
    }

    public String getCompany_role() {
        return company_role;
    }

    public void setCompany_role(String company_role) {
        this.company_role = company_role;
    }


    public void setYour_membership(String your_membership) {
        this.your_membership = your_membership;
    }

    public String getYour_role() {
        return your_role;
    }

    public void setYour_role(String your_role) {
        this.your_role = your_role;
    }

    public YourMembershipDetails getYour_membership_details() {
        return your_membership_details;
    }

    public void setYour_membership_details(YourMembershipDetails your_membership_details) {
        this.your_membership_details = your_membership_details;
    }


}
