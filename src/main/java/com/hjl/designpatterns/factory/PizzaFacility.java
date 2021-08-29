package com.hjl.designpatterns.factory;

/**
 * @author ：hjl
 * @date ：2021/7/4 16:19
 * @description：
 * @modified By：
 */
public interface PizzaFacility {

    /**
     * 创建指定类型的pizza
     * @param type
     * @return
     */
    BasePizza createPizza(String type);
}
