package com.hjl.designpatterns.decorator;

/**
 * @author ：hjl
 * @date ：2021/5/5 20:10
 * @description：奶泡配料
 * @modified By：
 */
public class Whip extends BaseCondimentDecorator{

    private BaseBeverage baseBeverage;

    public Whip(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ",whip";
    }

    /**
     * 费用
     *
     * @return
     */
    @Override
    public double cost() {
        return 0.1 + baseBeverage.cost();
    }
}
