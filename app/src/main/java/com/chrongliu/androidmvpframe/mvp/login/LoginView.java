package com.chrongliu.androidmvpframe.mvp.login;

import com.chrongliu.androidmvpframe.base.BaseView;

/**
 * 登录View
 */
public interface LoginView extends BaseView {

    /**
     * 登录成功
     *
     * @param msg
     */
    void loginSuccess(String msg);

    /**
     * 登录失败
     *
     * @param msg
     */
    void loginFailed(String msg);
}
