package com.chrongliu.androidmvpframe.mvp.login;

import android.text.TextUtils;

import com.chrongliu.androidmvpframe.model.UserModel;

/**
 * 登录Presenter实现类
 */
public class LoginPresenterImpl implements LoginPresenter {

    private LoginView mLoginView;


    @Override
    public void attachView(LoginView view) {
        this.mLoginView = view;
    }

    @Override
    public void detachView() {
        mLoginView = null;
    }

    @Override
    public void login(UserModel user) {
        if (TextUtils.isEmpty(user.getUsername()) || TextUtils.isEmpty(user.getPassword())) {
            mLoginView.loginFailed("用户名密码不能为空");
        } else {
            if (user.getUsername().equalsIgnoreCase("chrongliu") && user.getPassword().equalsIgnoreCase("123")) {
                mLoginView.loginSuccess("登录成功");
            } else {
                mLoginView.loginFailed("登录失败");
            }
        }
    }
}
