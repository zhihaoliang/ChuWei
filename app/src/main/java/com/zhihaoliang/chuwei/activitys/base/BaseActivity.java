package com.zhihaoliang.chuwei.activitys.base;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhihaoliang.chuwei.R;


/**
 * Created by haoliangzhi on 2015/8/8.
 */
public class BaseActivity extends AppCompatActivity {

    public void setActionBar(int titleId){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar == null){
            return ;
        }
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater layoutInflater = getLayoutInflater();
        View titleView = layoutInflater.inflate(R.layout.title_bar_name, null);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        actionBar.setCustomView(titleView, layoutParams);
        TextView textView = (TextView)titleView.findViewById(R.id.title_name);
        textView.setText(titleId);

    }
}
