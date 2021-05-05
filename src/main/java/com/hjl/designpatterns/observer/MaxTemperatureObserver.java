package com.hjl.designpatterns.observer;

/**
 * @author ：hjl
 * @date ：2021/5/4 20:55
 * @description：展示最高气温的观察者
 * @modified By：
 */
public class MaxTemperatureObserver implements Observer, DisplayElement {

    /**
     * 最高温度
     */
    private int maxTemperature;

    public MaxTemperatureObserver(Subject subject) {
        subject.addRegistered(this);
        maxTemperature = Integer.MIN_VALUE;
    }

    /**
     * 展示数据
     */
    @Override
    public void display() {
        System.out.println("最高气温为：" + maxTemperature);

    }

    /**
     * 接收订阅后修改
     *
     * @param temperature
     */
    @Override
    public void update(int temperature) {
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        display();
    }
}
