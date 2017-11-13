package com.dabin.www.mi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

public class MainActivity extends AppCompatActivity {
    String Token = "G/D3mu+HvTxfyyfMRdQD6t6MFbbKAxbV+QUhohtL8vlJq+GUr/0lyR60tf3FYRwjbp61shUok8f0b/D8VjHcPg==";//test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //建立与服务器的链接
        RongIM.connect(Token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {
                //Connect Token 失效的状态处理，需要重新获取 Token
            }
            @Override
            public void onSuccess(String s) { //成功
            }
            @Override
            public void onError(RongIMClient.ErrorCode errorCode) { //失败
            }
        });

        /**
         * 启动单聊
         * context - 应用上下文。
         * targetUserId - 要与之聊天的用户 Id。
         * title - 聊天的标题，如果传入空值，则默认显示与之聊天的用户名称。
         */
        if (RongIM.getInstance() != null) {
            RongIM.getInstance().startPrivateChat(MainActivity.this, "wangjingjing", "");
        }

    }
}


