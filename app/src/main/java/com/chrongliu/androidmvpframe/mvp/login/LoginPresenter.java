package com.chrongliu.androidmvpframe.mvp.login;

import com.chrongliu.androidmvpframe.base.BasePresenter;
import com.chrongliu.androidmvpframe.model.UserModel;

/**
 * 登录Presenter
 */
public interface LoginPresenter extends BasePresenter<LoginView> {

    /**
     * 登录
     *
     * @param user
     */
    void login(UserModel user);
}
