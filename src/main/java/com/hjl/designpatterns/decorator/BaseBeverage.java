package com.hjl.designpatterns.decorator;

/**
 * @author ：hjl
 * @date ：2021/5/5 16:33
 * @description：饮料抽象类
 * @modified By：
 */
public abstract class BaseBeverage {

    /**
     * 描述
     */
    private String description = "Unknown beverage";
    /**
     * 费用
     * @return
     */
    public abstract double cost();

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
