package com.hjl.designpatterns.factory;

/**
 * @author ：hjl
 * @date ：2021/7/4 15:52
 * @description：披萨
 * @modified By：
 */
public abstract class BasePizza {
    /**
     * 名字
     */
    private String name;

    public void prepare() {
        System.out.println("prepare pizza " + name);
    }

    public void bake() {
        System.out.println("bake pizza " + name);
    }

    public void cut() {
        System.out.println("cut pizza " + name);
    }

    public void box() {
        System.out.println("box pizza " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
