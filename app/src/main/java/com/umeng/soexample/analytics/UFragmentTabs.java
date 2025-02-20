package com.umeng.soexample.analytics;

import android.os.Bundle;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentTabHost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.umeng.analytics.MobclickAgent;
import com.umeng.soexample.BaseActivity;
import com.umeng.soexample.R;

/**
 * Created by cnzz on 18/2/2.
 *
 * <p>
 * The demo shows how to integrate analytic SDK into Application based on
 * 'Fragment'. PageView ( like Fragment or viewgroup) can be tracked with new
 * API.
 * </p>
 * <p>
 * SDKV4.6.2 之前 页面访问只能统计到 'Activity' 级别，不能统计到每个 'Fragment' .现在 新增的页面统计API，可以用来统计
 * Fragment 这样颗粒度更细的页面。
 * </p>
 */

public class UFragmentTabs extends BaseActivity {
    @Override
    public int getLayout() {
        return 0;
    }
/*
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("统计UApp");
        setBackVisibily();

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("Simple"), FragmentSimple.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator("Contacts"), FragmentContacts.class, null);

    }

    @Override
    public int getLayout() {
        return R.layout.umeng_example_analytics_fragment_tabs;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public static class FragmentSimple extends Fragment {
        private final String mPageName = "FragmentSimple";

        static FragmentSimple newInstance(int num) {
            FragmentSimple f = new FragmentSimple();

            // Supply num input as an argument.
            Bundle args = new Bundle();
            args.putInt("num", num);
            f.setArguments(args);

            return f;
        }

        @Override
        public void onPause() {
            // TODO Auto-generated method stub
            super.onPause();
            MobclickAgent.onPageEnd(mPageName);
        }

        @Override
        public void onResume() {
            // TODO Auto-generated method stub
            super.onResume();
            MobclickAgent.onPageStart(mPageName);
        }

        *//**
         * The Fragment's UI is just a simple text view showing its instance
         * number.
         *//*
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            TextView tv = new TextView(getActivity());
            tv.setText("Fragment Simple");
            return tv;
        }
    }

    public static class FragmentContacts extends Fragment {
        private final String mPageName = "FragmentContacts";

        static FragmentSimple newInstance(int num) {
            FragmentSimple f = new FragmentSimple();

            // Supply num input as an argument.
            Bundle args = new Bundle();
            args.putInt("num", num);
            f.setArguments(args);

            return f;
        }

        *//**
         * The Fragment's UI is just a simple text view showing its instance
         * number.
         *//*
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            TextView tv = new TextView(getActivity());
            tv.setText("Fragment Contacts");
            return tv;
        }

        @Override
        public void onPause() {
            // TODO Auto-generated method stub
            super.onPause();
            MobclickAgent.onPageEnd(mPageName);
        }

        @Override
        public void onResume() {
            // TODO Auto-generated method stub
            super.onResume();
            MobclickAgent.onPageStart(mPageName);
        }
    }*/
}
