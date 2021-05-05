package com.hjl.designpatterns.observer;

/**
 * @author ：hjl
 * @date ：2021/5/4 20:52
 * @description：展示观察者
 * @modified By：
 */
public class DisplayObserver implements Observer, DisplayElement {

    /**
     * 温度
     */
    private int temperature;

    public DisplayObserver(Subject subject) {
        // 订阅消息
        subject.addRegistered(this);
    }

    /**
     * 接收订阅后修改
     *
     * @param temperature
     */
    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    /**
     * 展示数据
     */
    @Override
    public void display() {
        System.out.println("当前气温：" + temperature);
    }
}
