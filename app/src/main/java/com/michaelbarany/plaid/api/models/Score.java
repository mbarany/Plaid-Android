
package com.michaelbarany.plaid.api.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Score {

    @Expose
    private double master;
    @Expose
    private Detail detail;

    public double getMaster() {
        return master;
    }

    public void setMaster(double master) {
        this.master = master;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

}
