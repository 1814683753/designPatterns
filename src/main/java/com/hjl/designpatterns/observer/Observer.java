package com.hjl.designpatterns.observer;

/**
 * @author ：hjl
 * @date ：2021/5/4 18:13
 * @description：观察者接口
 * @modified By：hjl
 */
public interface Observer {
    /**
     * 接收订阅后修改
     *
     * @param temperature
     */
    void update(int temperature);
}
