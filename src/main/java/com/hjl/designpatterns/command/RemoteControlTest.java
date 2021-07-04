package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 16:58
 * @description：命令模式让动作请求者和动作执行者解耦
 * @modified By：
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        // 调用着，可以传入命令发送请求
        SimpleRemoteControl client = new SimpleRemoteControl();
        // 请求的接受者
        Light light = new Light();
        // 开灯命令
        LightOnCommand lightOn = new LightOnCommand(light);
        // 命令传递给调用者
        client.setCommand(lightOn);
        client.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        client.setCommand(garageDoorOpen);
        client.buttonWasPressed();


        RemoteControl control = new RemoteControl();
        LightOffCommand lightOff = new LightOffCommand(light);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        control.setCommand(0,lightOn,lightOff);
        control.setCommand(1,garageDoorOpen,garageDoorClose);

        control.onButtonWasPressed(1);
        control.offButtonWasPressed(1);
        control.unDoButtonWasPressed();
    }
}
