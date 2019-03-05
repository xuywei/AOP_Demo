package com.example.aop_demo;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.lib.apt.Router;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

@Router("router_activity")
public class RouterActivity extends SwipeBackActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_router);
    }
}
