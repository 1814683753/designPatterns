package com.hjl.designpatterns.adapter;

/**
 * @author ：hjl
 * @date ：2021/7/4 21:57
 * @description：
 * @modified By：
 */
public class WildTurkey implements Turkey {
    /**
     * 鸡叫
     */
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    /**
     * 飞
     */
    @Override
    public void fly() {
        System.out.println("short fly......");
    }
}
