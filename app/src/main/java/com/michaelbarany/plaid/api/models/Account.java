
package com.michaelbarany.plaid.api.models;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Account {

    @Expose
    private Info info;
    @Expose
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
