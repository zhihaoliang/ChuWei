package com.zhihaoliang.chuwei.activitys.base;


import android.content.Context;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public abstract class PullListActivity<T> extends BaseActivity {

    @ViewById
    public PullToRefreshListView pullList;


    private class MyArrayAdapter<T> extends ArrayAdapter{

        public MyArrayAdapter(Context context, int resource) {
            super(context, resource);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getView(position,convertView,parent);
        }

    }

    public abstract View getView(int position, View convertView, ViewGroup parent);
}
