package com.hjl.designpatterns.command;

/**
 * @author ：hjl
 * @date ：2021/7/4 17:29
 * @description：什么都不做
 * @modified By：
 */
public class NoCommand implements Command{
    /**
     * 执行
     */
    @Override
    public void execute() {

    }

    /**
     * 撤销
     */
    @Override
    public void undo() {

    }
}
