package com.hjl.designpatterns.observer;

/**
 * @author ：hjl
 * @date ：2021/5/4 21:00
 * @description：启动类
 * @modified By：
 */
public class Demo {

    public static void main(String[] args) {
        // 创建可观察者和观察者
        WeatherStation subject = new WeatherStation(10);
        DisplayObserver displayObserver = new DisplayObserver(subject);
        MaxTemperatureObserver maxDisplay = new MaxTemperatureObserver(subject);
        // 观察者数据展示
        displayObserver.display();
        maxDisplay.display();
        // 改变温度通知观察者
        subject.setTemperature(1);
        subject.setTemperature(20);
        subject.setTemperature(15);
    }
}
