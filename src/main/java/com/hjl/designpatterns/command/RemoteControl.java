package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 17:29
 * @description：
 * @modified By：
 */
public class RemoteControl {
    /**
     * 开命令集合
     */
    private Command[] onCommands;
    /**
     * 关命令集合
     */
    private Command[] offCommands;
    /**
     * 撤消命令,撤销上一个动作
     */
    private Command unDoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        // 用空命令初始化，避免后续调用要做非空判断
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        unDoCommand = noCommand;
    }

    public void setCommand(int index,Command onCommand,Command offCommand){
        offCommands[index] = offCommand;
        onCommands[index] = onCommand;
    }

    public void onButtonWasPressed(int index){
        onCommands[index].execute();
        unDoCommand = onCommands[index];
    }

    public void offButtonWasPressed(int index){
        offCommands[index].execute();
        unDoCommand = offCommands[index];
    }

    public void unDoButtonWasPressed(){
        unDoCommand.undo();
    }

}
