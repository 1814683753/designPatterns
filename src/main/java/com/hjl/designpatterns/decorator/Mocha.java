package com.hjl.designpatterns.decorator;

/**
 * @author ：hjl
 * @date ：2021/5/5 20:06
 * @description：摩卡配料包装
 * @modified By：
 */
public class Mocha extends  BaseCondimentDecorator{

    private BaseBeverage baseBeverage;

    public Mocha(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ",mocha";
    }

    /**
     * 费用
     *
     * @return
     */
    @Override
    public double cost() {
        return 0.2 + baseBeverage.cost();
    }
}
