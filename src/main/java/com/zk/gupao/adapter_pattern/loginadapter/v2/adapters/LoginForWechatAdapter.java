package com.zk.gupao.adapter_pattern.loginadapter.v2.adapters;

import com.zk.gupao.adapter_pattern.loginadapter.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
