package com.huatec.edu.mobileshop_lyd.activity;

import android.widget.TextView;


import com.huatec.edu.mobileshop_lyd.R;
import com.huatec.edu.mobileshop_lyd.common.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MyOrderActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    public int getContentViewId(){return R.layout.activity_my_order;}

    @Override
    protected void initView() {
        super.initView();
        tvTitle.setText("我的订单");
    }
   @OnClick(R.id.iv_back)
    void close(){finish();}


}

