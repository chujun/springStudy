package com.jun.chu.demo.i746methodInjection;

import com.jun.chu.demo.i732instantiatingBeans.ClientService;
import com.jun.chu.demo.i746methodInjection.command.Command;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chujun on 2017/11/2.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        CommandManager commandManager = context.getBean("commandManager", CommandManager.class);

        Command command1 = (Command) commandManager.process("state1");

        Command command2 = (Command) commandManager.process("state2");
        System.out.println(command1 == command2);

        ClientService clientService = context.getBean("clientService", ClientService.class);
        System.out.println(clientService);

        ClientService clientService2 = context.getBean("clientService2", ClientService.class);
        //不同的方法创建bean
        System.out.println(clientService2 == clientService);

    }
}
