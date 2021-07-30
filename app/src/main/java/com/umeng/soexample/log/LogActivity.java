package com.umeng.soexample.log;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.umeng.soexample.R;
import com.umeng.soexample.log.views.LogFragmentPagerAdapter;
import com.umeng.soexample.views.Tab;

/**
 * Created by wangfei on 2018/1/22.
 */

public class LogActivity extends Activity {
    Tab uapp,upush,ushare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        uapp = (Tab)findViewById(R.id.uapp);
        upush = (Tab)findViewById(R.id.upush);
        ushare = (Tab)findViewById(R.id.ushare);

    }
    public void setTitle(String title){
        ((TextView)findViewById(R.id.umeng_title)).setText(title);
    }

}
