package com.hjl.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：hjl
 * @date ：2021/5/4 20:43
 * @description: 气象站
 * @modified By：
 */
public class WeatherStation implements Subject {
    /**
     * 气温
     */
    private int temperature;
    /**
     * 观察者集合
     */
    private List<Observer> observerList;

    public WeatherStation(int temperature) {
        this.temperature = temperature;
        this.observerList = new ArrayList<>();
    }

    /**
     * 气温改变触发的方法
     */
    public void temperatureChange() {
        this.notifyObservers();
    }

    /**
     * 添加观察者/订阅
     *
     * @param observer 观察者
     */
    @Override
    public void addRegistered(Observer observer) {
        if (null != observer) {
            observerList.add(observer);
        }
    }

    /**
     * 删除观察者/取消订阅
     *
     * @param observer 观察者
     */
    @Override
    public void removeRegistered(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        // 举例，设置值的时候调用气温改变方法。
        this.temperatureChange();
    }
}
