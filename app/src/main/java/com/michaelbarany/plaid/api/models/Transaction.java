
package com.michaelbarany.plaid.api.models;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Transaction {

    @Expose
    private Score score;
    @Expose
    private Type type;
    @Expose
    private double amount;
    @Expose
    private boolean pending;
    @Expose
    private String date;
    @Expose
    private String name;
    @Expose
    private String _account;
    @Expose
    private String _id;
    @Expose
    private String _entity;

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_account() {
        return _account;
    }

    public void set_account(String _account) {
        this._account = _account;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_entity() {
        return _entity;
    }

    public void set_entity(String _entity) {
        this._entity = _entity;
    }

}
