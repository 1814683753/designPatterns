package com.hjl.designpatterns.adapter;

/**
 * @author ：hjl
 * @date ：2021/7/4 21:58
 * @description：
 * @modified By：
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    /**
     * 鸭子叫
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 飞
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
