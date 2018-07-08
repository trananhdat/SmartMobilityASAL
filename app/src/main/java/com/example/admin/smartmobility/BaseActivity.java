package com.example.admin.smartmobility;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kaopiz.kprogresshud.KProgressHUD;

public abstract class BaseActivity extends AppCompatActivity {

    private KProgressHUD mKProgressHUD;

    public abstract int getLayoutRes();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());

        mKProgressHUD = KProgressHUD.create(this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setCancellable(true)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f);
    }

    public void showHUD() {
        if (!mKProgressHUD.isShowing()) {
            mKProgressHUD.show();
        }
    }

    public void dismissHUD() {
        if (mKProgressHUD.isShowing()) {
            mKProgressHUD.dismiss();
        }
    }
}
