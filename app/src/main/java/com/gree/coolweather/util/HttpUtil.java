package com.gree.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    /**
     * 全国所有市县的数据都是从服务器端获得的，因此服务器的交互必不可少
     * 发起一条HTTP请求只需要调用sendOkHttpRequest方法
     * @param address 传入请求地址
     * @param callback 并注册一个回调来处理服务器响应
     */

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
