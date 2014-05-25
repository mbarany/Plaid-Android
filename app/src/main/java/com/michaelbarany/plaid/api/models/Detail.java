
package com.michaelbarany.plaid.api.models;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Detail {

    @Expose
    private int state;
    @Expose
    private double name;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

}
