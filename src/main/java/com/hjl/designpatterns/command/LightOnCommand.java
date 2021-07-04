package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 16:51
 * @description：
 * @modified By：
 */
public class LightOnCommand implements Command{

    /**
     * 灯对象
     */
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 执行
     */
    @Override
    public void execute() {
        light.on();
    }

    /**
     * 撤销
     */
    @Override
    public void undo() {
        light.off();
    }

}
