package com.michaelbarany.plaid.api;

import com.michaelbarany.plaid.BuildConfig;

import retrofit.RestAdapter;

public final class Api {
    private static final Api INSTANCE = new Api();
    private final RestAdapter mRestAdapter;

    private Api() {
        RestAdapter.Builder builder = new RestAdapter.Builder()
            .setEndpoint(BuildConfig.API_URL);
        if (BuildConfig.DEBUG) {
            builder.setLogLevel(RestAdapter.LogLevel.FULL);
        }
        mRestAdapter = builder.build();
    }

    public static Api getInstance() {
        return INSTANCE;
    }

    public <T> T getService(Class<T> service) {
        return mRestAdapter.create(service);
    }
}
