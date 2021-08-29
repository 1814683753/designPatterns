package com.hjl.designpatterns.adapter;

/**
 * @author ：hjl
 * @date ：2021/7/4 22:01
 * @description：适配器demo
 * @modified By：
 */
public class Demo {

    public static void main(String[] args) {
        // 对象适配器
        MallardDuck duck = new
                MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter adapter = new TurkeyAdapter(wildTurkey);
        testDuck(duck);
        System.out.println("======================");
        testDuck(adapter);

        // 类适配器 要同时继承目标类和被适配类

    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
