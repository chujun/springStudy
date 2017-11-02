package com.jun.chu.demo.i746methodInjection.command;

/**
 * Created by chujun on 2017/11/2.
 */
public class AsyncCommand implements Command {
    private Object commandState;

    public AsyncCommand() {
    }

    public AsyncCommand(Object commandState) {
        this.commandState = commandState;
    }

    @Override
    public Object execute() {
        System.out.println(this.getClass().getCanonicalName() + ": execute command A:" + commandState);
        return this;
    }

    @Override
    public void setState(Object commandState) {
        this.commandState = commandState;
    }
}
