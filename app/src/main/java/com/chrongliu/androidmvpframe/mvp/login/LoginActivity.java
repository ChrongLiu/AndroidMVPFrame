package com.chrongliu.androidmvpframe.mvp.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chrongliu.androidmvpframe.R;
import com.chrongliu.androidmvpframe.base.BaseActivity;
import com.chrongliu.androidmvpframe.model.UserModel;

/**
 * 登录Activity
 */
public class LoginActivity extends BaseActivity implements LoginView {
    /** 用户名 */
    private EditText mEtUsername;
    /** 密码 */
    private EditText mEtPassword;
    /** 登录按钮 */
    private Button mBtnLogin;

    private UserModel user;

    private LoginPresenterImpl mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        mEtUsername = findViewById(R.id.et_username);
        mEtPassword = findViewById(R.id.et_password);
        mBtnLogin = findViewById(R.id.btn_login);
    }

    @Override
    public void initData() {
        mLoginPresenter = new LoginPresenterImpl();
        mLoginPresenter.attachView(this);

        //登录
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = new UserModel();
                user.setUsername(mEtUsername.getText().toString());
                user.setPassword(mEtPassword.getText().toString());
                mLoginPresenter.login(user);
            }
        });
    }

    @Override
    public void loginSuccess(String msg) {
        showToast(msg);
    }

    @Override
    public void loginFailed(String msg) {
        showToast(msg);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLoginPresenter.detachView();
    }
}
