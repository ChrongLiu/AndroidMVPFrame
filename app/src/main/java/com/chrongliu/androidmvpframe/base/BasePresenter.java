package com.chrongliu.androidmvpframe.base;

/**
 * 基础Presenter
 *
 * @param <T>
 */
public interface BasePresenter<T> {

    /**
     * 绑定View
     *
     * @param view
     */
    void attachView(T view);

    /**
     * 解除View
     */
    void detachView();
}
