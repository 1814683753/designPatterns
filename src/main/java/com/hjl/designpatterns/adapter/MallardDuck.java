package com.hjl.designpatterns.adapter;

/**
 * @author ：hjl
 * @date ：2021/7/4 21:54
 * @description：
 * @modified By：
 */
public class MallardDuck implements Duck {
    /**
     * 鸭子叫
     */
    @Override
    public void quack() {
        System.out.println("quack");
    }

    /**
     * 飞
     */
    @Override
    public void fly() {
        System.out.println("fly.........");
    }
}
