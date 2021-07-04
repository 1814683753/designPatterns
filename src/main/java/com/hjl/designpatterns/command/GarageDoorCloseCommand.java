package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 17:03
 * @description：
 * @modified By：
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    /**
     * 执行
     */
    @Override
    public void execute() {
        garageDoor.down();
    }

    /**
     * 撤销
     */
    @Override
    public void undo() {
        garageDoor.up();
    }
}
