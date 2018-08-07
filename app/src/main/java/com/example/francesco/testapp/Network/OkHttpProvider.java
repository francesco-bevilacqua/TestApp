package com.example.francesco.testapp.Network;

import okhttp3.OkHttpClient;

public class OkHttpProvider {

    private static OkHttpProvider okHttpProvider = null;

    public static OkHttpProvider getInstance() {
        if (OkHttpProvider.okHttpProvider == null) {
            okHttpProvider = new OkHttpProvider();
        }
        return okHttpProvider;
    }

    private OkHttpClient okHttpClient;

    private OkHttpProvider() {
        okHttpClient = new OkHttpClient();
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }
}