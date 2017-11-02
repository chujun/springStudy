package com.jun.chu.demo.i746methodInjection;
// no more Spring imports!

import com.jun.chu.demo.i746methodInjection.command.Command;

/**
 * Created by chujun on 2017/11/2.
 */
public abstract class CommandManagerV2 {
    public Object process(Object commandState) {
        // grab a new instance of the appropriate Command interface
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }

    // okay... but where is the implementation of this method?
    protected abstract Command createCommand();
}
