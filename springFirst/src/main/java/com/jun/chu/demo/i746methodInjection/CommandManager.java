package com.jun.chu.demo.i746methodInjection;

// Spring-API imports
import com.jun.chu.demo.i746methodInjection.command.Command;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by chujun on 2017/11/2.
 */
public class CommandManager implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public Object process(String commandState) {
        // grab a new instance of the appropriate Command
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }

    protected Command createCommand() {
        // notice the Spring API dependency!
        return this.applicationContext.getBean("command", Command.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
