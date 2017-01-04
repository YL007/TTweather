package com.example.ttweather.util;

/**
 * Created by 磊 on 2017/1/4.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
