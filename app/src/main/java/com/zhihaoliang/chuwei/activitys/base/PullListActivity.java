package com.zhihaoliang.chuwei.activitys.base;


import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public class PullListActivity extends BaseActivity {

    @ViewById
    public PullToRefreshListView pullList;
}
