package com.jun.chu.demo.i746methodInjection.command;

/**
 * Created by chujun on 2017/11/2.
 */
public interface Command {
    Object execute();

    void setState(Object commandState);
}
