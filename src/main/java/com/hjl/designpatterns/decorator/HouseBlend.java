package com.hjl.designpatterns.decorator;

/**
 * @author ：hjl
 * @date ：2021/5/5 20:05
 * @description：综合咖啡
 * @modified By：
 */
public class HouseBlend extends BaseBeverage{

    public HouseBlend() {
        setDescription("HouseBlend");
    }

    /**
     * 费用
     *
     * @return
     */
    @Override
    public double cost() {
        return 0.89;
    }
}
