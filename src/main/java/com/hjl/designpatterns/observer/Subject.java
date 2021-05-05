package com.hjl.designpatterns.observer;

/**
 * @author ：hjl
 * @date ：2021/5/4 18:13
 * @description：主题接口
 * @modified By：
 */
public interface Subject {
    /**
     * 添加观察者/订阅
     *
     * @param observer 观察者
     */
    void addRegistered(Observer observer);

    /**
     * 删除观察者/取消订阅
     *
     * @param observer 观察者
     */
    void removeRegistered(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
