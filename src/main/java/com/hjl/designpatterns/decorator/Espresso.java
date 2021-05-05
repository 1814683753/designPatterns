package com.hjl.designpatterns.decorator;

/**
 * @author ：hjl
 * @date ：2021/5/5 20:03
 * @description：浓缩咖啡
 * @modified By：
 */
public class Espresso extends BaseBeverage{

    public Espresso() {
        setDescription("Espresso");
    }

    /**
     * 费用
     *
     * @return
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
