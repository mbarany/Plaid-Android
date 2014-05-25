package com.michaelbarany.plaid.api;

import com.michaelbarany.plaid.api.models.BankAccount;
import com.michaelbarany.plaid.api.models.Institution;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface Service {
    @GET("/institutions")
    void institutions(Callback<List<Institution>> callback);

    @GET("/accounts")
    void accounts(Callback<List<BankAccount>> callback);

    @GET("/account/{accountId}")
    void account(@Path("accountId") int accountId, Callback<BankAccount> callback);
}
