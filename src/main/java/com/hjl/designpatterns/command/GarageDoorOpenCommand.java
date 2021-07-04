package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 17:03
 * @description：
 * @modified By：
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    /**
     * 执行
     */
    @Override
    public void execute() {
        garageDoor.up();
    }

    /**
     * 撤销
     */
    @Override
    public void undo() {
        garageDoor.down();
    }
}
