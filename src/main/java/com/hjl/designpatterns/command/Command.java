package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 16:47
 * @description：命令模式
 * @modified By：
 */
public interface Command {
    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
