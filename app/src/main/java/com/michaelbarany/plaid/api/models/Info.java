
package com.michaelbarany.plaid.api.models;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Info {

    @Expose
    private String _id;
    @Expose
    private String _item;
    @Expose
    private String _user;
    @Expose
    private Balance balance;
    @Expose
    private Meta meta;
    @Expose
    private String institution_type;
    @Expose
    private String type;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_item() {
        return _item;
    }

    public void set_item(String _item) {
        this._item = _item;
    }

    public String get_user() {
        return _user;
    }

    public void set_user(String _user) {
        this._user = _user;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getInstitution_type() {
        return institution_type;
    }

    public void setInstitution_type(String institution_type) {
        this.institution_type = institution_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
