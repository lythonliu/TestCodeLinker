package com.lythonliu.testcodelinker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public String getAppName() {
        return BuildConfig.APP_NAME;
    }
}
