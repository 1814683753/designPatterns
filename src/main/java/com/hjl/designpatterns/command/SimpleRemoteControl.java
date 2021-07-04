package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 16:54
 * @description：
 * @modified By：
 */
public class SimpleRemoteControl {

    private Command command;


    public void buttonWasPressed() {
        if (command != null) {
            command.execute();
        }
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
