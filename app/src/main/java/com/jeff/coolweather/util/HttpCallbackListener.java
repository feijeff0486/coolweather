package com.jeff.coolweather.util;

/**
 * 回调服务返回的结果接口
 * Created by 小太阳jeff on 2017/4/22.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
